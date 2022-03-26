package com.vodafone.backend.api.controller;

import com.vodafone.backend.entity.Article;
import com.vodafone.backend.service.interfaces.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/articles/")
public class ArticlesController {
    private ArticleService articleService;

    @Autowired
    public ArticlesController(ArticleService articleService) {
        this.articleService = articleService;
    }
    @GetMapping("findall")
    public List<Article> findAll(){
        return articleService.findAll();
    }
    @GetMapping("findbyid/{id}")
    public Optional<Article> findById(@PathVariable int id){
        return articleService.findById(id);
    }
    @PostMapping("add")
    public Article createArticle(@RequestBody Article article){
        return articleService.createArticle(article);
    }
    @DeleteMapping("delete")
    public void  deleteArticle(int id){
        articleService.deleteArticle(id);
    }

}
