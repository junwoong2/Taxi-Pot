package com.graduation.taxipot.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MainController {



    @GetMapping("/join")
    public String join(){
        return "join";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/logins")
    public String logins(){
        return "logins";
    }
    @GetMapping("/preview")
    public String preview(){
        return "preview";
    }
}