<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>兴趣管理</title>
<script type="text/javascript" src="label/js/jquery.js"></script>
<link href="label/css/jq22.css" type="text/css" rel="stylesheet">
<link rel="stylesheet" media="screen" href="particles/css/style.css">
<style type="text/css"> 
.position{ 
position:absolute; 
left:40%;
bottom:45%; 
width:200px; 
z-index:2;
} 
</style> 
</head>
<body>
<!-- particles.js container -->
<div id="particles-js">
</div>

<!-- scripts -->
<script src="particles.min.js"></script>
<script src="particles/js/app.js"></script>

<div class="position">
<div class="demo" class="col-md-12 ">
	
	<div class="plus-tag tagbtn clearfix" id="myTags"></div>

	<div class="plus-tag-add">
		<form id="" action="" class="login">
			<ul class="Form FancyForm">
				<li>
			
					<input id="" name="" type="text" class="stext" maxlength="20" />
					<label>输入标签</label>
				</li>
				<li>
					<button type="button" class="Button RedButton Button18" style="font-size:22px;">添加标签</button>
					<a href="javascript:void(0);">热门标签</a>
					<a href="Hello.jsp">返回</a>
				</li>
			</ul>
		</form>
	</div><!--plus-tag-add end-->
	
	<div id="mycard-plus" style="display:none;">
		<div class="default-tag tagbtn">
			<div class="clearfix">
				<a value="-1" title="Travel" href="javascript:void(0);"><span>旅行</span><em></em></a>
				<a value="-1" title="Internet" href="javascript:void(0);"><span>IT</span><em></em></a>
				<a value="-1" title="Society" href="javascript:void(0);"><span>社会</span><em></em></a>
				<a value="-1" title="Finance" href="javascript:void(0);"><span>财经</span><em></em></a>
				<a value="-1" title="Polity" href="javascript:void(0);"><span>政治</span><em></em></a>
				<a value="-1" title="Army" href="javascript:void(0);"><span>军事</span><em></em></a>
				<a value="-1" title="Photograph" href="javascript:void(0);"><span>摄影</span><em></em></a>
				<a value="-1" title="Drawing" href="javascript:void(0);"><span>绘画</span><em></em></a>
				<a value="-1" title="Music" href="javascript:void(0);"><span>音乐</span><em></em></a>
				<a value="-1" title="Sport" href="javascript:void(0);"><span>运动</span><em></em></a>
				<a value="-1" title="Games" href="javascript:void(0);"><span>游戏</span><em></em></a>
				<a value="-1" title="Reading" href="javascript:void(0);"><span>阅读</span><em></em></a>                   
			</div>
			</div>
		
	</div><!--mycard-plus end-->
		
</div>
</div>
<script type="text/javascript" src="label/js/jq22.js">

</script>

</body>
</html>