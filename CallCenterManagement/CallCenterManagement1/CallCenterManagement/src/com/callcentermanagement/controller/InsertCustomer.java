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

import com.callcentermanagement.bean.CustomerBean;
import com.callcentermanagement.connection.DbConFactory;
import com.callcentermanagement.dao.CustomerDao;

/**
 * Servlet implementation class InsertCustomer
 */
@WebServlet("/InsertCustomer")
public class InsertCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con=DbConFactory.getCon();
	CustomerBean cstobj=new CustomerBean();
	CustomerDao cstdao=new CustomerDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertCustomer() {
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
		cstobj.setCustomerAddress(request.getParameter("customer_address"));
		cstobj.setCustomerName(request.getParameter("customer_name"));
		cstobj.setCustomerSex(request.getParameter("customer_sex"));
		cstobj.setCustomerDateOfBirth(request.getParameter("date_of_birth"));
		cstobj.setCustomerEmailId(request.getParameter("email_id"));
		cstobj.setCustomerDateOfRegister(request.getParameter("date_of_register"));
		try{
			cstobj.setCustomerMobileNo(Long.parseLong(request.getParameter("customer_mobile")));
		}catch(NumberFormatException n){
			n.printStackTrace();
		}
		rows=cstdao.insertCustomer(cstobj);
		if(rows!=0)
		{
		out.println("<h2>"+"One record inserted.."+"</h2>");
		out.println("<a href='cust.jsp'>"+" Details  "+"</a>");
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
