<!DOCTYPE html>
<!-- saved from url=(0042)https://v3.bootcss.com/examples/jumbotron/ -->
<html lang="zh-CN">
<head>
    <%@ include file="Component/header.jsp" %>
    <link href="${host}/css/sign_up_contact.css?v=${version}" rel="stylesheet">
</head>
<body>

<!-- Fixed navbar -->
<%@ include file="Component/navigator.jsp" %>

<div id="Signup" style="background: url('${imageHost}/image/signup/title_bg.png'); background-repeat: no-repeat;
	background-position: center top;">
    <div class="title">
        <div class="container title_content color_white">
            <h1>${data.contact.title}</h1>
            <img alt="报名 linner" src="${imageHost}/image/liner.png" class="title_image">
        </div>
    </div>
</div>


<div class="container">
    <div class="page-header">
        <h1>Get a Lesson</h1>
    </div>
    <div class="row">
        <div class="col-md-6">
            <img src="${imageHost}/image/contact/gal.jpg" style="width: 100%;"/>
        </div>
        <form method="post" action="${host}/send_message.html" class="col-md-6">
            <input type="text" class="form-control" id="name" name="name" placeholder="Your name"><br/>

            <input type="email" class="form-control" id="email" name="email" placeholder="Your email address"><br/>

            <input type="tel" class="form-control" id="tel" name="tel" placeholder="Your tel."><br/>

            <textarea class="form-control" name="need" rows="3" placeholder="Tell us about your need"></textarea><br/>

            <button type="submit" class="btn btn-primary col-md-12">Send Message</button>
        </form>
    </div>
</div>


<div class="container">
    <div class="page-header">
        <h1>Information</h1>
    </div>
    <div class="row">
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