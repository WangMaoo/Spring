<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
customerListVo:list类型${customerListVo}
<form method="post" action="${pageContext.request.contextPath}/list-type/do-list-type">
    <table cellpadding="0" cellspacing="0" width="80%">
        <tr>
            <td>
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>
    <table cellpadding="0" cellspacing="0" width="80%">
        <tr>
            <th>公司名称</th>
            <th>信息来源</th>
            <th>所属行业</th>
            <th>级别</th>
            <th>联系地址</th>
            <th>联系电话</th>
        </tr>
        <tr>
            <td><input name="list[0].custName"></td>
            <td><input name="list[0].custSource"></td>
            <td><input name="list[0].custIndustry"></td>
            <td><input name="list[0].custLevel"></td>
            <td><input name="list[0].custAddress"></td>
            <td><input name="list[0].custPhone"></td>
        </tr>
        <tr>
            <td><input name="list[1].custName"></td>
            <td><input name="list[1].custSource"></td>
            <td><input name="list[1].custIndustry"></td>
            <td><input name="list[1].custLevel"></td>
            <td><input name="list[1].custAddress"></td>
            <td><input name="list[1].custPhone"></td>
        </tr>
        <tr>
            <td><input name="list[2].custName"></td>
            <td><input name="list[2].custSource"></td>
            <td><input name="list[2].custIndustry"></td>
            <td><input name="list[2].custLevel"></td>
            <td><input name="list[2].custAddress"></td>
            <td><input name="list[2].custPhone"></td>
        </tr>
    </table>
</form>
</body>

</html>

