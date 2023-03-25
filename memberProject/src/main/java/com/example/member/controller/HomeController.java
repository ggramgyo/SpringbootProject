package com.example.member.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // 기본 페이지 요청하는 Method
    @GetMapping("/")
    public String index(){
        // 기본 주소가 매핑 되면 templates 폴더에서 index.html 찾아감.
        return "index";
    }

}
