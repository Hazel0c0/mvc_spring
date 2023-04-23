package com.spring.mvc.chap05.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

//@RequiredArgsConstructor // final만 골라서 초기화
@Getter
@ToString
@EqualsAndHashCode
public class BoardSaveRequestDTO {
  private final String title; // 제목
  private final String content; // 내용

  public BoardSaveRequestDTO(String title, String content) {
    this.title = title;
    this.content = content;
  }
}
