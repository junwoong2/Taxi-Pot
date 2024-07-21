package com.graduation.taxipot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
  @GetMapping("/")
  public String index(){
    System.out.println("HomeController.index");
    return "index"; // Test 삭제 할것(JJ)
  }
}
