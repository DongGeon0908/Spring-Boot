let index = {
    init: function(){
        let upFile = $('#upFile')[0];
        upFile.addEventListener('change', e => {
            this.uploadFile()
        })
    },
    uploadFile: function(){
        let form = $('#uploadFrm')[0];
        let frmData = new FormData(form);
        $.ajax({
            enctype: 'multipart/form-data',
            type: 'POST',
            url: '/insertUploadFile',
            processData: false,
            contentType: false,
            cache: false,
            data: frmData,
        }).done(function(){
            alert("전송 완료")
        }).fail(function(error){
            alert("실패")
        })
    },
}
index.init()
// let upFile = $('#upFile')[0];
// upFile.addEventListener('change', function(e) {
//     let form = $('#uploadFrm')[0];
//     let frmData = new FormData(form);
//     console.log(e)
//     $.ajax({
//         enctype: 'multipart/form-data',
//         type: 'POST',
//         url: '/insertUploadFile.do',
//         processData: false,
//         contentType: false,
//         cache: false,
//         data: frmData,
//         success: function(data) {
//             console.log(data);
//         },
//         error: function(e) {
//             alert('파일업로드 실패');
//             console.log(e);
//             e.preventDefault();
//         }
//     });
// });