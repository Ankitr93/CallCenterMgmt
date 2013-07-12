package com.callcentermanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.callcentermanagement.bean.CustomerBean;
import com.callcentermanagement.connection.DbConFactory;

public class CustomerDao {
	Connection con=DbConFactory.getCon();
	PreparedStatement cstpst=null;
    public int insertCustomer(CustomerBean cstobj){
		
		String cstins="insert into customer_details(customer_name,customer_sex,date_of_birth,email_id,customer_mobile,customer_address,date_of_register) values(?,?,?,?,?,?,?)";
		try {
			cstpst=con.prepareStatement(cstins);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int rows = 0;
		try {
			cstpst.setString(1,cstobj.getCustomerName());
			cstpst.setString(2,cstobj.getCustomerSex());
			cstpst.setString(3,cstobj.getCustomerDateOfBirth());
			cstpst.setString(4,cstobj.getCustomerEmailId());
			cstpst.setLong(5,cstobj.getCustomerMobileNo());
			cstpst.setString(6,cstobj.getCustomerAddress());
			cstpst.setString(7,cstobj.getCustomerDateOfRegister());
            rows=cstpst.executeUpdate();
 		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return rows;
    	
    }
}
