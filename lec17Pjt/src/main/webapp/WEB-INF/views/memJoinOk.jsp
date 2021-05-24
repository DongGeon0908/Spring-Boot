<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1> memJoinOk </h1>
	ID : ${member.memId}<br />
	PW : ${member.memPw}<br />
	Mail : ${member.memMail} <br />
	Phone : ${member.memPhone1} ${member.memPhone2} ${member.memPhone3}<br />
	
	<a href="/lec17/resources/html/memJoin.html"> Go MemberJoin </a>
</body>
</html>
