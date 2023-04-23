package com.spring.mvc.chap05.entity;

import com.spring.mvc.chap05.dto.BoardSaveRequestDTO;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Board {

  private int boardNo; // 게시글 번호
  private String title; // 제목
  private String content; // 내용
  private int viewCount; // 조회수
  private int regDateTime; // 작성일자시간
  //    private LocalDateTime regDateTime; // 작성일자시간
  private static int seq;

  public Board(String title, String content) {
    this.boardNo = ++seq;
    this.title = title;
    this.content = content;
    this.viewCount = 0;
    this.regDateTime = 0;
  }
  public Board(BoardSaveRequestDTO saveDTO) {
    this.boardNo = ++seq;
    this.title = saveDTO.getTitle();
    this.content = saveDTO.getContent();
    this.viewCount = 0;
    this.regDateTime = 0;
  }
}
