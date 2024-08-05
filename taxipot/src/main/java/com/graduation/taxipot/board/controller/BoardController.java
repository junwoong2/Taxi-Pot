package com.graduation.taxipot.board.controller;

import com.graduation.taxipot.board.dto.BoardRequest;
import com.graduation.taxipot.board.dto.BoardResponse;
import com.graduation.taxipot.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardController {

  @GetMapping("/board")
  public ModelAndView list() {
    ModelAndView mav = new ModelAndView("list");
    return mav;
  }
  @GetMapping("/board/post")
  public ModelAndView post() {
    ModelAndView mav = new ModelAndView("post");
    return mav;
  }
}
  /**
   *
   * @PostMapping
  public ResponseEntity<Long> createBoard(@RequestBody BoardRequest boardRequest) {
    Long id = boardService.save(boardRequest);
    return ResponseEntity.ok(id);
  }

  @GetMapping
  public ResponseEntity<List<BoardResponse>> getAllBoards() {
    List<BoardResponse> boards = boardService.findAll();
    return ResponseEntity.ok(boards);
  }

  @GetMapping("/{id}")
  public ResponseEntity<BoardResponse> getBoardById(@PathVariable Long id) {
    BoardResponse board = boardService.findById(id);
    return ResponseEntity.ok(board);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Void> updateBoard(@PathVariable Long id, @RequestBody BoardRequest boardRequest) {
    boardService.update(id, boardRequest);
    return ResponseEntity.ok().build();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteBoard(@PathVariable Long id) {
    boardService.delete(id);
    return ResponseEntity.ok().build();
  }
}
   **/
