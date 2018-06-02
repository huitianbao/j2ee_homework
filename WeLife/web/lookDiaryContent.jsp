<%-- 
    Document   : lookDiaryContent
    Created on : 2018-6-2, 16:04:32
    Author     : 16221
--%>

<%@page import="edu.jlxy.Module.entity.DiaryEntity"%>
<%@page import="java.util.ArrayList"%>
<%@page import="edu.jlxy.Module.table.impl.DiaryImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
<title>Diary</title>
<link href="css3/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="css3/style.css" rel='stylesheet' type='text/css' />

<!-- jQuery (necessary JavaScript plugins) -->
<script type='text/javascript' src="js/js2/jquery-1.11.1.min.js"></script>
<!-- Custom Theme files -->
<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800|Titillium+Web:400,600,700,300' rel='stylesheet' type='text/css'>
<!-- Custom Theme files -->
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Game Spot Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
</head>
    <body>
    <!-- header -->
<div class="banner banner2">
  <div class="container">
    <div class="headr-right">
      <div class="details">
        <ul>
          <li><a href="mailto:@example.com"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>info(at)example.com</a></li>
          <li><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>(+1)000 123 456789</li>
        </ul>
      </div>
    </div>
    <div class="banner_head_top">
      <div class="logo">
        <h1><a href="HomePage.html">We<span class="glyphicon glyphicon-knight" aria-hidden="true"></span><span>Life</span></a></h1>
      </div>
      <div class="top-menu">
        <div class="content white">
          <nav class="navbar navbar-default"> 
            <!--<div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>				
						 </div>--> 
            <!--/navbar header-->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
              <ul class="nav navbar-nav">
                <li ><a href="index.jsp">Home</a></li>
                <li class="active"><a href="Diary.jsp">Diary</a></li>
                <li ><a href="AddFriend.html">New Friend</a></li>
                <li><a href="PersonalPage.html">My WeLife</a></li>
            <!--    <li><a href="shortcodes.html">Shortcodes</a></li>
                <li class="active">My WeLife</li>-->
              </ul>
            </div>
            <!--/navbar collapse--> 
          </nav>
          <!--/navbar--> 
        </div>
        <div class="clearfix"></div>
        <script type="text/javascript" src="js/js2/bootstrap-3.1.1.min.js"></script> 
      </div>
      <div class="clearfix"></div>
    </div>
  </div>
</div>
<!---->
<%
   
    String diaId=request.getParameter("diaId");
    DiaryImpl diaryImpl=new DiaryImpl();
    ArrayList<DiaryEntity> al=new ArrayList<>();
   al =diaryImpl.getList();
   String titleString=null;
   String contentString=null;
   for (int i=0;i<al.size();i++) {
           if(al.get(i).getDiaId().equals(diaId)){
           titleString=al.get(i).getTitle();
           contentString=al.get(i).getContent();
           
              }
       }
    
    %>
<div class="contact">
  <div class="container">
    <h2>Show Diary Content</h2>
    <div class="contact-form">
       
        
      <form action="<%=request.getContextPath()%>/Diary_handle" method="post">
          <input type="text" placeholder="Name" required name="title" value="<%=titleString%>">
          
          <br/>
           <textarea placeholder="Message" required name="context"><%=contentString.toString()%></textarea>
         
          
          
        
        <!--<input type="email" placeholder="Email" required>
	
        <input type="text" placeholder="Telephone" required>-->
        
      </form>
    </div>
  </div>
</div>
<!-- //contact --> 
<div class="copywrite">
  <div class="container">
    <p>Copyright &copy; 2018 WeLife 
          | Group No.11  - Designed by elites</p>
  </div>
</div>
<!---->

    </body>
</html>
