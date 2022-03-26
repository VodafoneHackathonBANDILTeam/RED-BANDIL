package com.vodafone.backend.service.interfaces;

import com.vodafone.backend.entity.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentService {
    List<Comment> findAll();
    Optional<Comment> findById(int id);
    Comment createComment(Comment comment);
    void delete(int id);
}
