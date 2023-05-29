package com.adventurer.board.service;

import com.adventurer.board.domain.Comment;

import java.util.List;

public interface CommentService {

    void save(Comment comment);

    Comment findById(Long id) throws Exception;


    List<Comment> findAll();

}
