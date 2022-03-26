package com.vodafone.backend.service.interfaces;


import com.vodafone.backend.entity.Article;

import java.util.List;
import java.util.Optional;

public interface ArticleService {
    List<Article> findAll();
    Optional<Article> findById(int id);
    Article createArticle(Article article);
    void deleteArticle(int id);
}
