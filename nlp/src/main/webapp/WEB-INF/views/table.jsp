<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="layout/header.jsp" %>
<body>
<%
    String[] str = {"김동건", "강동진", "황인준", "성민수", "한유림"};
    int i = 0;
    int j = 0;
%>
<div class="jumbotron text-center">
    <h3>Leven 텍스트 유사도</h3>
    <table width="1000" height="500" style="margin-left:auto; margin-right:auto;">
        <thead>
        <tr>
            <th style="background-color: #b37d53"><h5>Standard  ➤➤➤  Target</h5></th>
            <th style="background-color: #b37d53"><h5>1 st</h5></th>
            <th style="background-color: #b37d53"><h5>2 st</h5></th>
            <th style="background-color: #b37d53"><h5>3 st</h5></th>
            <th style="background-color: #b37d53"><h5>4 st</h5></th>
            <th style="background-color: #b37d53"><h5>5 st</h5></th>
            <th style="background-color: #b37d53"><h5>6 st</h5></th>
        </tr>
        </thead>
        <tbody>

        <c:forEach var="a1" items="${datas}" begin="0" end="24">
            <tr>
                <%
                    if (j == 5) {
                        j = 0;
                    }
                    if (i < 5) {
                %>

                <td><%= str[0]%>  ➤➤➤  <%= str[j++]%>
                </td>

                <%
                } else if (i < 10) {
                %>

                <td><%= str[1]%>  ➤➤➤  <%= str[j++]%>
                </td>

                <%
                } else if (i < 15) {
                %>

                <td><%= str[2]%>  ➤➤➤  <%= str[j++]%>
                </td>

                <%
                } else if (i < 20) {
                %>

                <td><%= str[3]%>  ➤➤➤  <%= str[j++]%>
                </td>

                <%
                } else if (i < 25) {
                %>

                <td><%= str[4]%>  ➤➤➤  <%= str[j++]%>
                </td>

                <% }
                    i++;
                %>

                <c:forEach var="a2" items="${a1}" begin="0" end="6">
                    <c:choose>

                        <c:when test="${a2 >= 0.9 && a2 < 1.0}">
                            <td style ="background-color: #ce3e3e">
                        </c:when>

                        <c:when test="${a2 >= 0.8 && a2 < 0.9}">
                            <td style ="background-color: #ff3838">
                        </c:when>

                        <c:when test="${a2 >= 0.7 && a2 < 0.8}">
                            <td style ="background-color: #ff4d4d ">
                        </c:when>

                        <c:when test="${a2 >= 0.6 && a2 < 0.7}">
                            <td style ="background-color: #ff6363">
                        </c:when>

                        <c:when test="${a2 >= 0.5 && a2 < 0.6}">
                            <td style ="background-color: #ff6f6f">
                        </c:when>

                        <c:when test="${a2 >= 0.4 && a2 < 0.5}">
                            <td style ="background-color: #ff8484">
                        </c:when>

                        <c:when test="${a2 >= 0.3 && a2 < 0.4}">
                            <td style ="background-color: #ff9393">
                        </c:when>
                        <c:when test="${a2 >= 0.2 && a2 < 0.3}">
                            <td style ="background-color: #ff9c9c">
                        </c:when>
                        <c:when test="${a2 >= 0.1 && a2 < 0.2}">
                            <td style ="background-color: #ffc1c1">
                        </c:when>
                        <c:when test="${a2 > 0.0 && a2 < 0.1}">
                            <td style ="background-color: #f3dcdc">
                        </c:when>
                        <c:when test="${a2 == 0.0 || a2 == 1.0}">
                            <td style ="background-color: #cdc4c4">
                        </c:when>
                        <c:otherwise>
                            <td style ="background-color: #a1a1a1">
                        </c:otherwise>

                    </c:choose>

                    ${a2}</td>
                </c:forEach>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <br>
    <br>
    <br>
    <h3>코사인 텍스트 유사도</h3>
    <table  width="1000" height="500" style="margin-left:auto; margin-right:auto;">
        <thead>
        <tr>
            <th style="background-color: #b37d53"><h5>Standard  ➤➤➤  Target</h5></th>
            <th style="background-color: #b37d53"><h5>1 st</h5></th>
            <th style="background-color: #b37d53"><h5>2 st</h5></th>
            <th style="background-color: #b37d53"><h5>3 st</h5></th>
            <th style="background-color: #b37d53"><h5>4 st</h5></th>
            <th style="background-color: #b37d53"><h5>5 st</h5></th>
            <th style="background-color: #b37d53"><h5>6 st</h5></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="a1" items="${datas}" begin="25" end="49">
            <tr>

                <%
                    if (j == 5) {
                        j = 0;
                    }
                    if (i < 30) {
                %>

                <td><%= str[0]%>  ➤➤➤  <%= str[j++]%>
                </td>

                <%
                } else if (i < 35) {
                %>

                <td><%= str[1]%>  ➤➤➤  <%= str[j++]%>
                </td>

                <%
                } else if (i < 40) {
                %>

                <td><%= str[2]%>  ➤➤➤  <%= str[j++]%>
                </td>

                <%
                } else if (i < 45) {
                %>

                <td><%= str[3]%>  ➤➤➤  <%= str[j++]%>
                </td>

                <%
                } else if (i < 50) {
                %>

                <td><%= str[4]%>  ➤➤➤  <%= str[j++]%>
                </td>

                <% }
                    i++;
                %>



                <c:forEach var="a2" items="${a1}" begin="0" end="6">
                    <c:choose>


                        <c:when test="${a2 >= 0.9 && a2 < 1.0}">
                            <td style ="background-color: #ce3e3e">
                        </c:when>

                        <c:when test="${a2 >= 0.8 && a2 < 0.9}">
                            <td style ="background-color: #ff3838">
                        </c:when>

                        <c:when test="${a2 >= 0.7 && a2 < 0.8}">
                            <td style ="background-color: #ff4d4d ">
                        </c:when>

                        <c:when test="${a2 >= 0.6 && a2 < 0.7}">
                            <td style ="background-color: #ff6363">
                        </c:when>

                        <c:when test="${a2 >= 0.5 && a2 < 0.6}">
                            <td style ="background-color: #ff6f6f">
                        </c:when>

                        <c:when test="${a2 >= 0.4 && a2 < 0.5}">
                            <td style ="background-color: #ff8484">
                        </c:when>

                        <c:when test="${a2 >= 0.3 && a2 < 0.4}">
                            <td style ="background-color: #ff9393">
                        </c:when>
                        <c:when test="${a2 >= 0.2 && a2 < 0.3}">
                            <td style ="background-color: #ff9c9c">
                        </c:when>
                        <c:when test="${a2 >= 0.1 && a2 < 0.2}">
                            <td style ="background-color: #ffc1c1">
                        </c:when>
                        <c:when test="${a2 > 0.0 && a2 < 0.1}">
                            <td style ="background-color: #f3dcdc">
                        </c:when>
                        <c:when test="${a2 == 0.0 || a2 == 1.0}">
                            <td style ="background-color: #cdc4c4">
                        </c:when>
                        <c:otherwise>
                            <td style ="background-color: #a1a1a1">
                        </c:otherwise>

                    </c:choose>

                    ${a2}</td>
                </c:forEach>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <br>
    <br>
    <br>
    <h3>Jaccad 텍스트 유사도</h3>
    <table  width="1000" height="500" style="margin-left:auto; margin-right:auto;">
        <thead>
        <tr>
            <th style="background-color: #b37d53"><h5>Standard  ➤➤➤  Target</h5></th>
            <th style="background-color: #b37d53"><h5>1 st</h5></th>
            <th style="background-color: #b37d53"><h5>2 st</h5></th>
            <th style="background-color: #b37d53"><h5>3 st</h5></th>
            <th style="background-color: #b37d53"><h5>4 st</h5></th>
            <th style="background-color: #b37d53"><h5>5 st</h5></th>
            <th style="background-color: #b37d53"><h5>6 st</h5></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="a1" items="${datas}" begin="50" end="74">
            <tr>

                <%
                    if (j == 5) {
                        j = 0;
                    }
                    if (i < 55) {
                %>

                <td><%= str[0]%>  ➤➤➤  <%= str[j++]%>
                </td>

                <%
                } else if (i < 60) {
                %>

                <td><%= str[1]%>  ➤➤➤  <%= str[j++]%>
                </td>

                <%
                } else if (i < 65) {
                %>

                <td><%= str[2]%>  ➤➤➤  <%= str[j++]%>
                </td>

                <%
                } else if (i < 70) {
                %>

                <td><%= str[3]%>  ➤➤➤  <%= str[j++]%>
                </td>

                <%
                } else if (i < 75) {
                %>

                <td><%= str[4]%>  ➤➤➤  <%= str[j++]%>
                </td>

                <% }
                    i++;
                %>

                <c:forEach var="a2" items="${a1}" begin="0" end="6">
                    <c:choose>


                        <c:when test="${a2 >= 0.9 && a2 < 1.0}">
                            <td style ="background-color: #ce3e3e">
                        </c:when>

                        <c:when test="${a2 >= 0.8 && a2 < 0.9}">
                            <td style ="background-color: #ff3838">
                        </c:when>

                        <c:when test="${a2 >= 0.7 && a2 < 0.8}">
                            <td style ="background-color: #ff4d4d ">
                        </c:when>

                        <c:when test="${a2 >= 0.6 && a2 < 0.7}">
                            <td style ="background-color: #ff6363">
                        </c:when>

                        <c:when test="${a2 >= 0.5 && a2 < 0.6}">
                            <td style ="background-color: #ff6f6f">
                        </c:when>

                        <c:when test="${a2 >= 0.4 && a2 < 0.5}">
                            <td style ="background-color: #ff8484">
                        </c:when>

                        <c:when test="${a2 >= 0.3 && a2 < 0.4}">
                            <td style ="background-color: #ff9393">
                        </c:when>
                        <c:when test="${a2 >= 0.2 && a2 < 0.3}">
                            <td style ="background-color: #ff9c9c">
                        </c:when>
                        <c:when test="${a2 >= 0.1 && a2 < 0.2}">
                            <td style ="background-color: #ffc1c1">
                        </c:when>
                        <c:when test="${a2 > 0.0 && a2 < 0.1}">
                            <td style ="background-color: #f3dcdc">
                        </c:when>
                        <c:when test="${a2 == 0.0 || a2 == 1.0}">
                            <td style ="background-color: #cdc4c4">
                        </c:when>
                        <c:otherwise>
                            <td style ="background-color: #a1a1a1">
                        </c:otherwise>

                    </c:choose>

                    ${a2}</td>
                </c:forEach>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
<script src="/js/ajaxSubmit.js"></script>
<%@ include file="layout/footer.jsp" %>


