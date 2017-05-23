package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<head>\n");
      out.write("<title></title>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> <style type=\"text/css\">\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("\n");
      out.write(".style1 { font-size: 18px; font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("--> </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<table width=\"439\" border=\"0\" bgcolor=\"#0000FF\">\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td width=\"91\" bgcolor=\"#00FFFF\"><div align=\"center\" class=\"style1\"><a href=\"TagMenu.jsp?link=home\">Home</a></div></td>\n");
      out.write("\n");
      out.write("<td width=\"83\" bgcolor=\"#00FFFF\"><div align=\"center\" class=\"style1\"><a href=\"TagMenu.jsp?link=produk\">Produk</a></div></td>\n");
      out.write("\n");
      out.write("<td width=\"101\" bgcolor=\"#00FFFF\"><div align=\"center\" class=\"style1\"><a href=\"TagMenu.jsp?link=kontak\">Kontak</a></div></td>\n");
      out.write("\n");
      out.write("<td width=\"136\" bgcolor=\"#00FFFF\"><div align=\"center\" class=\"style1\"><a href=\"TagMenu.jsp?link=tentang\">Tentang Kami</a> </div></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
