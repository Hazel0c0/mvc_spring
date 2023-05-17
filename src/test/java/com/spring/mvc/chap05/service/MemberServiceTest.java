package com.spring.mvc.chap05.service;

import com.spring.mvc.chap05.dto.LoginRequestDTO;
import com.spring.mvc.chap05.dto.SignUpRequestDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MemberServiceTest {

  @Autowired
  MemberService memberService;

  @Test
  @DisplayName("SighupDTO를 전달하면 회원가입에 성공해야 한다")
  void joinTest(){
    // given
    SignUpRequestDTO dto = new SignUpRequestDTO();
    dto.setAccount("gogogoo");
    dto.setPassword("asdf1111");
    dto.setName("구구");
    dto.setEmail("aaa@eee.rrr");
    // when
    memberService.join(dto, savePath);
  }

  @Test
  @DisplayName("계정명이 abc1234인 회원의 로그인시도 결과 검증을 " +
      "상황별로 수행해야 한다.")
  void loginTest() {
    //given
    LoginRequestDTO dto = new LoginRequestDTO();
    dto.setAccount("qwer1234");
    dto.setPassword("qwer1234!");

    //when
    LoginResult result = memberService.authenticate(dto);

    //then
    assertEquals(LoginResult.SUCCESS, result);
  }
}