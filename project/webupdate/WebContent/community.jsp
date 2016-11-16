<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link  rel="stylesheet" href="reviews/css/main.css" />
		<link rel="stylesheet" type="text/css" href="reviews/css/sinaFaceAndEffec.css" />
		<script src="http://www.jq22.com/jquery/jquery-1.9.1.js"></script>
		<link rel="stylesheet" href="button/css/style.css">

	<script src="button/js/jquery-1.8.3.min.js"></script>

	<script src="button/js/script.js"></script>
	
<title>社区交流</title>
</head>
<body>
<div class="link play-link">

			<span class="icon animated"></span>

			<a class="button" href="Hello.jsp">
			<span class="line line-top"></span>
			<span class="line line-right"></span>
			<span class="line line-bottom"></span>
			<span class="line line-left"></span>
			</a>
		</div>
<div id="content" style="width: 700px; height: auto;">
			<div class="wrap">
				<div class="comment">
					<div class="head-face">
						<img src="reviews/images/1.jpg" >
						<p>小明</p>
					</div>
					<div class="content">
						<div class="cont-box">
							<textarea class="text" placeholder="请输入..."></textarea>
						</div>
						<div class="tools-box">
							<div class="operator-box-btn"><span class="face-icon"  >☺</span><span class="img-icon">▧</span>	</div>
							<div class="submit-btn"><input type="button" onClick="out()"value="发布动态" /></div>
						</div>
					</div>
				</div>
				<div id="info-show">
					<ul></ul>
				</div>
			</div>
		</div>
		<script type="text/javascript" src="reviews/js/main.js"></script>
	<script type="text/javascript" src="reviews/js/sinaFaceAndEffec.js"></script>
	<script type="text/javascript">
		// 绑定表情
		$('.face-icon').SinaEmotion($('.text'));
		// 测试本地解析
		function out() {
			var inputText = $('.text').val();
			$('#info-show ul').append(reply(AnalyticEmotion(inputText)));
		}
		
		var html;
		function reply(content){
			html  = '<li>';
			html += '<div class="head-face">';
			html += '<img src="reviews/images/1.jpg" / >';
			html += '</div>';
			html += '<div class="reply-cont">';
			html += '<p class="username">小明</p>';
			html += '<p class="comment-body">'+content+'</p>';
			html += '<p class="comment-footer">2016年11月16日　回复　点赞54　转发12</p>';
			html += '</div>';
			html += '</li>';
			return html;
		}
	</script>
		
</body>

</html>