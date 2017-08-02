<%@ page language="java" import="java.util.*"
		 contentType="text/html; charset=UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head></head>
<body>

<h3>员工编辑</h3>

<br />
<br />
<!-- action对应一个action标签，id对应提交时的对应关系 -->
<form id="saveForm" action="${pageContext.request.contextPath}/user/updateuser" method="post">
	<input type="hidden" name="id" value="${user.id }" />
	<input type="hidden" name="type" value="${user.type }" />
	<table style="font-size: :16px">
		<tr>
			<td>手机号：</td>
			<td><input type="text" value="${user.phone }" name="phone" /></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type="text" value="${user.password }" name="password" /></td>
		</tr>
		<tr>
			<td>名字：</td>
			<td><input type="text" value="${user.name }" name="name" /></td>
		</tr>
		<tr>
			<td>昵称：</td>
			<td><input type="text" value="${user.nickname }" name="nickname" /></td>
		</tr>
		<tr>
			<td>年龄：</td>
			<td><input type="text" value="${user.age }" name="age" /></td>
		</tr>
		<tr>
			<td>性别：</td>
			<td><input type="text" value="${user.gender }" name="gender" /></td>
		</tr>
		<tr>
			<td>地址：</td>
			<td><input type="text" value="${user.address }" name="address" /></td>
		</tr>
		<tr>
			<td>职业：</td>
			<td><input type="text" value="${user.profession }" name="profession" /></td>
		</tr>
		<tr>

		<tr>
			<td>简介：</td>
			<td><input type="text" value="${user.introduction }" name="introduction" /></td>
		</tr>
		<tr>

			<td align="right">
				<input type="submit" value="更新" /> &nbsp;&nbsp;<a href="javascript:history.go(-1)">退回 </a>
		</tr>
	</table>
</form>
<!-- <tr>

    <td align="right"><a
        href="javascript:document.getElementById('saveForm').submit()">保存</a>
        &nbsp;&nbsp; <a href="javascript:history.go(-1)">退回 </a></td>
</tr>
 -->
</body>
</html>
