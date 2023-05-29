package com.adventurer.board.service;

import com.adventurer.board.domain.Comment;

import java.util.List;

import java.util.ArrayList;
import java.util.List;

public interface CommentService {

    static void save(Comment comment) {
        // 구현 로직
    }

    Comment findById(Long id) throws Exception;

    List<Comment> findAll();
}
