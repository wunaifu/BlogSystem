<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<style type="text/css">
        .table1{
            border:1px solid #ddd;
            width:900px;
            
        }
        thead{
            background-color:lightblue;
        }

    </style>
</head>
<body>
<table border="0" width="900px">
<tr>
<td align="center" style="font-size:24px; color:#666"> 人员管理</td>
</tr>
<tr>
<td align="right" > <a href="${pageContext.request.contextPath}/user/adduser">添加</a></td>
</tr>
</table>
<br/>
<table cellspacing="0" border="1" class="table1">
<thead>
   <tr>
    	<th width="150">姓名</th>
    	<th width="150">昵称</th>
    	<th width="250">电话</th>
    	<th width="150">身份</th>
    	<th width="100">年龄</th>
    	<th width="100">性别</th>
    	<th width="300">地址</th>
    	<th width="300">简介</th>
   		<th  width="120">编辑</th>
   		<th  width="120">删除</th>
   </tr>
</thead>
<tbody>

<c:forEach var="p" items="${requestScope.userlist }">
	<tr>
		<td align="center">${p.name }</td>
		<td align="center">${p.nickname }</td>
		<td align="center">${p.phone }</td>
		<td align="center">${p.profession }</td>
		<td align="center">${p.age }</td>
		<td align="center">${p.gender }</td>
		<td align="center">${p.address }</td>
		<td align="center">${p.introduction }</td>
		<td align="center">
			<a href="${pageContext.request.contextPath}/user/doupdate?id=${p.id}"><img src="<%=basePath %>images/编辑.png"></a>
		</td>
		<td align="center">
			<a href="${pageContext.request.contextPath}/user/deleteUserById?id=${p.id}" onclick='return confirm("确认要删除吗?")'><img src="<%=basePath %>images/trash.gif"></a>
		</td>
	</tr>
</c:forEach>
</tbody>
</table>
<br/>


</body>
</html>