package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class delete_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!-- Remember to remove borders from around the first table. Try using another CSS file -->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=UTF-8\">\n");
      out.write("        <title>Product Maintenance</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/main.css\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Are you sure you want to delete this product?</h1>\n");
      out.write("        \n");
      out.write("    <!-- Table starts here -->    \n");
      out.write("        <table>\n");
      out.write("    <tr>\n");
      out.write("        <td>Code:</td>\n");
      out.write("        <td><input type=\"text\" name=\"code\" required></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>Description:</td>\n");
      out.write("        <td><input type=\"text\" name=\"description\" required></td2>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>Price:</td>\n");
      out.write("        <td><input type=\"number\" name=\"price\" required></td>\n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write("<br>\n");
      out.write("    <!-- Table starts here -->  \n");
      out.write("<table>\n");
      out.write("    <tr>\n");
      out.write("        <form action=\"\" method=\"post\">\n");
      out.write("        <input type=\"hidden\" name=\"action\" value=\"Yes\">\n");
      out.write("        <input type=\"submit\" value=\"Yes\">\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <form action=\"products.jsp\" method=\"post\">\n");
      out.write("        <input type=\"hidden\" name=\"action\" value=\"No\">\n");
      out.write("        <input type=\"submit\" value=\"No\">\n");
      out.write("        </form>\n");
      out.write("    </tr>\n");
      out.write("            \n");
      out.write("</table>    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
