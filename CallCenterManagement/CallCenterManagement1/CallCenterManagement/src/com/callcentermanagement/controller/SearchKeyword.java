package com.callcentermanagement.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.callcentermanagement.connection.DbConFactory;
import com.callcentermanagement.dao.KeywordDao;

/**
 * Servlet implementation class SearchKeyword
 */
@WebServlet("/SearchKeyword")
public class SearchKeyword extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con=DbConFactory.getCon();
	KeywordDao keydao=new KeywordDao();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchKeyword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String key=request.getParameter("keyword");
		ResultSet keyrs = keydao.searchKeyword(key);
		request.setAttribute("keyrs",keyrs);
		RequestDispatcher rd= request.getRequestDispatcher("showkey.jsp");
		rd.forward(request, response);
		try {
			con.close();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}

}
