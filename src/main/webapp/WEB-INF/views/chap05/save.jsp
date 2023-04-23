<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>

  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Single+Day&display=swap" rel="stylesheet">

  <!-- reset -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/reset-css@5.0.1/reset.min.css">

  <!-- fontawesome css: https://fontawesome.com -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css">

  <link rel="stylesheet" href="/assets/css/main.css">
  <link rel="stylesheet" href="/assets/css/list.css">
</head>

<body>

<div id="wrap">

  <div class="main-title-wrapper">
    <h1 class="main-title">새 글 쓰기</h1>
  </div>
  <div class="card-container">
    <div class="card-wrapper">
      <form action="/card/write" method="POST">
        <section class="card">
          <div class="card-title-wrapper">
            <h2 class="card-title">
              <input type="text" name="title">
            </h2>
            <div class="time-view-wrapper">
              <div class="time"><i class="far fa-clock"></i>2023-04-14 12:50</div>
              <div class="view">
                <i class="fas fa-eye"></i>
                <span class="view-count">0</span>
              </div>
            </div>
          </div>
          <div class="card-content">
            <p>
              <input type="text" name="content">
            </p>
          </div>
        </section>
        <div class="card-btn-group">
          <label>
            <button type="submit">추가하기</button>
            <button type="button" onclick="history.back()">이전으로</button>          </label>
        </div>
      </form>
    </div>
  </div>
</div>
</body>

</html>