/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.41
 * Generated at: 2013-07-08 06:39:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>home</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"grey\"><pre><H1><font color=\"crimson\"> C-CARE </font> <a><img alt=\"c-care\" src=\"C:\\Users\\SHAMIK\\CallCenterManagement1\\a.jpg\" align=\"centre\" height=\"150\"width=\"300\"></a></H1></pre>\r\n");
      out.write("<pre><h3><u><a href=\"#\">Home</a></b>|<a href=\"services.jsp\"><b>Solution&Services</a></b>|<a href=\"feedback.jsp\"><b>feedback</a></b>|<a href=\"contactus.jsp\"><b>Contact us</b></a></u></h3>\r\n");
      out.write("\r\n");
      out.write("<centre> <h2>          CUSTOMER Care center, also known as customer  interaction center\r\n");
      out.write("          is the department where  Customers can call and ask about solution\r\n");
      out.write("          to their problem , and we at C-CARE Solutions accept this responsibility \r\n");
      out.write("          with uberrmia fides. </h2></centre>\r\n");
      out.write("     </font></pre></br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                           \r\n");
      out.write("                           \r\n");
      out.write("    \r\n");
      out.write(" \r\n");
      out.write("   <center> <a><img src=\"C:\\Users\\SHAMIK\\CallCenterManagement1\\b.jpg\"  height=\"250\" width=\"900\"></a><br></center>\r\n");
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<pre>     <form method=\"post\" action=\"LoginController\">                                                \r\n");
      out.write("                                      UserID:  <input type=\"text\" name=\"user\"required/><br/>\r\n");
      out.write("                                      Password:<input type=\"password\" name=\"password\"required/><br>\r\n");
      out.write("                                                          \r\n");
      out.write("                                          <input type=\"submit\" value=\"Login\"></input></form>\r\n");
      out.write("                                             \r\n");
      out.write("</pre>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}