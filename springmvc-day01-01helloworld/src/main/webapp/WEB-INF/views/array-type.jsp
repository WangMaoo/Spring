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

    <script>

        // 修改用户
        function findCustomerById(id) {
            window.location.href="${pageContext.request.contextPath}/customer/findCustomerById?customerId="+id;
        }
    </script>
</head>
<body>
customerIds数组:${customerIds}
<form method="post" action="${pageContext.request.contextPath}/array-type/do-array-type">
    <table cellpadding="0" cellspacing="0" width="80%">
        <tr>
            <td>
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>
    <table cellpadding="0" cellspacing="0" width="80%">
        <tr>
            <th>编号ID</th>
            <th>公司名称</th>
            <th>信息来源</th>
            <th>所属行业</th>
            <th>级别</th>
            <th>联系地址</th>
            <th>联系电话</th>
            <th>操作</th>
        </tr>
        <tr>
            <td><input type="checkbox" name="customerIds" value="1"></td>
            <td>传智播客</td>
            <td>网络营销</td>
            <td>互联网</td>
            <td>普通客户</td>
            <td>津安创意园</td>
            <td>0208888887</td>
        </tr>
        <tr>
            <td><input type="checkbox" name="customerIds" value="2"></td>
            <td>黑马程序员</td>
            <td>j2ee</td>
            <td>互联网</td>
            <td>VIP客户</td>
            <td>津安创意园</td>
            <td>0208888887</td>
        </tr>
        <tr>
            <td><input type="checkbox" name="customerIds" value="3"></td>
            <td>黑马程序员</td>
            <td>大数据</td>
            <td>互联网</td>
            <td>VIP客户</td>
            <td>津安创意园</td>
            <td>0208888887</td>
        </tr>
    </table>
</form>
</body>

</html>
