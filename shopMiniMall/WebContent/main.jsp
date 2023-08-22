<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 홈페이지</title>
</head>
<body>
<h2>Main 화면입니다</h2>
<jsp:include page="common/menu.jsp" flush="true"></jsp:include><br>
<jsp:include page="common/top.jsp" flush="true"></jsp:include><br>
<hr>
<jsp:include page="goods/goodsList.jsp" flush="true"></jsp:include><br>
</body>
</html>