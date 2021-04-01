<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>


<div class="container">
	<form>
	<input type="hidden" id="id" value="${board.id}"/>
		<div class="form-group">
			<input value ="${board.title}" type="text"
				class="form-control" placeholder="Enter Title" id="title">
		</div>
		<div class="form-group">
			<textarea class="form-control summernote" rows="5" id="content">${board.content}</textarea>
		</div>
	</form>
		<button id="btn-update" class="btn btn-primary">글수정완료</button>
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

