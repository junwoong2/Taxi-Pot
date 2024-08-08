package com.graduation.taxipot.board.service;

import com.graduation.taxipot.board.dto.BoardRequest;
import com.graduation.taxipot.board.dto.BoardResponse;
import com.graduation.taxipot.board.entity.Board;
import com.graduation.taxipot.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BoardService {

  private final BoardRepository boardRepository;

  public Long save(BoardRequest dto) {
    Board board = Board.builder()
        .title(dto.getTitle())
        .content(dto.getContent())
        .author(dto.getAuthor())
        .build();
    return boardRepository.save(board).getId();
  }

  public List<BoardResponse> findAll() {
    return boardRepository.findAll().stream()
        .map(BoardResponse::fromEntity)
        .collect(Collectors.toList());
  }

  public BoardResponse findById(Long id) {
    Board board = boardRepository.findById(id)
        .orElseThrow(() -> new IllegalArgumentException("게시글을 찾을 수 없습니다."));
    return BoardResponse.fromEntity(board);
  }

  public void delete(Long id) {
    boardRepository.deleteById(id);
  }
}
