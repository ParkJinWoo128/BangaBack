package com.example.firstproject1.controller;
import ch.qos.logback.classic.Logger;
import com.example.firstproject1.entity.Article;
import com.example.firstproject1.dto.ArticleForm;
import com.example.firstproject1.repository.ArticleRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ArticleController {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(ArticleController.class);
    @Autowired // 스프링부트가 미리 생성해놓은 객체를 가져다가 자동으로 연결!
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticle() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String creteArticle(ArticleForm form) {
        log.info(form.toString());

        // 1. Dto 객체를 변환 -> Entity !!
        Article article = form.toEntity();
        System.out.println(article.toString());

        // 2. Repository에게 Entity를 DB안에 저장하게 명령!!
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());
        return "";
    }




    @GetMapping("/articles/{id}")
    public String show(@PathVariable Long id, Model model) {
        log.info("id = " + id);

        // 1. id로 데이터를 가져옴.
        Article articleEntity = articleRepository.findById(id).orElse(null);

        // 2. 가져온 데이터를 모델에 등록함.
        model.addAttribute("articles", articleEntity);

        // 3. 보여줄 페이지를 결정!
        return "articles/show";
    }
}

