package com.graduation.taxipot.board.dto;

import com.graduation.taxipot.board.entity.Board;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BoardResponse {
  private Long id;
  private String title;
  private String content;
  private String author;
  private LocalDateTime createdDate;
  private LocalDateTime modifiedDate;

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
