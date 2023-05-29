package com.adventurer.board.controller;

import com.adventurer.board.repository.BoardRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BoardController {



    @GetMapping("/")
    public String main(Model model) {
        // model.addAllAttribute("list", /* board list */);
        return "main";
    }
//
//    @GetMapping("/board/{id}")
//    public String board(@PathVariable Long id) {
//
//    }

}
