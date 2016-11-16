<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.7/cerulean/bootstrap.min.css" rel="stylesheet" integrity="sha384-zF4BRsG/fLiTGfR9QL82DrilZxrwgY/+du4p/c7J72zZj+FLYq4zY00RylP9ZjiT" crossorigin="anonymous">
<title>欢迎回来</title>
</head>

<body>
	<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a class="navbar-brand" href="search.jsp">网页添加</a>
				</div>
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active">
							 <a href="interests.jsp">兴趣管理</a>
						</li>
						<li>
							 <a href="community.jsp">社区交流</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">帮助<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="#">使用教程</a>
								</li>
								<li>
									 <a href="#">关于开发者</a>
								</li>
							</ul>
						</li>
					</ul>
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control" />
						</div> <button type="submit" class="btn btn-default">搜素</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						<li>
							 <a href="flower.jsp">友情链接</a>
						</li>
						
					</ul>
				</div>
			</nav>
			
<script>
    window.onload=function(){
        getTime();
    }
    function getTime(){
        var date = new Date();
        var hours =formatTime(date.getHours());
        var minutes = formatTime(date.getMinutes());
        var seconds = formatTime(date.getSeconds());
        var $time = document.getElementById('time');
        $time.innerHTML=hours +"<img src='${pageContext.request.contextPath}/images/hm.png' style='margin:0 10px;' width='12' height='40'/>"+ minutes+"<img style='margin:0 10px;'  src='${pageContext.request.contextPath}/images/ms.png' width='12' height='40'/>"+ seconds;
        
        setTimeout("getTime()",500);

    }
    function formatTime(i){
        if(i<10&&i==1){
            i=  "<img src='${pageContext.request.contextPath}/images/0.png' width='40' height='60'/>"+"<img src='images/1.png' width='20' height='60'/>";
        }else if(i<10&&i!=1){
            i= "<img src='${pageContext.request.contextPath}/images/0.png' width='40' height='60'/>" + "<img src='${pageContext.request.contextPath}/images/"+i+".png' width='40' height='60'/>";
        }else{
           
            var j= i.toString().charAt(0);
            var z =i.toString().charAt(1);
           if(j<10 && z<10&&j!=1&&z!=1){
               i = "<img src='${pageContext.request.contextPath}/images/"+j+".png' width='40' height='60'/>" + "<img src='${pageContext.request.contextPath}/images/"+z+".png' width='40' height='60'/>";
            }else if(j<10 && z<10&&j==1&&z!=1){
              
               i = "<img src='${pageContext.request.contextPath}/images/1.png' width='20' height='60'/>" + "<img src='${pageContext.request.contextPath}/images/"+z+".png' width='40' height='60'/>";

           }else if(j<10 && z<10&&z==1&&j!=1){
                   i =  "<img src='${pageContext.request.contextPath}/images/"+j+".png' width='40' height='60'/>"+"<img src='${pageContext.request.contextPath}/images/1.png' width='20' height='60'/>";

           }else if(j<10 && z<10&&(j==1&&z==1)){
               i="<img src='${pageContext.request.contextPath}/images/1.png' width='20' height='60'/>"+"<img src='${pageContext.request.contextPath}/images/1.png' width='20' height='60'/>";
           }
        }

        return i;
    }
</script>
<div id="time"></div>
			<br><br>
			<div class="jumbotron">
				<h1>
					网页更新浏览
				</h1>
				<p>
					你可以在这里获取网页最新动态
				</p>
				<p>
					 <a class="btn btn-primary btn-large" href="#">Learn more</a>
				</p>
			</div>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-4 column">
			<h2>
				网站A
			</h2>
			<p>
				在这里展示网站A更新
			</p>
			<p>
				 <a class="btn" href="#">View details »</a>
			</p>
		</div>
		<div class="col-md-4 column">
			<h2>
				网站B
			</h2>
			<p>
				在这里展示网站B更新
			</p>
			<p>
				 <a class="btn" href="#">View details »</a>
			</p>
		</div>
		<div class="col-md-4 column">
			<h2>
				网站C
			</h2>
			<p>
				在这里展示网站C更新
			</p>
			<p>
				 <a class="btn" href="#">View details »</a>
			</p>
		</div>
	</div>
</div>
</body>
</html>