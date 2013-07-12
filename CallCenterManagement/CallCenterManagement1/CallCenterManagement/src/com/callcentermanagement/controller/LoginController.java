package com.callcentermanagement.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.callcentermanagement.connection.DbConFactory;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con=DbConFactory.getCon();
    static int a=0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			generate(request,response,"get");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			generate(request,response,"post");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void generate(HttpServletRequest request,HttpServletResponse response,String method) throws IOException,SQLException{
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		
		if(method.equals("get")){
			out.println("<font color ='red'><h3>Please come through a proper channel</h3></font>");
			}
		
		else if (method.equals("post"))	{
		String qry = "select * from employee_details where emp_id= ? and password= ?";
			PreparedStatement pst = con.prepareStatement(qry);
			int user=Integer.parseInt(request.getParameter("user"));
			String password=request.getParameter("password");
			pst.setInt(1, user);
			pst.setString(2, password);
	        ResultSet rs	= pst.executeQuery();
	        String st =null;
	        a=user;
		     int ctr=0;
				while(rs.next()){
					st = rs.getString("emp_designation");
					ctr++;
				}
				if(ctr==1){
					
					HttpSession sess=request.getSession(true);
					sess.setAttribute("username", user);
					sess.setAttribute("password", password);
					if(st.equals("admin")){
						response.sendRedirect("admin.jsp");
						}
					else if(st.equals("employee")){
							response.sendRedirect("employee.jsp");
						}
					
					
					
					else{
						response.sendRedirect("homepage.jsp");
					}
					
				}
		
				else{
					response.sendRedirect("autheneticationFailed.jsp");
				}
		}
		}
public static int userid(){
	return a;
}
}
