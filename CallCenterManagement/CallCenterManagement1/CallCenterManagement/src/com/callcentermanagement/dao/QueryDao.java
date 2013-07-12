package com.callcentermanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.callcentermanagement.bean.EnquiryBean;
import com.callcentermanagement.connection.DbConFactory;

public class QueryDao {
	Connection con=DbConFactory.getCon();
    PreparedStatement enqpst=null;
    public int insertQuery(EnquiryBean enqobj){
    	String qryins="insert into enquiry_details(emp_id,customer_id,query,query_solution,query_status,date_of_query) values(?,?,?,?,?,?)";
    	try {
			enqpst=con.prepareStatement(qryins);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int rows = 0;
		 try {
				enqpst.setInt(1,enqobj.getEmpId());
				enqpst.setInt(2,enqobj.getCustomerId());
				enqpst.setString(3,enqobj.getQuery());
				enqpst.setString(4,enqobj.getQuerySolution());
				enqpst.setString(5,enqobj.getQueryStatus());
				enqpst.setString(6,enqobj.getDateOfQuery());
	            rows=enqpst.executeUpdate();
	 		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
	  
		return rows;
     }
  public int updateQuery(int qryId,String qrySol){
	int rows = 0;
	String enqupdt="update enquiry_details set query_solution=?,query_status=? where enquiry_id=?";
    try{
    	enqpst=con.prepareStatement(enqupdt);
    	enqpst.setString(1, qrySol);
    	enqpst.setString(2,"done");
    	enqpst.setInt(3, qryId);
    	rows=enqpst.executeUpdate();
    }catch(SQLException e){
    	e.printStackTrace();
    }
	return rows;
	  
  }
}
