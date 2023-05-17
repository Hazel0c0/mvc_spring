package com.spring.mvc.chap05.dto;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Builder
@Getter @ToString
@EqualsAndHashCode
public class AutoLoginDTO {
  private String sessionId;
  private LocalDateTime limitTime;
  private String account;
}
