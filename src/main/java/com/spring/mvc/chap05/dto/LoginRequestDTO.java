package com.spring.mvc.chap05.dto;

import lombok.*;

@Setter @Getter
@NoArgsConstructor
// getter는 선택
@ToString
@EqualsAndHashCode
public class LoginRequestDTO {
  private String account;
  private String password;
  private boolean autoLogin; //자동로그인 체크 여부

}
