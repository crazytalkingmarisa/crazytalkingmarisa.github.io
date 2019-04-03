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
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand navbar-title" style="color:#fff" href="${host}">${data.navigator.title}</a>
        </div>

        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <%
                    String uri = request.getRequestURI();
                    String href = uri.substring(1, uri.lastIndexOf(".jsp"));

                    String[] navigators = {"index", "course", "other_services", "sign_up_contact"};
                %>
                <li class="<%=(navigators[0].equals(href)?"active":"")%>">
                    <a href="<%=navigators[0]%>.html">${data.navigator.item.home}</a>
                </li>
                <li class="<%=(navigators[1].equals(href)?"active":"")%>">
                    <a href="<%=navigators[1]%>.html">${data.navigator.item.course}</a>
                </li>
                <li class="<%=(navigators[2].equals(href)?"active":"")%>">
                    <a href="<%=navigators[2]%>.html">${data.navigator.item.other_services}</a>
                </li>
                <li class="<%=(navigators[3].equals(href)?"active":"")%>">
                    <a href="<%=navigators[3]%>.html">${data.navigator.item.sign_up_contact}</a>
                </li>
            </ul>

            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">
                        <span id="language">English</span>
                        <span class="caret"></span>
                    </a>
                    <ul id="language_list" class="dropdown-menu">
                        <li><a href="${host}/en/<%=href%>.html">English</a></li>
                        <li><a href="${host}/cn/<%=href%>.html">简体中文</a></li>
                    </ul>
                </li>
            </ul>
        </div>
        <!--/.nav-collapse -->

    </div>
</nav>

<script type="text/javascript">
    $(function () {
        var language = Cookie.get("language");
        if (language == "2") {
            $("#language").html("简体中文");
        } else {
            $("#language").html("english");
        }
    });
</script>