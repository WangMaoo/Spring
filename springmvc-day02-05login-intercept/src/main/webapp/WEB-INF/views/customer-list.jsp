<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--导入jstl标签库--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户列表jsp页面</title>
    <style>
        table {border:1px solid #000000}
        table th{border:1px solid #000000}
        table td{border:1px solid #000000}
    </style>

</head>
<body>
<table cellpadding="0" cellspacing="0" width="80%">
    <tr>
        <th>编号</th>
        <th>公司名称</th>
        <th>信息来源</th>
        <th>所属行业</th>
        <th>级别</th>
        <th>联系地址</th>
        <th>联系电话</th>
        <th>图片</th>
    </tr>
    <tr>
        <td>${customer.custId}</td>
        <td>${customer.custName}</td>
        <td>${customer.custSource}</td>
        <td>${customer.custIndustry}</td>
        <td>${customer.custLevel}</td>
        <td>${customer.custAddress}</td>
        <td>${customer.custPhone}</td>
        <td><img src="${website}${customer.fileObject.pathUrl}" width="80px" height="80px"></td>
    </tr>
</table>
</body>

</html>

