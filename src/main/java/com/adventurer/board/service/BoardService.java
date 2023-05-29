package com.adventurer.board.service;

import com.adventurer.board.domain.Board;
import com.adventurer.board.domain.BoardDto;
import com.adventurer.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    // 게시글 생성
    @Transactional
    public void save(BoardDto boardDto){
        Board board = Board.toEntity(boardDto);
        boardRepository.save(board);
    }

    // 게시글 조회
    public List<BoardDto> findAll(){
        List<Board> boardList = boardRepository.findAll();
        List<BoardDto> boardDtoList = new ArrayList<>();
        for(Board board : boardList){
            boardDtoList.add(BoardDto.toDto(board));
        }
        return boardDtoList;
    }

    // 조회수 업데이트
    @Transactional
    public void updateView(Long id){
        boardRepository.updateview(id);
    }

    // controller에서 사용될 findById 메소드
    public BoardDto findById(Long id){
        Optional<Board> optionalBoard = boardRepository.findById(id);
        if(optionalBoard.isPresent()){
            Board board = optionalBoard.get();
            BoardDto boardDto = BoardDto.toDto(board);
            return boardDto;
        }else{
            return null;
        }
    }

}