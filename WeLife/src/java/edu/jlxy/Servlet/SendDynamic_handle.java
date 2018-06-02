

package edu.jlxy.Servlet;

import edu.jlxy.Module.entity.FileEntity;
import edu.jlxy.Module.entity.SendDynamicEntity;
import edu.jlxy.Module.table.impl.FileImpl;
import edu.jlxy.Module.table.impl.SendDynamicImpl;
import edu.jlxy.util.ConnectionFactory;
import edu.jlxy.util.DateUtil_htb;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 16221
 */
public class SendDynamic_handle extends HttpServlet {
   
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 1 连接数据库
        ConnectionFactory cf = ConnectionFactory.getInstance();
        Connection connection = cf.makeConnection();
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        try {
            System.out.println(connection.getAutoCommit());
        } catch (SQLException e1) {
            e1.printStackTrace();
        }

        // 2  获得数据
        String title = request.getParameter("title");
        String content = request.getParameter("content");
       // String photo = request.getParameter("photo");
       //  就目前来说，只能 取出 file 表里的最后一记录来进行匹配了
       FileEntity fileEntity=new FileEntity();
       FileImpl fileImpl=new FileImpl();
       
       // 获取最后一条记录的 photoURL
       String photoString=fileImpl.getList().get(fileImpl.getList().size()-1).getFile_path();
       
       System.out.println("the phtotString is"+photoString);
       

        //  String curruentUser=this.getServletConfig().getInitParameter("currentuser");
        HttpSession session = request.getSession();// 获取session
        String curruentUser = session.getAttribute("currentuser").toString();

        /*
        PrintWriter pw=response.getWriter();
        pw.write("the title is "+title+"<br/>");
        pw.write("the content is "+content+"<br/>");
        pw.write("the photo is "+photo+"<br/>");
        pw.write("the current user is "+curruentUser+"<br/>");

         */
        // 下面对数据库进行操作
        //1  将获得的数据送入数据库
        //(1)  封装实体
        SendDynamicEntity sendDynamicEntity = new SendDynamicEntity();
        Date date = new Date(System.currentTimeMillis());

        DateUtil_htb dateUtil_htb = new DateUtil_htb();
        String dateString = dateUtil_htb.getTime_String(date);
        //                                   uid   did(自增)
        sendDynamicEntity.setAll_withoutdid(curruentUser, title, content, photoString, dateString);

        //(2) 将数据插入数据库  
        SendDynamicImpl sendDynamicImpl = new SendDynamicImpl();

         sendDynamicImpl.inseret_withoutdid(connection, sendDynamicEntity);
        sendDynamicImpl.quarrayAll(connection);
        //插入成功  完美
        // 遍历数据库 把  数据呈现出来
       // ResultSet resall = sendDynamicImpl.quarrayAll_ResultSet(connection);
       
       
       // 跳回  jsp
       response.sendRedirect("http://localhost:8888/WeLife/PersonalPage.jsp");
      

        
       

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
