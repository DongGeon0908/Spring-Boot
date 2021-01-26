<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container">
	<form>
		<div class="form-group">
			<label for="title">Title</label> 
			<input type="text" class="form-control" placeholder="Enter title" id="title">
		</div>
		<div class="form-group">
			<label for="content">Content</label>
			<textarea class="form-control summernote" rows="5" id="content"></textarea>
		</div>
	</form>
	<button id="btn-save" class="btn btn-primary">글쓰기 완료</button>
</div>

<script>
      $('.summernote').summernote({
        tabsize: 2,
        height: 300
      });
 </script>
 <!-- 
 summernote api를 활용해 글쓰기 창을 만들 수 있음
 summernote에서 알아서 사진, 및 데이터를 디비에 저장할 수 있는 값으로 변환시켜줌 ㅎㅎ
  -->
<script src ="/js/board.js"></script>
<%@ include file="../layout/footer.jsp"%>
