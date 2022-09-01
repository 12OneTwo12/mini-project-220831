<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>
	Hello world!  
</h1>

<form action="worker_signUp" method="post">

	id : <input type="text" name="worker_id"><br>
	pw :<input type="password" name="worker_password"><br>
	name : <input type="text" name="name"><br>
	career : <input type="number" min='0' max='100' step='1'><br>
	gender : <select name="gender">
		<option value="남">남</option>
		<option value="여">여</option>
	</select><br>
	<input type="submit" value="회원가입"><br>
</form>

${sessionVO.worker_id}

<P>  The time on the server is ${serverTime}. </P>

<script>
	var msg = '${msg}';
	if(msg != ""){
		alert(msg);
	}
</script>

</body>
</html>