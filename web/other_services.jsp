<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!-- saved from url=(0042)https://v3.bootcss.com/examples/jumbotron/ -->
<html lang="zh-CN">

<head>
    <%@ include file="Component/header.jsp" %>
    <link href="${host}/css/other_services.css?v=${version}" rel="stylesheet">
</head>
<body>

<!-- Fixed navbar -->
<%@ include file="Component/navigator.jsp" %>

<div style="background: url('${imageHost}/image/other_services/title_bg.jpg'); background-repeat: no-repeat;
	background-position: center top;">
    <div class="title">
        <div class="container title_content">
            <h1 style="color:#fff">${data.service.title}</h1>
            <img alt="liner" src="${imageHost}/image/liner.png" class="title_image">
        </div>
    </div>
</div>

<div style="margin-top:30px; margin-bottom: 30px; padding:30px;" class="container">
    <p class="lead" style="line-height:1.6;">
        ${data.service.lead}
    </p>
</div>

<div class="container">
    <!-- Example row of columns -->
    <div style="margin-top:30px;" class="row">
        <div class="col-md-4 item">
            <img alt="Airport Reception" src="${imageHost}/image/other_services/travel_in_china.jpg">
            <h2>
                ${data.service.item1}
            </h2>
        </div>

        <div class="col-md-4 item">
            <img alt="Airport Reception" src="${imageHost}/image/other_services/airport_reception.jpg">
            <h2>
                ${data.service.item2}
            </h2>
        </div>
        <div class="col-md-4 item">
            <img alt="Airport Reception" src="${imageHost}/image/other_services/residential_services.jpg">
            <h2>
                ${data.service.item3}
            </h2>
        </div>
    </div>
    <div style="margin-top:30px;" class="row">
        <div class="col-md-4 item">
            <img alt="Airport Reception" src="${imageHost}/image/other_services/visa_application.jpg">
            <h2>
                ${data.service.item4}
            </h2>
        </div>
        <div class="col-md-4 item">
            <img alt="Airport Reception" src="${imageHost}/image/other_services/company_register.jpg">
            <h2>
                ${data.service.item5}
            </h2>
        </div>
        <div class="col-md-4 item">
            <img alt="Airport Reception" src="${imageHost}/image/other_services/office_rented.jpg">
            <h2>
                ${data.service.item6}
            </h2>
        </div>

    </div>
</div>


<!-- /container -->

<%@ include file="Component/footer.jsp" %>
</body>

</html>