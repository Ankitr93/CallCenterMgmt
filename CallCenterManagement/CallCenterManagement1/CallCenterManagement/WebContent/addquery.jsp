<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<html>
<head>
<title>Display Query Details</title>
</head>
<body bgcolor="#CDFFFF">



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
String QueryString = "SELECT * from enquiry_details";
rs = statement.executeQuery(QueryString);
%>
<font color="blue"><center><u><h2>Details of Query </h2></u></center></font>

<table align="center" cellpadding="25" border="1" style="background-color: grey">

<tr>
<th>query id</th>
<th>employee id</th>
<th>customer id</th>
<th>query</th>
<th>query solution</th>
<th>status</th>
<th>date of query</th>
</tr>



<%
while (rs.next()) {
%>
<tr>
<td><%=rs.getInt(1)%></td>
<td><%=rs.getInt(2)%></td>
<td><%=rs.getInt(3)%></td>
<td><%=rs.getString(4)%></td>
<td><%=rs.getString(5)%></td>
<td><%=rs.getString(6)%></td>
<td><%=rs.getString(7)%></td>
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

<form action="query1.jsp" method="get" >
<button type="submit"> Back</button>
</form>


</body>
</html>