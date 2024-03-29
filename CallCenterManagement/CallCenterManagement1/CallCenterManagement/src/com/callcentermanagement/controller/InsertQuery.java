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

import com.callcentermanagement.bean.EnquiryBean;
import com.callcentermanagement.connection.DbConFactory;
import com.callcentermanagement.dao.QueryDao;

/**
 * Servlet implementation class InsertQuery
 */
@WebServlet("/InsertQuery")
public class InsertQuery extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EnquiryBean enqobj=new EnquiryBean();
	QueryDao qrydao=new QueryDao();
    Connection con=DbConFactory.getCon();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertQuery() {
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
		try{
			enqobj.setEmpId(Integer.parseInt(request.getParameter("emp_id"))); 
		}catch(NumberFormatException a){
			a.printStackTrace();
		}
		enqobj.setQuery(request.getParameter("query"));
		try{
			enqobj.setCustomerId(Integer.parseInt(request.getParameter("customer_id")));
		}catch(NumberFormatException n){
			n.printStackTrace();
		}
		enqobj.setQuerySolution(request.getParameter("query_solution"));
		enqobj.setQueryStatus(request.getParameter("query_status"));
		enqobj.setDateOfQuery(request.getParameter("date_of_query"));
		rows=qrydao.insertQuery(enqobj);
		if(rows!=0)
		{
		out.println("<h2>"+"One record inserted.."+"</h2>");
		out.println("<a href='display.jsp'>"+" Details  "+"</a>");
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
