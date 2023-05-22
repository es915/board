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
//    public CommandDto(Command command) {
//        this.id = board.getId();
//        this.content = board.getContent();
//        this.createDate = board.getCreateDate();
//    }
}
