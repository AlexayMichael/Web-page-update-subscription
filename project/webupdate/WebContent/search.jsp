<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
	<link rel="stylesheet" type="text/css" href="SearchBar/css/search-form.css">
	<link
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="http://bootswatch.com/bower_components/bootstrap/dist/css/bootstrap.min.css">
<link
	href="//cdn.bootcss.com/font-awesome/4.6.3/css/font-awesome.min.css"
	rel="stylesheet">
<title>网页添加</title>
</head>
<body>
<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="Hello.jsp"><i class="fa fa-home fx-2x" aria-hidden="true"></i></a>
			</div>
		</div>
	</nav>
	<section class="container">
		<form action="Addwebs"  method="post" onsubmit="submitFn(this, event);" name="form">
            <div class="search-wrapper">
                <div class="input-holder">
                    <input name="userurl" type="text" class="search-input" placeholder="输入要添加的网页URL">
                   <button class="search-icon" onclick="searchToggle(this, event);"><span></span></button>
                </div>
                <script>
                var count = 0;
                document.getElementById("tijiao").addEventListener("click",function(e){
                	e.preventDefault();
   					count++;
   					if(count>1)
                	void(document.form.submit());
                } );</script>
                <span class="close" onclick="searchToggle(this, event);" ></span>
                <div class="result-container">
                </div>
            </div>
        </form>
	</section>
	
	<script src="http://www.jq22.com/jquery/1.11.1/jquery.min.js"></script>
	<script>window.jQuery || document.write('<script src="SearchBar/js/jquery-1.11.0.min.js"><\/script>')</script>
	<script type="text/javascript">
        function searchToggle(obj, evt){
            var container = $(obj).closest('.search-wrapper');

            if(!container.hasClass('active')){
                  container.addClass('active');
                  evt.preventDefault();
            }
            else if(container.hasClass('active') && $(obj).closest('.input-holder').length == 0){
                  container.removeClass('active');
                  // clear input
                  container.find('.search-input').val('');
                  // clear and hide result container when we press close
                  container.find('.result-container').fadeOut(100, function(){$(this).empty();});
            }
        }

        function submitFn(obj, evt){
            value = $(obj).find('.search-input').val().trim();

            _html = "你将关注的是：";
            if(!value.length){
                _html = "输入内容不能为空";
            }
            else{
                _html += "<b>" + value + "</b>";
            }

            $(obj).find('.result-container').html('<span>' + _html + '</span>');
            $(obj).find('.result-container').fadeIn(100);

            evt.preventDefault();
        }
    </script>

</body>
</html>