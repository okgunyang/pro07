<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
	<title>채팅 메인 화면</title>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script>
	function sendMessage(form) {
		// 작성자, 내용 유효성 검사
		form.writer.value = form.writer.value.trim();
		if (form.writer.value.length == 0) {
			alert('작성자를 입력하세요');
			form.writer.focus();
			return false;
		}
		
		form.body.value = form.body.value.trim();
		if (form.body.value.length == 0) {
			alert('내용 입력하세요');
			form.body.focus();
			return false;
		}
		// AJAX -> doAddMessage 실행 및 출력값 가져오기
		$.post('./doAddMessage',{
			writer : form.writer.value,
			body : form.body.value
		}, function(data) {
			
		},'json');
		form.body.value = '';
		form.body.focus();
	}
</script>
</head>
<body>

	<h1>채팅 메시지 입력</h1>
	
	<!-- 양식 입력 후 전송 클릭시 JS 함수 실행 -->
	<form onsubmit="sendMessage(this); return false;">
		<input type="text" name="writer" placeholder="작성자">
		<input type="text" name="body" placeholder="내용">
		<input type="submit" value="전송">
	</form>

</body>
</html>