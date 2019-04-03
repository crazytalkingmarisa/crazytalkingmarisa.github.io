<!DOCTYPE html>
<!-- saved from url=(0042)https://v3.bootcss.com/examples/jumbotron/ -->
<html lang="zh-CN">

<head>
    <%@ include file="Component/header.jsp" %>
    <link href="${host}/css/index.css?v=${version}" rel="stylesheet">
</head>
<body>

<!-- Fixed navbar -->
<%@ include file="Component/navigator.jsp" %>

<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
        <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
        <div class="item active">
            <img alt="slide1" src="${imageHost}/image/index/slide/1.jpg">
            <div id="slide_page1_in" class="carousel-caption content">
                <h1>${data.slide.page1.p1}</h1>
                <p class="lead">${data.slide.page1.p2}</p>
                <div>
                    <a type="button" href="sign_up_contact.html" style="width:200px;"
                       class="btn btn-lg btn-success">${data.slide.page1.button1}</a>
                </div>
            </div>
        </div>
        <div class="item">
            <img alt="slide2" src="${imageHost}/image/index/slide/2.jpg">
            <div id="slide_page2_in" class="carousel-caption content">
                <h1>${data.slide.page2.p1}</h1>
                <p class="lead">${data.slide.page2.p2}</p>
                <div>
                    <a type="button" href="sign_up_contact.html" style="width:200px;"
                       class="btn btn-lg btn-success">${data.slide.page2.button1}</a>
                </div>
            </div>
        </div>
    </div>

    <!-- Controls -->
    <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>


<div id="slide_out" class="container">
    <div style="padding: 15px;">
        <h1>${data.slide.page1.p1}</h1>
        <p class="lead">${data.slide.page1.p2}</p>
        <hr/>

        <h1>${data.slide.page2.p1}</h1>
        <p class="lead">${data.slide.page2.p2}</p>
        <div>
            <a type="button" href="sign_up_contact.html" style="width:200px;" class="btn btn-lg btn-success">
                ${data.slide.page2.button1}
            </a>
        </div>
        <hr/>
    </div>
</div>


<div class="title">
    <div class="container title_content">
        <h1>${data.aboutUs.title}</h1>
        <img alt="liner" src="${imageHost}/image/liner.png" class="title_image">
    </div>
</div>

<div class="container">
    <div class="row">
        <div class="col-md-4">
            <img alt="introduction pic 1" style="width: 100%" src="${imageHost}/image/index/introduction/1.jpg"/>
            <div class="box" style="margin-top: 5px; margin-bottom: 15px; justify-content: space-between;">
                <div style="width: 49%">
                    <img alt="introduction pic 2" style="width: 100%" src="${imageHost}/image/index/introduction/2.jpg"/>
                </div>
                <div style="width: 49%">
                    <img alt="introduction pic 3" style="width: 100%" src="${imageHost}/image/index/introduction/3.jpg"/>
                </div>
            </div>
        </div>
        <div class="col-md-8 starter-template">
            <p style="line-height: 1.45" class="lead">
                ${data.aboutUs.p1}
            </p>
            <p style="line-height: 1.45" class="lead">
                ${data.aboutUs.p2}
            </p>
        </div>
    </div>
</div>
<!-- /.container -->

<div class="title">
    <div class="container title_content">
        <h1>${data.comment.title}</h1>
        <img alt="liner" src="${imageHost}/image/liner.png" class="title_image">
    </div>
</div>

<div class="container bg_grey comment">
    <div class="item">
        <img class="avatar" src="${imageHost}/image/index/comment/avatar/8.jpg"/>
        <img class="arrow" src="${imageHost}/image/index/comment/arrow.png"/>
        <div class="content">
            <p class=" lead">Hello marisa :) our lesson was great.. We make units from books.. course was very
                useful for
                me <img class="emoji" src="${imageHost}/image/index/comment/emoji/1.png"/></p>
        </div>
    </div>

    <div class="item">
        <img class="avatar" src="${imageHost}/image/index/comment/avatar/2.jpg"/>
        <img class="arrow" src="${imageHost}/image/index/comment/arrow.png"/>
        <div class="content">
            <p class="lead">Hello Marisa. I heard a lot about you. <img class="emoji"
                                                                        src="${imageHost}/image/index/comment/emoji/2.png"/> A
                lot of good things.Apparently you are a great
                Chinese teacher.<img class="emoji" src="${imageHost}/image/index/comment/emoji/2.png"/> I might be interested
                with your
                services</p>
        </div>

    </div>
    <div class="item">
        <img class="avatar" src="${imageHost}/image/index/comment/avatar/3.jpg"/>
        <img class="arrow" src="${imageHost}/image/index/comment/arrow.png"/>
        <div class="content">
            <p class="lead">the teacher repeats the things a lot, make me talk and say sentences etc etc,i like</p>
        </div>
    </div>
</div>

</div>
<%@ include file="Component/footer.jsp" %>
</body>

</html>