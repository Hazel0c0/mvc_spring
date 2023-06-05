package com.spring.mvc.util;

import com.spring.mvc.chap05.dto.response.LoginUserResponseDTO;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.net.http.HttpClient;

// 회원 인증 인가 관련 상수와 메서드를 가진 객체
public class LoginUtil {

  // 로그인 세션 키
  public static final String LOGIN_KEY = "login";
  public static final String AUTO_LOGIN_COOKIE = "auto";

  // 로그인 여부 확인  : 범용으로 쓰게 static 로그인을 했는지 알려면 세션 받아오기
  public static boolean isLogin(HttpSession session) {
    return session.getAttribute(LOGIN_KEY) != null;
  }

  // 자동 로그인 여부 확인
  public static boolean isAutoLogin(HttpServletRequest request) {
    return WebUtils.getCookie(request, AUTO_LOGIN_COOKIE) != null;
  }

  // 로그인한 사람의 계정명을 반환하는 메서드
  public static String getCurrentLoginMemberAccount(HttpSession session) {
    // Object -> LoginUserResponseDTO 다운캐스팅 필요
    LoginUserResponseDTO loginUserInfo = (LoginUserResponseDTO) session.getAttribute(LOGIN_KEY);
    return loginUserInfo.getAccount();
  }

  // 관리자인지 확인해주는 메서드
  public static boolean isAdmin(HttpSession session){
    LoginUserResponseDTO loginuser
        = (LoginUserResponseDTO) session.getAttribute(LOGIN_KEY);
    return loginuser.getAuth().equals("ADMIN");
  }
  // 내가 쓴 게시물인지 화인해주는 메서드
  // 로그인한 사람 계정명과 실제 게시물 계정명
  public static boolean isMine(HttpSession session, String targetAccount) {
    return targetAccount.equals(getCurrentLoginMemberAccount(session));
  }

}