package com.adventurer.board.service;

import com.adventurer.board.domain.Comment;
import com.adventurer.board.domain.CommentDto;
import com.adventurer.board.repository.BoardRepository;
import com.adventurer.board.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    public void save(CommentDto commentDto) {
        Comment comment = Comment.toEntity(commentDto);
        commentRepository.save(comment);
    }

    public Comment findById(Long id) {
        Optional<Comment> comment = commentRepository.findById(id);
        if (comment.isPresent()) {
            return comment.get();
        } else {
            // 예외 처리
            return comment.get();
        }
    }

    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

}
