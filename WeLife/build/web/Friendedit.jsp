<%@page import="edu.jlxy.Module.table.impl.FriendImpl"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="edu.jlxy.Module.entity.FriendEntity"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">

<title>Friend edit</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">


</head>

<body>
<%

	request.setCharacterEncoding("UTF-8");
	String uid=request.getParameter("uid");
	String fid=request.getParameter("fid");
	FriendEntity friendEntity=new FriendEntity();//此处不需要getInstance（）方法，因为我不需要全局对象的数据。
	friendEntity.setuid(uid);
	friendEntity.setfid(fid);
	FriendImpl friendImpl=new FriendImpl();
	String[][] info =friendEntity.getTheFriendInfomation(friendEntity);	
 %>
	<p>修改好友信息：</p>
	<form action="<%=request.getContextPath()%>/FriendEdit" method="post">
		<table width="55%" border="1" align="center">
			<tr>
				<td>你的姓名</td>
				<td>
					<input type="text" name="uid" id="uid" width="300px" value=<%=info[0][0] %> readonly="readonly">
				</td>
				
			</tr>
		
			<tr>
				<td>好友</td>
				<td>
					<input type="text" name="fid" id="fid" width="300px" value=<%=info[0][1] %> readonly="readonly">
				</td>
				
			</tr>
			<tr>
				<td>标签1</td>
				<td>
				<input type="text" name="l1" id="l1" width="300px" value=<%=info[0][2] %> >
				</td>
			</tr>
			<tr>
				<td>标签2</td>
				<td><input type="text" name="l2" id="l2" width="300px" value=<%=info[0][3] %> ></td>
			</tr>
			<tr>
				<td>标签3</td>
				<td><input type="text" name="l3" id="l3" width="300px" value=<%=info[0][4] %> ></td>
			</tr>
			<tr>
				<td>标签4</td>
				<td><input type="text" name="l4" id="l4" width="300px" value=<%=info[0][5] %> ></td>
			</tr>
			<tr>
				<td>标签5</td>
				<td><input type="text" name="l5" id="l5" width="300px" value=<%=info[0][6] %> ></td>
			</tr>
			<tr>
				
				<td>
					<input type="submit" name="button" id="button" width="300px" value="提交" >
					<input type="reset" name="button2" id="button2" width="300px" value="重置">
				</td>
			</tr>

		</table>

	</form>

</body>
</html>
