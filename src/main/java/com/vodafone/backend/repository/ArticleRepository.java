package com.vodafone.backend.repository;

import com.vodafone.backend.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Integer> {
}
