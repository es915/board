package com.adventurer.board.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long id;

    @Column
    private Long view;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private LocalDateTime createDate;

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> comments;

    public static Board createBoard(Long view, String content, String title, LocalDateTime createDate, List<Comment> comments){
        Board board = new Board();
        board.view = view;
        board.content = content;
        board.title = title;
        board.createDate = createDate;
        board.comments = comments;
        return board;
    }

    public Board toEntity(Board board){
        this.view = board.getView();
        this.content = board.getContent();
        this.title = board.title;
        this.createDate = board.createDate;
        this.comments = board.comments;
        return this;
    }
}

