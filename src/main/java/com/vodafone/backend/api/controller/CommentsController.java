package com.vodafone.backend.api.controller;

import com.vodafone.backend.entity.Comment;
import com.vodafone.backend.service.interfaces.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api/comments/")
@RestController
public class CommentsController {
    private CommentService commentService;
    @Autowired
    public CommentsController(CommentService commentService) {
        this.commentService = commentService;
    }
    @GetMapping("findall")
    public List<Comment> findAll(){
        return commentService.findAll();
    }
    @GetMapping("findbyid/{id}")
    public Optional<Comment> findById(@PathVariable int id){
        return commentService.findById(id);
    }
    @PostMapping("add")
    public Comment createComment(Comment comment){
        return commentService.createComment(comment);
    }
    @DeleteMapping("delete/{id}")
    public void deleteComment(@PathVariable int id){
        commentService.delete(id);
    }
}
