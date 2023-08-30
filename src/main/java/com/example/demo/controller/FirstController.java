package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi") //URL 요청 접수
    public String niceToMeetYou(Model model){
        model.addAttribute("username", "hongpark");
        return "greetings"; //greetings.mustache 파일 반환
    }

    @GetMapping("/bye") //URL 요청 접수
    public String seeYouNext(Model model){
        model.addAttribute("nickname", "hongpark");
        return "goodbye"; //greetings.mustache 파일 반환
    }
}
