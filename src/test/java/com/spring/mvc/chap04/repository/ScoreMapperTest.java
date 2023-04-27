package com.spring.mvc.chap04.repository;

import com.spring.mvc.chap04.dto.ScoreRequestDTO;
import com.spring.mvc.chap04.entity.Score;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ScoreMapperTest {

  @Autowired
  ScoreMapper mapper;

  @Test
  @DisplayName("마이바티스 매퍼로 사람정보 전체조회에 성공해야 한다.")
  void findAllTest() {
    //given

    // when
    List<Score> scoreList = mapper.findAll("num");
    //then
    for (Score s : scoreList) {
    System.out.println(s);
  }
  assertEquals(3, scoreList.size());
}

  @Test
  @DisplayName("마이바티스 매퍼로 사람정보 저장에 성공해야 한다.")
  void saveTest() {
    //given
    ScoreRequestDTO s = ScoreRequestDTO.builder()
        .name("김마사")
        .kor(55)
        .eng(66)
        .math(22)
        .build();
    Score ss = new Score(s);
    // when
    boolean flag = mapper.save(ss);

    //then
    assertTrue(flag);
  }
}