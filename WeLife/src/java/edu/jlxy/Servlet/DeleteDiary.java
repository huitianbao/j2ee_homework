/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.jlxy.Servlet;

import edu.jlxy.Module.entity.DiaryEntity;
import edu.jlxy.Module.table.impl.DiaryImpl;
import edu.jlxy.util.ConnectionFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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
public class DeleteDiary extends HttpServlet {
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            // 1 连接数据库
            ConnectionFactory cf = ConnectionFactory.getInstance();
            Connection connection = cf.makeConnection();
            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html;charset=utf-8");
            
            DiaryEntity diaryEntity=new DiaryEntity();
            DiaryImpl diaryImpl=new DiaryImpl();
            //HttpSession session = request.getSession();// 获取session
           // String curruentUser = session.getAttribute("currentuser").toString();
          
            diaryEntity.setUserId(request.getParameter("userId"));
            diaryEntity.setTitle(request.getParameter("title"));
            
            diaryImpl.delete(connection, diaryEntity);
            
            response.sendRedirect("http://localhost:8888/WeLife/PersonalPage.jsp");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DeleteDiary.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } 

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
    }

  
}
