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

    @Builder
    public Board(Long view, String content, String title, LocalDateTime createDate, List<Comment> comments){
        this.view = view;
        this.content = content;
        this.title = title;
        this.createDate = createDate;
        this.comments = comments;
    }

    public Board toEntity(){
        return Board.builder()
                .view(view)
                .content(content)
                .title(title)
                .createDate(createDate)
                .comments(comments)
                .build();
    }
}

