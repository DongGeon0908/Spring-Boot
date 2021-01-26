<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="layout/header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">

	<c:forEach var="board" items="${boards}">
		<div class="card m-2">
			<!-- <img class="card-img-top" src="img_avatar1.png" alt="Card image">  -->
			<div class="card-body">
				<h4 class="card-title">${board.title}</h4>
				<a href="#" class="btn btn-primary">자세히 보기</a>
			</div>
		</div>
	</c:forEach>

</div>

<%@ include file="layout/footer.jsp"%>
