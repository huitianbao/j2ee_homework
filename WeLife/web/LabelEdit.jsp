<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@page import="edu.jlxy.Module.table.impl.FriendImpl"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="edu.jlxy.Module.entity.FriendEntity"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>设置标签</title>
<link rel="stylesheet" href="css2/labelEditStyle.css">
<script src="js2/labelEdit.min.js"></script>
<script>
	jQuery(document).ready(function($) {
		$('.theme-login').click(function() {
			$('.theme-popover-mask').fadeIn(100);
			$('.theme-popover').slideDown(200);
		})
		$('.theme-poptit .close').click(function() {
			$('.theme-popover-mask').fadeOut(100);
			$('.theme-popover').slideUp(200);
		})

	})
</script>

</head>

<body>
<%

	request.setCharacterEncoding("UTF-8");
	/* String uid=request.getParameter("1");
	String fid=request.getParameter("3"); */
	FriendEntity friendEntity=new FriendEntity();//此处不需要getInstance（）方法，因为我不需要全局对象的数据。
	friendEntity.setuid("1");
	friendEntity.setfid("4");
	FriendImpl friendImpl=new FriendImpl();
	String[][] info =friendEntity.getTheFriendInfomation(friendEntity);	
 %>
	<div class="theme-buy">
		<a class="btn btn-primary btn-large theme-login" href="javascript:;">点击查看效果</a>
	</div>
	<div class="theme-popover">
		<div class="theme-poptit">
			<a href="javascript:;" title="关闭" class="close">×</a>
			<h3>设置标签</h3>
		</div>
		<div class="theme-popbod dform" style="height: 105px; ">
			<form name="addFriend"  method="post" style="height: 55px; ">			
				你的姓名:<input type="text" name="uid" id="uid" width="300px" value=<%=info[0][0] %> readonly="readonly"><br>	<br>	
				好友       :&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="fid" id="fid" width="300px" value=<%=info[0][1] %> readonly="readonly"><br><br>
				标签1:  &nbsp;&nbsp;<input type="text" name="l1" id="l1" width="300px" value=<%=info[0][2] %> ><br><br>	
				标签2:  &nbsp;&nbsp;<input type="text" name="l2" id="l2" width="300px" value=<%=info[0][3] %> ><br><br>
         		标签3:  &nbsp;&nbsp;<input type="text" name="l3" id="l3" width="300px" value=<%=info[0][4] %> ><br><br>
                                标签4:  &nbsp;&nbsp;<input type="text" name="l4" id="l4" width="300px" value=<%=info[0][5] %> ><br><br>
                                标签5:  &nbsp;&nbsp;<input type="text" name="l5" id="l5" width="300px" value=<%=info[0][6] %> ><br><br>
					<input type="submit" name="button" id="button" width="300px" value="提交" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;<input type="reset" name="button2" id="button2" width="300px" value="重置">
				
			</form>
		</div>
		</div>
	<div class="theme-popover-mask"></div>
</body>

</html>
