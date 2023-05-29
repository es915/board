package com.adventurer.board.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class BoardDto {
    private Long id;
    private Long view;
    private String title;
    private String content;
    private LocalDateTime createDate;
    private List<Comment> comments;

    // Entity -> Dto
    public static BoardDto toDto(Board board) {
        return new BoardDto(board);
    }

    private BoardDto(Board board) {
        this.id = board.getId();
        this.view = board.getView();
        this.title = board.getTitle();
        this.content = board.getContent();
        this.createDate = board.getCreateDate();
        this.comments = board.getComments();
    }
}
