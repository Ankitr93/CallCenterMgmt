<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<html>
<head>
<title>Display Employee Details</title>
</head>
<body bgcolor="grey">



<pre>

                                                                                                        <a href ='logout.do'>[Logout]</a>

</pre>
    
                                                                                                       
<%
try {

String connectionURL = "jdbc:mysql://localhost:3306/call_centre_management";

Connection connection = null;

Statement statement = null;

ResultSet rs = null;

Class.forName("com.mysql.jdbc.Driver").newInstance();

connection = DriverManager.getConnection(connectionURL, "root", "");

statement = connection.createStatement();
String QueryString = "SELECT * from employee_details";
rs = statement.executeQuery(QueryString);
%>
<font color="blue"><center><u><h2>Details of Employee </h2></u></center></font>

<table align="center" cellpadding="25" border="1" style="background-color: #ffffcc;">

<tr>
<th>EmpID</th>
<th>Password</th>
<th>Name</th>
<th>Date of Birth</th>
<th>Sex</th>
<th>E mail</th>
<th>Address</th>
<th>Designation</th>
<th>Salary</th>
<th>Date of Join</th>
<th>ContactNo.</th>
</tr>



<%
while (rs.next()) {
%>
<tr>
<td><%=rs.getInt(1)%></td>
<td><%=rs.getString(2)%></td>
<td><%=rs.getString(3)%></td>
<td><%=rs.getString(4)%></td>
<td><%=rs.getString(5)%></td>
<td><%=rs.getString(6)%></td>
<td><%=rs.getString(7)%></td>
<td><%=rs.getString(8)%></td>
<td><%=rs.getFloat(9)%></td>
<td><%=rs.getString(10)%></td>
<td><%=rs.getLong(11)%></td>

</tr>
<% } %>
<%
rs.close();
statement.close();
connection.close();
} catch (Exception ex) {
%>

<font size="+3" color="red">
<%
out.println("Unable to connect to database.");
}
%>
</font>
</table>

<form action="admin.jsp" method="get" >
<button type="submit"> Back</button>
</form>


</body>
</html>