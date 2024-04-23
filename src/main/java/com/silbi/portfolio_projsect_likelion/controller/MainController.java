package com.silbi.portfolio_projsect_likelion.controller;


// 확인을 하기 위해서 사용하는 컨트롤러 클래스

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MainController {

    @GetMapping("/")
    public String mainPage() {
        return "main";
    }
}
