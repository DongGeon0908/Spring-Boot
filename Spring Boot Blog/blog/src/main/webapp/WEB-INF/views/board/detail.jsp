<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container">

	<button class="btn btn-secondary" onclick="history.back()">돌아가기</button>
	<button id="btn-update" class="btn btn-warning">수정</button>
	<button id="btn-delete" class="btn btn-danger">삭제</button>
	<br /> <br />
	<div>
		<h3>${board.title}</h3>
	</div>
	<hr />
	<div>
		<div>${board.content}</div>
	</div>
	<hr />
</div>

<!-- 
 summernote api를 활용해 글쓰기 창을 만들 수 있음
 summernote에서 알아서 사진, 및 데이터를 디비에 저장할 수 있는 값으로 변환시켜줌 ㅎㅎ
  -->
<script src="/js/board.js"></script>
<%@ include file="../layout/footer.jsp"%>
