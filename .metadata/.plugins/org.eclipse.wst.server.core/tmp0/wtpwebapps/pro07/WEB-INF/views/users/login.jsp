<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
	<title>로그인</title>
</head>
<body>
	<h2>로그인</h2>
	<form action="/user/login" method="post">
		<sec:csrfInput/>
		<input type="text" name="id" placeholder="아이디" />
		<input type="password" name="password" placeholder="비밀번호" />
		<button type="submit">로그인</button>
	</form>
</body>
</html>