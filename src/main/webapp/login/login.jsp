<%@page contentType="text/html;charset=utf-8"  language="java" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta name="description" content="">
		<meta name="author" content="">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta http-equiv="Pragma" content="no-cache">
        <meta http-equiv="Cache-Control" content="no-cache">
        <title>Signin Template for Bootstrap</title>
		<!-- Bootstrap core CSS -->
		<link href="asserts/css/bootstrap.min.css" rel="stylesheet">
		<!-- Custom styles for this template -->
		<link href="asserts/css/signin.css" rel="stylesheet">
	</head>

	<body class="text-center">
		<form class="form-signin" action="/login" method="post">
			<img class="mb-4" src="asserts/img/bootstrap-solid.svg" alt="" width="72" height="72">
			<h1 class="h3 mb-3 font-weight-normal">清登陆</h1>
			<label class="sr-only">用户名</label>
			<input type="text" class="form-control" placeholder="用户名" required="" autofocus="" name="username">
			<label class="sr-only">密码</label>
			<input type="password" class="form-control" placeholder="密码" required="" name="password">
			<div class="checkbox mb-3">
				<label>
          <input type="radio" value="教师" name="role"> 教师&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <input type="radio" value="学生" name="role">学生

        </label>
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
			<p class="mt-5 mb-3 text-muted">© 2017-2018</p>
			<a class="btn btn-sm">中文</a>
			<a class="btn btn-sm">English</a>
		</form>

	</body>

</html>