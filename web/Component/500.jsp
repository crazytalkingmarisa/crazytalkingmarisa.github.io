<%--
  Created by IntelliJ IDEA.
  User: faddenyin
  Date: 2019-03-01
  Time: 13:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" isErrorPage="true" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="/image/favicon.png">

    <title>Something Wrong</title>

    <!-- Bootstrap core CSS -->
    <link href="https://v4.bootcss.com/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="https://v4.bootcss.com/docs/4.0/examples/sticky-footer/sticky-footer.css" rel="stylesheet">
</head>

<body>

<!-- Begin page content -->
<main role="main" class="container">
    <h1 class="mt-5">出错了！</h1>
</main>

</body>
</html>

<%
    if (exception != null) {
        exception.printStackTrace();
    }
%>
