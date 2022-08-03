package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class selectEmp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Select Employee </title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <font size=\"3\" color=\"black\">\n");
      out.write("                <div>\n");
      out.write("                    <table Border=\"10\" Align=\"center\">\n");
      out.write("                        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/SelectEmployeeServlet\" method=\"Post\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td style=\"font-weight: bold\">Enter Id or Name</td>\n");
      out.write("                                <td><input type=\"text\" name=\"data\" /></td>\n");
      out.write("                                <td> <input type=\"submit\" name=\"submit\"></td>\n");
      out.write("                                 \n");
      out.write("                            </tr>\n");
      out.write("                           \n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("                    <table style=\"margin-top: 10px\" border=\"10\" Align=\"center\">\n");
      out.write("\n");
      out.write("                        <form>\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th style=\"font-weight: bold\">Employee Id</th>\n");
      out.write("                                    <th style=\"font-weight: bold\">First Name</th>\n");
      out.write("                                    <th style=\"font-weight: bold\">Last Name</th>\n");
      out.write("                                    <th style=\"font-weight: bold\">Position</th>\n");
      out.write("                                    <th style=\"font-weight: bold\">Salary</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("\n");
      out.write("                                \n");
      out.write("                                <tr >\n");
      out.write("                                    <th>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${E.getEmpId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\n");
      out.write("                                    <th><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${E.getFirstName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p></th>\n");
      out.write("                                    <th><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${E.getLastName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p></th>\n");
      out.write("                                    <th><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${E.getPosition()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p></th>\n");
      out.write("                                    <th><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${E.getSalary()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p></th>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </form>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                </font>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
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
