let index = {
	init: function() {
		$("#btn-save").on("click", () => {
			this.save();
		});

		$("#btn-delete").on("click", () => {
			this.deleteById();
		});
		/*
		$("#btn-login").on("click", () => {
			this.login();
		});
		*/
	},

	/* function(){}을 쓰지 않은 이유
	()=>{} this를 바인딩 하기 위해서!!
	*/

	save: function() {
		//alert('user의 save함수 호출됨');
		let data = {
			title: $("#title").val(),
			content: $("#content").val()
		};
		// console.log(data)

		// ajax 통신을 이용해서 3개의 데이터를 json으로 변경해 insert 요청
		// ajax 호출시 default가 비동기 호출
		// ajax가 통신을 성공하고 서버가 json을 리턴해주면 자동으로 자바 오브젝트를 변환해줌
		$.ajax({
			// 회원가입 수행 요청
			type: "POST",
			url: "/api/board",
			data: JSON.stringify(data), // http body 데이터
			contentType: "application/json; charset=utf-8", // body 데이터가 어떤 타입인지(MIME)
			dataType: "json" // 요청을 서버로해서 응답이 왔을 때 기본적으로 모든 것이 문자열 (생긴게 JSON이라면) => javascript object로 변환
		}).done(function(resp) {
			// 회원가입 수행 성공
			alert("글쓰기가 완료되었습니다!");
			console.log(resp);
			//alert(resp);
			location.href = "/";
		}).fail(function() {
			// 회원가입 수행 실패
			alert(JSON.stringify(error));
		});
	},

	deleteById: function() {
		var id = $("#id").text();

		// ajax 통신을 이용해서 3개의 데이터를 json으로 변경해 insert 요청
		// ajax 호출시 default가 비동기 호출
		// ajax가 통신을 성공하고 서버가 json을 리턴해주면 자동으로 자바 오브젝트를 변환해줌
		$.ajax({
			// 회원가입 수행 요청
			type: "DELETE",
			url: "/api/board/" + id,
			dataType: "json" // 요청을 서버로해서 응답이 왔을 때 기본적으로 모든 것이 문자열 (생긴게 JSON이라면) => javascript object로 변환
		}).done(function(resp) {
			// 회원가입 수행 성공
			alert("삭제가 완료되었습니다!");
			console.log(resp);
			//alert(resp);
			location.href = "/";
		}).fail(function() {
			// 회원가입 수행 실패
			alert(JSON.stringify(error));
		});
	}

	/*
	login: function() {
		//alert('user의 save함수 호출됨');
		let data = {
			username: $("#username").val(),
			password: $("#password").val()
		};
		// console.log(data)

		// ajax 통신을 이용해서 3개의 데이터를 json으로 변경해 insert 요청
		// ajax 호출시 default가 비동기 호출
		// ajax가 통신을 성공하고 서버가 json을 리턴해주면 자동으로 자바 오브젝트를 변환해줌
		$.ajax({
			//로그인 수행 요청
			type: "POST",
			url: "/api/user/login",
			data: JSON.stringify(data), // http body 데이터
			contentType: "application/json; charset=utf-8", // body 데이터가 어떤 타입인지(MIME)
			dataType: "json" // 요청을 서버로해서 응답이 왔을 때 기본적으로 모든 것이 문자열 (생긴게 JSON이라면) => javascript object로 변환
		}).done(function(resp) {
			// 로그인 수행 성공
			alert("로그인이 완료되었습니다.");
			console.log(resp);
			//alert(resp);
			location.href = "/";
		}).fail(function() {
			// 로그인 수행 실패
			alert(JSON.stringify(error));
		});
	}
	*/
}

index.init();