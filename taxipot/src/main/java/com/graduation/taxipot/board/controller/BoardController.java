package com.graduation.taxipot.board.controller;

import com.graduation.taxipot.board.dto.BoardRequest;
import com.graduation.taxipot.board.dto.BoardResponse;
import com.graduation.taxipot.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Controller
public class BoardController {

  private final BoardService boardService;

  @GetMapping("/board")
  public String list(Model model) {
    model.addAttribute("postList", boardService.findAll());
    return "list";
  }

  @GetMapping("/board/post")
  public String postForm() {
    return "post";
  }

  @PostMapping("/board/post")
  public String post(BoardRequest boardRequest) {
    boardService.save(boardRequest);
    return "redirect:/board"; // 글쓰기 완료 후 목록으로 리디렉션
  }

  @PostMapping("/board/delete")
  public String delete(@RequestParam Long id) {
    boardService.delete(id);
    return "redirect:/board"; // 삭제 후 목록으로 리디렉션
  }

  @GetMapping("/board/{id}")
  public String view(@PathVariable Long id, Model model) {
    BoardResponse boardResponse = boardService.findById(id);
    model.addAttribute("post", boardResponse);
    return "view";
  }
}
