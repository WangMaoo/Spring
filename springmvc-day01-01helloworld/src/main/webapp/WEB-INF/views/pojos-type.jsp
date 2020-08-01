<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
</head>
<body>
customer:对象${customer}
<form method="post" action="${pageContext.request.contextPath}/pojo-type/do-pojos">
    <table>
        <tr>
            <th>客户编号</th>
            <td><input name="custId"></td>
        </tr>
        <tr>
            <th>客户名称</th>
            <td><input name="custName"></td>
        </tr>
        <tr>
            <th>信息来源</th>
            <td><input name="custSource"></td>
        </tr>
        <tr>
            <th>所属行业</th>
            <td><input name="custIndustry"></td>
        </tr>
        <tr>
            <th>客户级别</th>
            <td><input name="custLevel"></td>
        </tr>
        <tr>
            <th>联系地址</th>
            <td><input name="custAddress"></td>
        </tr>
        <tr>
            <th>联系电话</th>
            <td><input name="custPhone"></td>
        </tr>
        <tr>
            <th>创建时间</th>
            <td><input name="createrTime"></td>
        </tr>

    </table>

    <table >
        <tr>
            <th>毕业学校</th>
            <%--传递对象内对象属性时：对象属性名.对象属性--%>
            <td><input name="customerInfo.school"></td>
        </tr>
        <tr>
            <th>学历</th>
            <td><input name="customerInfo.level"></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
