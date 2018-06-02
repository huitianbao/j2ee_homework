/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upload;

import edu.jlxy.Module.entity.FileEntity;
import edu.jlxy.Module.entity.SendDynamicEntity;
import edu.jlxy.Module.table.SendDynamic;
import edu.jlxy.Module.table.impl.FileImpl;
import edu.jlxy.util.ConnectionFactory;
import edu.jlxy.util.DateUtil_htb;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author 16221
 */
public class TestUpload {

    public static void main(String[] args) {
        // 1 连接数据库
        ConnectionFactory cf = ConnectionFactory.getInstance();
        Connection connection = cf.makeConnection();

        // 封装实体
        FileEntity fileEntity = new FileEntity();
        FileImpl fileImpl = new FileImpl();
        Date date = new Date(System.currentTimeMillis());
        DateUtil_htb dateUtil_htb = new DateUtil_htb();
        String dateString = dateUtil_htb.getTime_String(date);

        fileEntity.setName("name4");
        fileEntity.setSize("size 4");
        fileEntity.setType("type4");
        fileEntity.setAddTime(dateString);
        fileEntity.setFile_path("filepath4");
        fileEntity.setInfo("infor4");
        
        //========================================================================
        SendDynamicEntity sendDynamicEntity=new SendDynamicEntity();
        sendDynamicEntity.setUid("2");
        sendDynamicEntity.setDid("12");
        
        
        
        
        fileImpl.saveFile(fileEntity, "photophoto444444", sendDynamicEntity);

    }

}
