package com.example.firstproject1.controller;
import com.example.firstproject1.entity.Article;
import com.example.firstproject1.dto.ArticleForm;
import com.example.firstproject1.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @Autowired // 스프링부트가 미리 생성해놓은 객체를 가져다가 자동으로 연결!
    private ArticleRepository articleRepository;

    @GetMapping("/article/new")
    public String newArticle() {
        return "article/new";
    }

    @PostMapping("/article/create")
    public String creteArticle(ArticleForm form) {
        System.out.println(form.toString());

        // 1. Dto 객체를 변환 -> Entity !!
        Article article = form.toEntity();
        System.out.println(article.toString());

        // 2. Repository에게 Entity를 DB안에 저장하게 명령!!
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());
        return "";
    }
}
