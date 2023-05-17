<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
  <style>
    .upload-box {
        width: 150px;
        height: 150px;
        border: 3px dashed  orange;
        display: flex;
        justify-content: center;
        align-items: center;
        color: red;
        font-weight: 700;
        cursor: pointer;
    }
    #img-input {
        display: none;
    }
  </style>
</head>
<body>

<h1>파일 업로드 예제</h1>

<div class="upload-box">파일 첨부</div>

<%-- get으로 보낼 수 없음--%>
<form action="/upload-file" method="post" enctype="multipart/form-data">
<%--  multipart/form-data : 일반적인 텍스트 + 첨부파일도 보낼거다 --%>
  <input id="img-input" type="file" name="thumbnail" accept="image/*" >
<%--  multiple 하면 개수 제한이 없어짐
      -> 여러개 받고 싶으면 input을 여러개 만들기--%>
  <button type="submit">전송</button>
</form>
<script>

  const $box=document.querySelector('.upload-box')
  const $input=document.getElementById('img-input')
  $box.onclick=e=>{
      $input.click();
  }
</script>
</body>
</html>
