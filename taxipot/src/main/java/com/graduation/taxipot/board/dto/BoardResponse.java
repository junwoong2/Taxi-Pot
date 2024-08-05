package com.graduation.taxipot.board.dto;

import com.graduation.taxipot.board.entity.Board;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Setter
@Getter
public class BoardResponse {
  private Long id;
  private String title;
  private String content;
  private String author;
  private LocalDateTime createdDate;  // 생성
  private LocalDateTime modifiedDate;   // 수정

  public static BoardResponse fromEntity(Board board) {
    BoardResponse response = new BoardResponse();
    response.id = board.getId();
    response.title = board.getTitle();
    response.content = board.getContent();
    response.author = board.getAuthor();
    response.createdDate = board.getCreatedDate();
    response.modifiedDate = board.getModifiedDate();
    return response;
  }

}