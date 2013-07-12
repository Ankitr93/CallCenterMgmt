package com.callcentermanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.callcentermanagement.bean.EmployeeBean;
import com.callcentermanagement.connection.DbConFactory;

public class EmployeeDao {
	Connection con=DbConFactory.getCon();
	PreparedStatement emppst=null;
	public int insertEmployee(EmployeeBean empobj){
		String empins="insert into employee_details(password,emp_name,date_of_birth,emp_sex,email_id,emp_address,emp_designation,emp_salary,date_of_join,emp_mobile) values(?,?,?,?,?,?,?,?,?,?)";
		try {
			emppst=con.prepareStatement(empins);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int rows = 0;
		try {
			emppst.setString(1,empobj.getEmpPassword());
			emppst.setString(2,empobj.getEmpName());
			emppst.setString(3,empobj.getEmpDateOfBirth());
			emppst.setString(4,empobj.getEmpSex());
			emppst.setString(5,empobj.getEmailId());
			emppst.setString(6,empobj.getEmpAddress());
			emppst.setString(7,empobj.getEmpDesignation());
			emppst.setFloat(8,empobj.getEmpSalary());
			emppst.setString(9,empobj.getEmpDateOfJoin());
			emppst.setLong(10,empobj.getEmpMobileNo());
            rows=emppst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return rows;
	}
public int updateEmployee(int empid,EmployeeBean empobj){
	String empupdt="update employee_details set password=?,email_id=?,emp_address=?,emp_mobile=? where emp_id=?";
	
	int rows = 0;
	try {
		emppst=con.prepareStatement(empupdt);
		emppst.setString(1,empobj.getEmpPassword());
		emppst.setString(2,empobj.getEmailId());
		emppst.setString(3,empobj.getEmpAddress());
		emppst.setLong(4,empobj.getEmpMobileNo());
		emppst.setInt(5,empid);
        rows=emppst.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
	return rows;
	
}
}
