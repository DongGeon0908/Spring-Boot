<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="layout/header.jsp"%>
<body>
<div class="jumbotron text-center">
<form id="uploadFrm" enctype="multipart/form-data">
    <h3>데이터 업로드<br>엑셀파일만 업로드 가능(xls, xlsx)</h3>
    <br>
    <br>
    <input type="file" name="upFile" id="upFile" accept=".xlsx, .xls"/>
</form>
<br><br>

    <hr />
    <h2>사용방법</h2>
    <br>

    <h3>1. 엑셀 파일을 선택</h3>
    <h3>2. 상단의 Table 버튼 클릭</h3>
    <h3>3. 상단의 Graph 버튼 클릭</h3>
    <h3>4. 상단의 Result 버튼 클릭</h3>

</div>
</body>
<script src ="/js/ajaxSubmit.js"></script>
<%@ include file="layout/footer.jsp"%>


