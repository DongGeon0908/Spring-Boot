$(".btn").click(function (){
    
    $.ajax({
        beforeSend: function (request){
            request.setRequestHeader("Authorization", 'Bearer ' + jwtValue); // jwtValue는 JWT 값
        },
        dataType: "json",
        url: 'http://localhost:8080/notes/all',
        data: {email: 'user10@zerock.org'},
        success: function (arr) {
            console.log(arr);
        }
    })
})