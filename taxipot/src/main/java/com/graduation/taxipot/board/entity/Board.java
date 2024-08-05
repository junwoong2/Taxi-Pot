package com.graduation.taxipot.board.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "board")
public class Board {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String title;

  @Column(nullable = false, columnDefinition = "TEXT")
  private String content;

  @Column(nullable = false)
  private String author;

  @Column(nullable = false)
  private LocalDateTime createdDate;

  @Column(nullable = false)
  private LocalDateTime modifiedDate;

  @PrePersist
  public void prePersist() {
    createdDate = LocalDateTime.now();
    modifiedDate = LocalDateTime.now();
  }


  @PreUpdate
  public void preUpdate() {
    modifiedDate = LocalDateTime.now();
  }
}
