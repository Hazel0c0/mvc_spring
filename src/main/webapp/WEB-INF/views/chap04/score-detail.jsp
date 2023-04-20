<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>

</head>

<body>
<form action="/score/detail" method="GET">
  <div class="box">

    <h1>${s.name}님 성적 정보</h1>
    <ul>
      <li># 국어: ${s.kor}점</li>
      <li># 영어: ${s.eng}점</li>
      <li># 수학: ${s.math}점</li>
      <li># 총점: ${s.total}점</li>
      <li># 평균: ${s.average}점</li>
      <li># 학점: ${s.grade}</li>
    </ul>

    <a class="del-btn" href="/score/list">목록</a>
    <a class="del-btn" href="/score/modify?stuNum=${s.stuNum}">수정하기</a>
  </div>
</form>
</body>
<script>

</script>
</html>