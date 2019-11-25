<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<title>短消息平台</title>
	<link type="text/css" rel="stylesheet" href="css/sms.css" />
	<script src="scripts/jquery.js"></script>
</head>
<body>
	<div id="loginTitle" class="png"></div>
	<div id="loginForm" class="userForm png">
		<form >
			<dl>
<%--				<div id="error">显示登录失败等错误信息${requestScope.error}</div>--%>
				<dt>用户名：</dt>
				<dd>
					<input type="text" id="uName" name="name" />
				</dd>
				<dt>密 码：</dt>
				<dd>
					<input type="password" id="uPwd" name="pwd" />
				</dd>
			</dl>
			<div class="buttons">
				<input class="btn-login png" id="login" name="submit"/>
				<a href="register.jsp"><input class="btn-reg png" type="button" name="register" value=" " /></a>
			</div>
		</form>
	</div>
	<script>
		$("#login").click(function () {
		let name =$("#uName").val();
		let pwd=$("#uPwd").val();
		console.log(pwd);
		console.log(name);
			$.ajax({
				"url":"/login",
				"type":"post",
				"data":{
					"name":name,
					"pwd":pwd
				},
				"dataType":"json",
				"success":callback,
				"error":function () {
					alert("error")
				}
			});
			function callback(data) {
			}
		})

	</script>
	
	
</body>
</html>








