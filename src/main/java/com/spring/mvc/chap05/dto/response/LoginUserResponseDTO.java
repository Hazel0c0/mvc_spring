package com.spring.mvc.chap05.dto.response;

import lombok.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Setter @Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginUserResponseDTO {
  private String account;
  private String nickName;
  private String email;
  private String auth;
  private String profile;

}
