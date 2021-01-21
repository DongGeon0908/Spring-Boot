let index = {
	init: function() {
		$("#btn-save").on("click", () => {
			this.save();
		});
	},

	save: function() {
		//alert('user의 save함수 호출됨');
		let data = {
			username: $("#username").val(),
			password: $("#password").val(),
			email: $("#email").val()
		}
		// console.log(data)
		
		// ajax 통신을 이용해서 3개의 데이터를 json으로 변경해 insert 요청
		$.ajax().done().fail();
	}
}

index.init();