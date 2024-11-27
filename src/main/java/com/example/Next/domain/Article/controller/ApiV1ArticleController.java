package com.example.Next.domain.Article.controller;

import com.example.Next.domain.Article.entity.Article;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/articles")
public class ApiV1ArticleController {
    @GetMapping("")
    public List<Article> list() {
        List<Article> articles = new ArrayList<Article>();
        Article article = Article.builder()
                .title("제목")
                .content("내용")
                .build();
        for (int i = 0; i < 10; i++) {
            articles.add(article);
        }
        return articles;
    }

    @GetMapping("/{id}")
    public Article article(@PathVariable(value = "id")Long id) {
        Article article = Article.builder()
                .title("제목" + id)
                .content("내용")
                .build();
        return article;
    }
}
