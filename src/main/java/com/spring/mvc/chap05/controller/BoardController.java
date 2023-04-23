package com.spring.mvc.chap05.controller;

import com.spring.mvc.chap05.dto.BoardSaveRequestDTO;
import com.spring.mvc.chap05.entity.Board;
import com.spring.mvc.chap05.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/card")
public class BoardController {

    private final BoardService boardService;

    // 목록 조회 요청
    @GetMapping("/list")
    public String list(Model model) {
        System.out.println("/card/list : GET!");

        List<Board> boardList = boardService.findAll();
        model.addAttribute("bList",boardList);

        return "chap05/list";
    }
    @GetMapping("/findCard")
    public String findOne(int boardNo){
        System.out.println("/card/findOne : GET!");
        Board findCard = boardService.findOne(boardNo);
        return "redirect:/card/list";
    }

    // 게시글 하나 상세보기
    @PostMapping("/write")
    public String save(BoardSaveRequestDTO boardDTO) {
        System.out.println("/card/write : POST!");

        boardService.save(boardDTO);
        return "chap05/save";
    }
}
