package com.example.firstproject1.controller;
import com.samskivert.mustache.Mustache;
import dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @GetMapping("/articles/new")
    public String newArticle() {
        return "articles/new";
    }

    @PostMapping("/article/create")
    public String creteArticle() {
        return "";
    }
}
