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

import com.callcentermanagement.connection.DbConFactory;
import com.callcentermanagement.dao.QueryDao;

/**
 * Servlet implementation class UpdateQuery
 */
@WebServlet("/UpdateQuery")
public class UpdateQuery extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con=DbConFactory.getCon();
	QueryDao qrydao=new QueryDao();
	int queryId=0;
	String querySol=null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateQuery() {
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
		int rows = 0;
		if(request.getParameter("query_id")!=null)
		{
			queryId=Integer.parseInt(request.getParameter("query_id"));
		}
		querySol=request.getParameter("query_solution");
		rows=qrydao.updateQuery(queryId, querySol);
		if(rows!=0)
		{
		out.println("<h2>"+"The Query updated..."+"</h2>");
		out.println("<a href='pending.jsp'>"+" Details  "+"</a>");
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
