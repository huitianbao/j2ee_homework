package edu.jlxy.Module.table;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.jlxy.Module.entity.DiaryEntity;
import java.util.ArrayList;

public interface Diary {

	public void insert(Connection connection, DiaryEntity diaryEntity) throws SQLException;
        public void insert_without_diaId_and_permission(Connection connection, DiaryEntity diaryEntity);

	public void update(Connection connection, DiaryEntity diaryEntity) throws SQLException;

	public void delete(Connection connection, DiaryEntity diaryEntity) throws SQLException;
        public void delete_usediaId(Connection connection, DiaryEntity diaryEntity) throws SQLException;

	public ResultSet query_all(Connection connection) throws SQLException;
        
        public ArrayList<DiaryEntity> getList();

}
