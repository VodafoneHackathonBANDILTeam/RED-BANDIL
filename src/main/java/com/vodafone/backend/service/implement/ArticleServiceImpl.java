package com.vodafone.backend.service.implement;

import com.vodafone.backend.entity.Article;
import com.vodafone.backend.repository.ArticleRepository;
import com.vodafone.backend.service.interfaces.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService {
    private ArticleRepository articleRepository;
    @Autowired
    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    @Override
    public Optional<Article> findById(int id) {
        return articleRepository.findById(id);
    }

    @Override
    public Article createArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public void deleteArticle(int id) {
        articleRepository.deleteById(id);
    }
}
