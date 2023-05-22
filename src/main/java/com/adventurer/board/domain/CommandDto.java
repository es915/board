package com.adventurer.board.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class CommandDto {
    private Long id;
    private String content;
    private LocalDateTime createDate;

    // Entity -> Dto
    public CommandDto(Comment comment) {
        this.id = comment.getId();
        this.content = comment.getContent();
        this.createDate = comment.getCreateDate();
    }
}
