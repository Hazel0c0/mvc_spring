package com.spring.mvc.chap05.service;

import com.spring.mvc.chap05.dto.BoardSaveRequestDTO;
import com.spring.mvc.chap05.entity.Board;
import com.spring.mvc.chap05.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    // 중간처리 기능 자유롭게 사용

    // 모든 목록 찾기
    public List<Board> findAll(){
        return boardRepository.findAll();
    }

    public Board findOne(int boardNo) {
        return boardRepository.findOne(boardNo);
    }
    public boolean save(BoardSaveRequestDTO boardDTO) {
        boardRepository.save(new Board(boardDTO));
        return false;
    }
}
