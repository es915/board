package com.adventurer.board.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table (name ="Comments")
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content; // 댓글 내용

    private LocalDateTime createDate;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;

<<<<<<< HEAD:src/main/java/com/adventurer/board/domain/CommentsEntity.java
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // 작성자
}

=======
    // dto -> entity
    public static Comment toEntity(CommentDto commentDto) {
        return new Comment(commentDto);
    }
    private Comment(CommentDto commentDto) {
        this.id = commentDto.getId();
        this.content = commentDto.getContent();
        this.createDate = commentDto.getCreateDate();
        this.board = commentDto.getBoard();
    }
}
>>>>>>> 2a88ad7e39641cf03d67f1fd445fd17e79eddae7:src/main/java/com/adventurer/board/domain/Comment.java
