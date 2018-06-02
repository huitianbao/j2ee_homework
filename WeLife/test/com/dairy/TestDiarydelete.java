/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dairy;

import edu.jlxy.Module.entity.DiaryEntity;
import edu.jlxy.Module.table.impl.DiaryImpl;
import edu.jlxy.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author 16221
 */
public class TestDiarydelete {
    
    public static void main(String[] args) throws SQLException {
        // 1 连接数据库
        ConnectionFactory cf = ConnectionFactory.getInstance();
        Connection connection = cf.makeConnection();
        
        //2
        
        DiaryEntity diaryEntity=new DiaryEntity();
        DiaryImpl diaryImpl=new DiaryImpl();
       
        diaryEntity.setUserId("2");
        diaryEntity.setTitle("t4");
        
       diaryImpl.delete(connection, diaryEntity);
        
        
        
    }
    
}
