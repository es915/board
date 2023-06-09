package com.adventurer.board.controller;

import com.adventurer.board.domain.Board;
import com.adventurer.board.domain.BoardDto;
import com.adventurer.board.repository.BoardRepository;
import com.adventurer.board.repository.CommentRepository;
import com.adventurer.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;
    private final CommentRepository commentRepository;


    // 초기화면, 게시물 전체 조회
    @GetMapping("/")
    public String main(Model model) {
        List<BoardDto> list = boardService.findAll();
        model.addAttribute("list", list);
        return "main";
    }

    // 게시물 생성 화면
    @GetMapping("/board/create")
    public String getBoardCreate() {
        return "board/create";
    }

    @PostMapping("/board/create")
    public String postBoardCreate(BoardDto boardDto) {
        boardService.save(boardDto);
        return "redirect:/";
    }


}
