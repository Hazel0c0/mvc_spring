package com.spring.mvc.chap05_me.repository;

import com.spring.mvc.chap05_me.entity.Board;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoardRepositoryImplTest {
  BoardRepositoryImpl br=new BoardRepositoryImpl();
  @Test
  @DisplayName("저장소에는 3개의 데이터가 있다")
  void findAllTest() {
    List<Board> bList=br.findAll();
    assertEquals(3, bList.size());
    System.out.println(bList);
  }
}