<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
</head>
<body>
传递参数：${id}
<form method="get" action="${pageContext.request.contextPath}/basic-type/do-type">
    <input name="id" value=""/>
    <input type="submit" value="提交">
</form>
</body>
</html>
