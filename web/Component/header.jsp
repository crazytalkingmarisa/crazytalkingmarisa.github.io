<%--
  Created by IntelliJ IDEA.
  User: faddenyin
  Date: 2019-04-01
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
    String uri = request.getRequestURI();
    String href = uri.substring(1, uri.lastIndexOf(".jsp"));
%>
<c:forEach items="${languageList}" var="item">
<link rel="alternate" hreflang="${item.key}" href="${host}/${item.key}/<%=href%>.html" />
</c:forEach>
<link rel="alternate" hreflang="x-default" href="${host}/<%=href%>.html" />

<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="${data.header.description}">
<meta name="author" content="">
<meta name="keywords" content="${data.header.keywords}">
<link rel="icon" href="${imageHost}/image/favicon.png">
<title>${data.header.title}</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
      integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<link href="${host}/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${host}/css/common.css?v=${version}" rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="${host}/js/ie-emulation-modes-warning.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
<script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
<script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="${host}/js/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"
        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
        crossorigin="anonymous"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="${host}/js/ie10-viewport-bug-workaround.js"></script>
<script src="${host}/js/common.js?v=${version}"></script>
