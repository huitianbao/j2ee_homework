<%-- 
    Document   : showDiary
    Created on : 2018-5-27, 21:52:25
    Author     : 16221
--%>
<%@page import="edu.jlxy.Module.table.impl.DiaryImpl"%>
<%@page import="edu.jlxy.Module.entity.DiaryEntity"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        
        <meta http-equiv="pragma" content="no-cache">  
        <meta http-equiv="cache-control" content="no-cache">  
        <meta http-equiv="expires" content="0">      
        <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
        <meta http-equiv="description" content="This is my page">  
        <style type="text/css">
            .contact-form {
    margin: 3em 0 0;
	padding-bottom: 2em;
}
.contact-form input[type="text"] {
  display: inline-block;
  background: none;
  border: 1.5px solid #6e6e6e;
  width: 100%;
  outline: none;
  padding: 10px 15px 10px 15px;
  font-size: .9em;
  font-weight: 400;
  color: #111111;
  margin-bottom: 1.5em;
}
.contact-form input[type="email"] {
	display: inline-block;
	background: none;
	border: 1.5px solid #CBCBCB;
	width: 100%;
	outline: none;
	padding: 10px 15px 10px 15px;
	font-size: .9em;
	font-weight: 400;
	color: #111111;
	margin: 0 1.25em;
}
.contact-form textarea {
	background: none;
	border: 1.5px solid #6e6e6e;
	width: 100%;
	display: block;
	height: 150px;
	outline: none;
	font-size: 0.9em;
	color: #111111;
	font-weight: 400;
	resize: none;
	padding: 10px 15px 10px 15px;
	margin-bottom:2em;
}
button.btn1.btn-1.btn-1b {
    color: #FFF;
    border: none;
    background:#0dc5dd;
    padding: .5em 1.5em;
    font-size: 1em;
    outline: none;
	border:2px solid #0dc5dd;
}
            table {
	background-image: url(images/bgt.png);
	table-layout: fixed;
	empty-cells: show;
	border-collapse: collapse;
	margin: 0 auto;
}
td {
	height: 20px;
}
h1, h2, h3 {
	font-size: 12px;
	margin: 0;
	padding: 0;
}
/*这个是借鉴一个论坛的样式*/
table.t1 {
	border: 1px solid #9DB3C5;
	color: #666;
}
table.t1 th {
 background-repeat::repeat-x;
	height: 30px;
}
table.t1 td, table.t1 th {
	border: 1px solid #ffffff;
	padding: 0 1em 0;
        
}
.banner{
	background:url(../images/c1.jpg) no-repeat 0px 0px;
	background-size:cover;
	min-height:790px;	
}
            
        </style>


   <script>
            function return(){
                location.href="http://localhost:8080/WeLife/Diary.jsp";
            }
        </script>
        <title>JSP Page</title>
    </head>
    <body>
     
        
        <div class="banner">
        <h1>this is show   diary page</h1>
        <a href="/WeLife/Diary.jsp"> 返回</a>
        <%
            DiaryImpl di = new DiaryImpl();
            ArrayList<DiaryEntity> al = new ArrayList<>();
            al = di.getList();

        %>


<!--        <table border = 1px align = "center">  -->
 <table width="90%" border="1" class="t1">
            <tr>  
                <th>diaId</th>  
                <th>userId</th>  
                <th>title</th>  
                <th>content</th> 
                <th>date</th>
                <th>permission</th>
            </tr>  
            

            <%            for (int i = 0; i < al.size(); i++) {
                DiaryEntity de = (DiaryEntity) al.get(i);%>

            <tr> 
                <th><%=de.getDiaId()%></th>
                <th><%=de.getUserId()%></th>
                <th><%=de.getTitle()%></th>
                <th><%=de.getContent()%></th>
                <th><%=de.getDate()%></th>
                <th><%=de.getPermission()%></th><br/>

        </tr>

        <% }
        %>  
    </table> 
    
    
</div>

</body>
</html>
