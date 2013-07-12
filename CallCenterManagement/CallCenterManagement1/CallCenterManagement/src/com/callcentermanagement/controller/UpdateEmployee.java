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
 * Servlet implementation class UpdateQuery
 */
@WebServlet("/UpdateEmployee")
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con=DbConFactory.getCon();
	EmployeeBean empobj=new EmployeeBean();
	EmployeeDao empdao=new EmployeeDao();
	int id=0;
	int rows=0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmployee() {
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
		id=LoginController.userid();
		if(request.getParameter("password")!=null){
		empobj.setEmpPassword(request.getParameter("password"));
		}
		if(request.getParameter("email_id")!=null){
		empobj.setEmailId(request.getParameter("email_id"));
		}
		if(request.getParameter("emp_address")!=null){
		empobj.setEmpAddress(request.getParameter("emp_address"));
		}
		try{
			empobj.setEmpMobileNo(Long.parseLong(request.getParameter("emp_mobile")));
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
		rows=empdao.updateEmployee(id, empobj);
		if(rows!=0)
		{
		out.println("<h2>"+"Your record updated..."+"</h2>");
		out.println("<a href='emp.jsp'>"+" Details  "+"</a>");
		}
		else
		{
		out.println("<h2>"+"updation failed.. please try again.."+"</h2>");


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
