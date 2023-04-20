package com.spring.mvc.chap05.repository;

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
  private static int seq;

  static {
    boardMap = new HashMap<>();
    Board b1 = new Board(1, "초 깔끔한맛 진로", "제로슈가 다이어트 할 때 먹어도되용", 0, 1);
    Board b2 = new Board(2, "오늘처럼 처음처럼", "나한텐 너무 쓴 처음처럼", 0, 1);
    Board b3 = new Board(3, "이슬만 먹어요 참이슬", "달달구리 참이슬 살쪄", 0, 1);

    boardMap.put(b1.getBoardNo(), b1);
    boardMap.put(b2.getBoardNo(), b2);
    boardMap.put(b3.getBoardNo(), b3);
  }

  @Override
  public List<Board> findAll() {
    return boardMap.values()
        .stream()
        .collect(toList());
  }

  @Override
  public Board findOne(int boardNo) {
    return null;
  }

  @Override
  public boolean save(Board board) {
    return false;
  }

  @Override
  public boolean deleteByNo(int boardNo) {
    return false;
  }
}
