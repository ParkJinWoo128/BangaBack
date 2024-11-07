package com.example.firstproject1.repository;

import com.example.firstproject1.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {

}
