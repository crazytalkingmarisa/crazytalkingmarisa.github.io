<%--
  Created by IntelliJ IDEA.
  User: faddenyin
  Date: 2019-04-01
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span
                    class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand navbar-title" style="color:#fff" href="">${data.navigator.title}</a>
        </div>

        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li><a href="index.html">${data.navigator.item.home}</a></li>
                <li><a href="course.html">${data.navigator.item.course}</a></li>
                <li><a href="other_services.html">${data.navigator.item.other_services}</a></li>
                <li><a href="sign_up_contact.html">${data.navigator.item.sign_up_contact}</a></li>
            </ul>

            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false"><span id="language" >English</span> <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a onclick="toLanguage(1)" href="#">English</a></li>
                        <li><a onclick="toLanguage(2)" href="#">简体中文</a></li>
                    </ul>
                </li>
            </ul>
        </div>
        <!--/.nav-collapse -->

    </div>
</nav>

<script type="text/javascript">
    $(function () {
        <%
            String uri = request.getRequestURI();
            String href = uri.substring(1, uri.lastIndexOf(".jsp"));
        %>

        var href = "<%=href %>";
        $($("#navbar [class='nav navbar-nav'] li [href='" + href + ".html']").parents()).addClass("active");

        var language = getCookie("language");
        if(language == "2"){
            $("#language").html("简体中文");
        }else{
            $("#language").html("english");
        }
    });

    function toLanguage(value) {
        document.cookie = "language=" + value;
        document.location.reload();
    }

    function getCookie(name)
    {
        var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");
        if(arr=document.cookie.match(reg))
            return unescape(arr[2]);
        else
            return null;
    }
</script>