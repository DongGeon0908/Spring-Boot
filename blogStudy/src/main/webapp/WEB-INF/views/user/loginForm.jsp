<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>


<div class="container">
	<form action ="/auth/loginProc" method="post">
		<div class="form-group">
			<label for="username">Username:</label> <input type="text"
				name="username" class="form-control" placeholder="Enter Username" id="username">
		</div>
		<div class="form-group">
			<label for="pwd">Password:</label> <input type="password"
				name="password" class="form-control" placeholder="Enter password" id="password">
		</div>
		<div class="form-group form-check">
			<label class="form-check-label"> <input
				name="remember" class="form-check-input" type="checkbox"> Remember me
			</label>
		</div>
		<button id="btn-login" class="btn btn-primary">Login</button>
		<a href="https://kauth.kakao.com/oauth/authorize?client_id=eec07613d4f1977b466e5a6b3834fbd9&redirect_uri=http://localhost:8000/auth/kakao/callback&response_type=code"><img height="38px" src="/image/kakao_login_button.png"/></a>
	</form>
</div>
<!-- 
<script src="/js/user.js"></script>
-->
<%@ include file="../layout/footer.jsp"%>

