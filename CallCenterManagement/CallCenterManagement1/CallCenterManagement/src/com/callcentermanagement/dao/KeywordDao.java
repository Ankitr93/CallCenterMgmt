package com.callcentermanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.callcentermanagement.bean.KeywordBean;
import com.callcentermanagement.connection.DbConFactory;

public class KeywordDao {
Connection con=DbConFactory.getCon();
PreparedStatement keypst=null;
ResultSet keyrs=null;

public int insertKeyword(KeywordBean keyobj){
	String keyins="insert into keyword(keyword,key_description,date_of_entry) values(?,?,?)";
	int rows = 0;
	try {
		keypst=con.prepareStatement(keyins);
		keypst.setString(1,keyobj.getKeyword());
		keypst.setString(2,keyobj.getKeyDescription());
		keypst.setString(3,keyobj.getKeyDateOfEntry());
        rows=keypst.executeUpdate();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
	return rows;
  }
public ResultSet searchKeyword(String key){
	String keysrch="select * from keyword where keyword=?";
	try {
		keypst=con.prepareStatement(keysrch);
		keypst.setString(1, key);
		keyrs=keypst.executeQuery();
	}catch(SQLException x){
		x.printStackTrace();
	}
	return keyrs;
  }
}
