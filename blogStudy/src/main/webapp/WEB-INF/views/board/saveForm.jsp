<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>


<div class="container">
	<form>
		<div class="form-group">
			<label for="username">Title:</label> <input type="text"
				class="form-control" placeholder="Enter Title" id="title">
		</div>
		<div class="form-group">
			<label for="comment">Content:</label>
			<textarea class="form-control summernote" rows="5" id="content"></textarea>
		</div>
	</form>
		<button id="btn-save" class="btn btn-primary">글쓰기완료</button>
</div>

<script>
      $('.summernote').summernote({
        placeholder: '안녕하세요!',
        tabsize: 2,
        height: 400
      });
</script>

<script src="/js/board.js"></script>
<%@ include file="../layout/footer.jsp"%>

