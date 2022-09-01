<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>로그인</h1>

	<form action="worker_loginForm" method="post">

	id : <input type="text" name="worker_id"><br>
	pw : <input type="password" name="worker_password"><br>
	<input type="submit" value="로그인"><br>
	</form>

	<script>
		var msg = '${msg}';
		if(msg != ""){
			alert(msg);
		}
	</script>

</body>
</html>