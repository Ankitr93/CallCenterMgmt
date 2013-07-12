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

import com.callcentermanagement.bean.KeywordBean;
import com.callcentermanagement.connection.DbConFactory;
import com.callcentermanagement.dao.KeywordDao;

/**
 * Servlet implementation class InsertKeyword
 */
@WebServlet("/InsertKeyword")
public class InsertKeyword extends HttpServlet {
	private static final long serialVersionUID = 1L;
	KeywordBean keyobj=new KeywordBean();
    Connection con=DbConFactory.getCon();
    KeywordDao keydao=new KeywordDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertKeyword() {
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
		keyobj.setKeyword(request.getParameter("keyword"));
		keyobj.setKeyDescription(request.getParameter("key_description"));
		keyobj.setKeyDateOfEntry(request.getParameter("date_of_entry"));
		rows=keydao.insertKeyword(keyobj);
		
		if(rows!=0)
		{
		out.println("<h2>"+"One record inserted.."+"</h2>");
		out.println("<a href='keydetails.jsp'>"+" Details  "+"</a>");
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