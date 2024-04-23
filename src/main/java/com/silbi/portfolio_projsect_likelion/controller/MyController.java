package com.silbi.portfolio_projsect_likelion.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MyController {
    @GetMapping("/mypage")
    public String myPage() {
        return "my";
    }
}
