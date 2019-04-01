<!DOCTYPE html>
<!-- saved from url=(0042)https://v3.bootcss.com/examples/jumbotron/ -->
<html lang="zh-CN">
<head>
    <%@ include file="Component/header.jsp" %>
    <link href="css/sign_up_contact.css?v=1" rel="stylesheet">
</head>
<body>

<!-- Fixed navbar -->
<%@ include file="Component/navigator.jsp" %>

<div id="Signup" style="background: url('image/signup/title_bg.png'); background-repeat: no-repeat;
	background-position: center top;">
    <div class="title">
        <div class="container title_content color_white">
            <h1>${data.contact.title}</h1>
            <img alt="报名 linner" src="image/liner.png" class="title_image">
        </div>
    </div>
</div>

<div class="container">
    <div class="row" style="margin-top: 40px;">
        <div class="col-md-9 content">
            <div class="box contact_item">
                <span class="contact_icon glyphicon glyphicon-map-marker" aria-hidden="true"></span>
                <p>${data.contact.address} </p>
            </div>
            <div class="box contact_item">
                <span class="contact_icon glyphicon glyphicon-earphone" aria-hidden="true"></span>
                <p><a href="tel:+8618826050039">+86 188 2605 0039</a></p>
            </div>
            <div class="box contact_item">
                <span class="contact_icon glyphicon glyphicon-envelope" aria-hidden="true"></span>
                <p><a href="mailto:crazytalking@foxmail.com">crazytalking@gmail.com</a></p>
            </div>
        </div>
    </div>

</div>

<!-- /container -->

<%@ include file="Component/footer.jsp" %>
</body>

</html>