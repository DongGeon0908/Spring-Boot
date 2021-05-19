<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="layout/header.jsp" %>
<body>
<div class="jumbotron text-center">
    <h2>Hanshin NLP는 아래와 같은 예측을 하였습니다.</h2>

    <br>
    <br>
    <br>
    <br>
    <br>
    <br>


    <h2 style="color:indianred"><strong>텍스트 유사도가 높게 측정되었습니다. 추가 확인이 필요합니다.</strong></h2>
    <br>
    <h3 style="color:indianred"><strong>
        <c:forEach var="a" items="${datas}" begin="0" end="1">
            &nbsp;&nbsp;&nbsp; ${a}  &nbsp;&nbsp;&nbsp;
        </c:forEach>
    </strong></h3>
    <br>
    <hr/>
    <br>
    <h2>정상 범위 입니다.</h2>
    <br>
    <h3>
        <c:forEach var="a" items="${datas}" begin="2" end="4">
            &nbsp;&nbsp;&nbsp; ${a}&nbsp;&nbsp;&nbsp;
        </c:forEach>
    </h3>
</div>

<br>
</body>
<%@ include file="layout/footer.jsp" %>


