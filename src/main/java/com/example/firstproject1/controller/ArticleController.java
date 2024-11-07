package com.example.firstproject1.controller;
import com.samskivert.mustache.Mustache;
import dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @GetMapping("/article/new")
    public String newArticleForm() {
        return "article/new";
    }

    @PostMapping("/article/create")
    public String createAticle() {
        System.out.println(form.toString());
        return "";
    }
}
