package com.example.firstproject1.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou1(Model model) {
        model.addAttribute("username", "장발장"); // username 에다 장발장을 담아서 뷰 템플릿을 호출할건데 있으면 장발장을 넣어라
        return "greetings";
    }

    @GetMapping("/bye")
    public String niceToMeetYou2(Model model) {
        model.addAttribute("username", "장발장"); // username 에다 장발장을 담아서 뷰 템플릿을 호출할건데 있으면 장발장을 넣어라
        return "goodbye";
    }
}