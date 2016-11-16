<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
  <link rel="stylesheet" media="screen" href="particles/css/style.css">
<title>Welcome</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	
<link rel="stylesheet" type="text/css" href="signin/css/styles.css">

<style type="text/css">
body, button, input, select, textarea, h1, h2, h3, h4, h5, h6 {
	font-family: Microsoft YaHei, '宋体', Tahoma, Helvetica, Arial,
		"\5b8b\4f53", sans-serif;
}
   
    .login-form{
  min-height:345px;
  position:relative;
  -webkit-perspective:1000px;
          perspective:1000px;
  -webkit-transform-style:preserve-3d;
          transform-style:preserve-3d;
}
	.jq22-container{ position:absolute;left:35%;top:10%;z-index:70;background:#00F;width:500px;height:200px} 
</style>

</head>
<body>
<!-- particles.js container -->
<div id="particles-js">
</div>

<!-- scripts -->
<script src="particles.min.js"></script>
<script src="particles/js/app.js"></script>


<div class="jq22-container" style="padding-top:0px">
		<div class="login-wrap">
			<div class="login-html">
				<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">登录</label>
				<input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">注册</label>
				<div class="login-form">
					<div class="sign-in-htm">
						<br>
						<br>
						<br>
						<form class="form-signin" action="Signin"  method="post">
						<div class="group">
							<label for="user" class="label">用户名</label>
							<input name="signuser" type="text" class="input">
						</div>
						<div class="group">
							<label for="pass" class="label">密码</label>
							<input name="signpass"  class="input" type="password">
						</div>
						<div class="group">
							<input id="check" type="checkbox" class="check" checked>
							<label for="check"><span class="icon"></span>记住我</label>
						</div>
						<div class="group">
							<input type="submit" class="button" value="登录">
						</div>
						</form>
						<div class="hr"></div>
						<div class="foot-lnk">
							<a href="#forgot">忘记密码?</a>
						</div>
					</div>
					<form class="form-signup" action="AddUser"  method="post">
					<div class="sign-up-htm">
						<div class="group">
							<label for="user" class="label">用户名</label>
							<input name="user" type="text" class="input">
						</div>
						<div class="group">
							<label for="pass" class="label">密码</label>
							<input name="pass"  class="input" type="password">
						</div>
						<div class="group">
							<label for="subtime" class="label">推送时间</label>
							<input name="subtime" type="text" class="input">
						</div>
						<div class="group">
							<label for="email" class="label">邮箱地址</label>
							<input name="email" type="text" class="input">
						</div>
						<div class="group">
							<label for="phone" class="label">手机号</label>
							<input name="phone" type="text" class="input">
						</div>
						<div class="group">
							<input type="submit" class="button" value="注册">
						</div>
					</div>
					</form>
				</div>
			</div>
		</div>
	</div>


</body>
</html>