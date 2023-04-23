package com.spring.mvc.chap05.repository;

import com.spring.mvc.chap04.entity.Score;
import com.spring.mvc.chap05.dto.BoardSaveRequestDTO;
import com.spring.mvc.chap05.entity.Board;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

@Repository
public class BoardRepositoryImpl
    implements BoardRepository {

  private final static Map<Integer, Board> boardMap;

  static {
    boardMap = new HashMap<>();
    Board b1 = new Board("초 깔끔한맛 진로", "제로슈가 다이어트 할 때 먹어도되용");
    Board b2 = new Board(new BoardSaveRequestDTO("오늘처럼 처음처럼", "나한텐 너무 쓴 처음처럼"));
    Board b3 = new Board(new BoardSaveRequestDTO("이슬만 먹어요 참이슬", "달달구리 참이슬 살쪄"));

    boardMap.put(b1.getBoardNo(), b1);
    boardMap.put(b2.getBoardNo(), b2);
    boardMap.put(b3.getBoardNo(), b3);
  }

  @Override
  public List<Board> findAll() {
    return boardMap.values()
        .stream()
        .sorted(comparing(Board::getBoardNo))
        .collect(toList());
  }

  // 원하는 해당 게시판 검색
  @Override
  public Board findOne(int boardNo) {
    return boardMap
        .values()
        .stream()
        .filter(s->s.getBoardNo()==boardNo)
        .findFirst().get();
  }

  @Override
  public boolean save(Board board) {
    if (boardMap.containsKey(board.getBoardNo())) return false;

    boardMap.put(board.getBoardNo(), board);
    return true;
  }

  @Override
  public boolean deleteByNo(int boardNo) {
    if (!boardMap.containsKey(boardNo)) return false;

    boardMap.remove(boardNo);
    return true;
  }
}
