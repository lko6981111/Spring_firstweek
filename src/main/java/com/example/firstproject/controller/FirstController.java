package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller//컨트롤러임을 선언하는 어노테이션, 1.컨트롤러 선언
public class FirstController {
    @GetMapping("/hi")//2.url 요청 접수
    public String niceToMeetYou(Model model){//3.메서드 수행,4.모델 객체 가져오기
        model.addAttribute("username","창석");//5.모델 변수 등록
        return "greetings";//6.greetings.mustache 파일 반환
    }

    @GetMapping("/bye")//1.url 요청 접수
    public String seeYouNext(Model model){//2. 메서드 작성
        model.addAttribute("nickname","이창석");
        return "goodbye";//3. goodbye.mustache 반환
    }
}
