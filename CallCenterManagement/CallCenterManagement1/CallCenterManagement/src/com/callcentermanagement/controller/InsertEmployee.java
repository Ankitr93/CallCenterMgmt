package com.callcentermanagement.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.callcentermanagement.bean.EmployeeBean;
import com.callcentermanagement.connection.DbConFactory;
import com.callcentermanagement.dao.EmployeeDao;

/**
 * Servlet implementation class InsertEmployee
 */
@WebServlet("/InsertEmployee")
public class InsertEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con=DbConFactory.getCon();
	EmployeeBean empobj=new EmployeeBean();
    EmployeeDao empdao=new EmployeeDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int rows=0;
		empobj.setEmpPassword(request.getParameter("password"));
		empobj.setEmpName(request.getParameter("emp_name"));
		empobj.setEmpDateOfBirth(request.getParameter("date_of_birth"));
		empobj.setEmpSex(request.getParameter("emp_sex"));
		empobj.setEmailId(request.getParameter("email_id"));
		empobj.setEmpAddress(request.getParameter("emp_address"));
		empobj.setEmpDesignation(request.getParameter("emp_designation"));
		try{
			empobj.setEmpSalary(Float.parseFloat(request.getParameter("emp_salary")));
		}catch(NumberFormatException n)
		{
			n.printStackTrace();
		}
		empobj.setEmpDateOfJoin(request.getParameter("date_of_join"));
		try{
			empobj.setEmpMobileNo(Long.parseLong(request.getParameter("emp_mobile")));
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
		rows=empdao.insertEmployee(empobj);
		if(rows!=0)
		{
			out.println("<h2>"+"One record inserted.."+"</h2>");
			out.println("<a href='emp.jsp'>"+" Details  "+"</a>");
		}
		else
		{
			out.println("<h2>"+"insertion failed.. please try again.."+"</h2>");
       	
			
		}
		out.println("</body></html>");
		out.close();
		try {
			con.close();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}

}
