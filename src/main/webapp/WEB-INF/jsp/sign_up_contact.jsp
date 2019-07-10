<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!-- saved from url=(0042)https://v3.bootcss.com/examples/jumbotron/ -->
<html lang="${languageCode}">
<head>
    <%@ include file="component/header.jsp" %>
    <link href="${host}/css/sign_up_contact.css?v=${version}" rel="stylesheet">
</head>
<body>

<!-- Fixed navbar -->
<%@ include file="component/navigator.jsp" %>

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
            <img src="${imageHost}/image/contact/gal.jpg" style="width: 100%; margin-bottom: 15px;"/>
        </div>
        <form method="post" action="${host}/send_message.html" class="col-md-6">
            <input type="text" class="form-control" id="name" name="name" placeholder="${data.contact.form.name}"><br/>

            <input type="email" class="form-control" id="email" name="email" placeholder="${data.contact.form.email}"><br/>

            <input type="tel" class="form-control" id="tel" name="tel" placeholder="${data.contact.form.tel}"><br/>

            <textarea class="form-control" name="need" rows="3" placeholder="${data.contact.form.need}"></textarea><br/>

            <button type="submit" class="btn btn-primary col-md-12">${data.contact.form.btn}</button>
        </form>
    </div>
</div>


<div class="container">
    <div class="page-header">
        <h1>Information</h1>
    </div>
    <div class="row">
        <div class="col-md-10 content">
            <div class="box contact_item">
                <span class="contact_icon glyphicon glyphicon-map-marker" aria-hidden="true"></span>
                <p>${data.contact.address} </p>
            </div>
            <div class="box contact_item">
                <span class="contact_icon glyphicon glyphicon-earphone" aria-hidden="true"></span>
                <p><a href="tel:+8613570333858">+86 135 7033 3858</a></p>
            </div>
            <div class="box contact_item">
                <span class="contact_icon glyphicon glyphicon-envelope" aria-hidden="true"></span>
                <p><a href="mailto:crazytalking@foxmail.com">crazytalking@foxmail.com</a></p>
            </div>
        </div>
        <div class="col-md-2">
            <img style="width: 100%" src="${imageHost}/image/contact/qrcode.jpg">
        </div>
    </div>
</div>

<!-- /container -->

<%@ include file="component/footer.jsp" %>
</body>

</html>