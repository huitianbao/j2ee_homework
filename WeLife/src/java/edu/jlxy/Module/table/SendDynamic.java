/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.Module.table;

import edu.jlxy.Module.entity.SendDynamicEntity;
import edu.jlxy.Module.table.impl.SendDynamicImpl;
import edu.jlxy.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author 16221
 */
public interface SendDynamic {

    public void inseret(Connection connection, SendDynamicEntity sendDynamicEntity);

    public void delete(Connection connection, SendDynamicEntity sendDynamicEntity);

    public void quarrayAll(Connection connection);

    public ResultSet quarrayAll_ResultSet(Connection connection);

    public ResultSet getCurrentUserDynamic(Connection connection, String uid);

    public ResultSet getOneRowByUidAndDid(Connection connection, String uid, String did);
    
    public ArrayList<SendDynamicEntity> getList();

  
    
    
    

}
