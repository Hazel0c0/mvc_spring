package com.spring.mvc.chap05.repository;

import com.spring.mvc.chap05.entity.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberMapper {
  // 회원 가입
  // insert - ? 채워줄 값 - para
  boolean save(Member member);

  // 회원 정보 조회
  Member findMember(String account);

  // 중복 체크(account, email) 기능
  /*
     SELECT count(*)
     FROM tbl_member
     WHERE account = ?
     -> 중복되면 count =1 / 없으면 0
   */
  int isDuplicate(
      @Param("type") String type,
      @Param("keyword") String keyword);
  // 마이바티스 버전에 따라서 ^ 파람 구분 못하면 직접 써주기
  // type : 어떤 검사 할 건지
}
