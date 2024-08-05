package com.graduation.taxipot.board.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardRequest {
  private String title; // 제목
  private String content; // 글
  private String author; // 작성자

}
