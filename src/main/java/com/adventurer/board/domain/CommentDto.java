package com.adventurer.board.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class CommentDto {
    private Long id;
    private String content;
    private LocalDateTime createDate;

    private Board board;

    // Entity -> Dto
    private CommentDto(Comment comment) {
        this.id = comment.getId();
        this.content = comment.getContent();
        this.createDate = comment.getCreateDate();
        this.board = comment.getBoard();
    }
    public static CommentDto toDto(Comment comment) {
        return new CommentDto(comment);
    }
}
