package com.graduation.taxipot.board.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardRequest {
  private String title;
  private String content;
  private String author;
}
