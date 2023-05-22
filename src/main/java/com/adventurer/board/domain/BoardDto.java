package com.adventurer.board.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class BoardDto {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createDate;

    // Entity -> Dto
//    public BoardDto(Board board) {
//        this.id = board.getId();
//        this.title = board.getTitle();
//        this.content = board.getContent();
//        this.createDate =board.getCreateDate();
//    }
}
