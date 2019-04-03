
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!-- saved from url=(0042)https://v3.bootcss.com/examples/jumbotron/ -->
<html lang="${languageCode}">

<head>
    <%@ include file="/Component/header.jsp" %>
</head>
<body>
<div style="text-align: center" style="padding: 200px;">
    <h1>
        ${msg}
    </h1>
    <a href="${host}">${link}</a>
</div>
<%@ include file="/Component/footer.jsp" %>
</body>

</html>