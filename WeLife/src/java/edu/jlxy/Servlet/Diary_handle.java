/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.jlxy.Servlet;

import edu.jlxy.Module.entity.DiaryEntity;
import edu.jlxy.Module.table.impl.DiaryImpl;
import edu.jlxy.util.ConnectionFactory;
import edu.jlxy.util.DateUtil_htb;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 16221
 */
public class Diary_handle extends HttpServlet {
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
        String content = request.getParameter("context");

        //  测试数据
        /*
        System.out.println("the title is "+title+"the content is "+content);
        PrintWriter pw=response.getWriter();
        pw.write("the title is "+title+"<br/>");
        pw.write("the conent is "+content+"<br/>");

         */
        //============================================================================
        //数据库 操作
        //(1)  封装实体
        DiaryEntity de = new DiaryEntity();
        DateUtil_htb dateUtil_htb = new DateUtil_htb();

       
        HttpSession session = request.getSession();// 获取session
        String curruentUser = session.getAttribute("currentuser").toString();
        String permission =session.getAttribute("permission").toString();  // 写一个逻辑
    
        Date date = new Date(System.currentTimeMillis());
        String dateString = dateUtil_htb.getTime_String(date);

        //                      userId     title, content, date
        // de.set_without_diaLd(curruentUser, title, content, dateString);
        de.set_without_diaLd_without_permission(curruentUser, title, content, dateString);
        
        
        //(2) 将数据插入数据库  
        
        DiaryImpl di=new DiaryImpl();
        try {
            di.insert(connection, de);
            
        } catch (SQLException ex) {
            Logger.getLogger(Diary_handle.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        request.getRequestDispatcher("/index.jsp").forward(request, response);
        
        
        //(3) 遍历数据库 把  数据呈现出来
//        ArrayList<DiaryEntity> al_result=di.getList();
//        request.setAttribute("al_result", al_result);
//        
//request.getRequestDispatcher("showDiary.jsp").forward(request, response);
       
  
        
        

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);

    }

}
