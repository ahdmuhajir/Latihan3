package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tugas1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" <!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <body bgcolor=white>\n");
      out.write("        <form action=proseslatform.jsp method=post> <table border=1>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=2>DATA</td> </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Name :</td>\n");
      out.write("                    <td><input\ttype=text name=nama></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\t\n");
      out.write("                    <td>Jenis Kelamin\t:</td>\n");
      out.write("                    <td><input\ttype=radio name=gender value=M checked>Laki Laki\n");
      out.write("                        <input\ttype=radio  name=gender value=F>Perempuan </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\t\n");
      out.write("                    <td>Status Perkawinan :</td> <td>\n");
      out.write("                        <input type=checkbox name=hoby1 value=berenang> Kawin <input type=checkbox name=hoby2 value=makan> Belum Kawin\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\t\n");
      out.write("                    <td>Kebangsaan :</td>\n");
      out.write("                    <td><input\ttype=text </td>\n");
      out.write("                </tr>\t\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                <tr>\t\n");
      out.write("                    <td>Email :</td>\n");
      out.write("                    <td><input\ttype=text name=email></td>\n");
      out.write("                </tr>\t\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td>Kompetensi :</td> <td>\n");
      out.write("                        <select name=kompetensi>\n");
      out.write("\n");
      out.write("                            <option value=\"Programming :: J2EE\">Programming :: J2EE</option>\n");
      out.write("\n");
      out.write("                            <option value=\"Programming :: Java Visual\">Programming :: Java Visual</option>\n");
      out.write("\n");
      out.write("                            <option value=\"Programming :: JSP\">Programming :: JSP</option> <option value=\"OS :: Linux\">OS :: Linux</option>\n");
      out.write("\n");
      out.write("                            <option value=\"OS :: Solaris\">OS :: Solaris</option> <option value=\"OS :: Windows\">OS :: Windows</option> <option value=\"DB :: mySQL\">DB :: mySQL</option> <option value=\"DB :: Oracle\">DB :: Oracle</option>\n");
      out.write("\n");
      out.write("                            <option value=\"DB :: Microsoft Access\">DB :: Microsoft Access</option> </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td>Hoby :</td> <td>\n");
      out.write("\n");
      out.write("                        <input type=checkbox name=hoby1 value=berenang> Berenang <input type=checkbox name=hoby2 value=makan> Makan\n");
      out.write("\n");
      out.write("                        <input type=checkbox name=hoby3 value=badminton> Badminton <input type=checkbox name=hoby4 value=membaca> Membaca\n");
      out.write("\n");
      out.write("                        <input type=checkbox name=hoby5 value=bolaBasket> Basket Ball </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td> </td>\n");
      out.write("\n");
      out.write("                    <td><input type=submit value=Proceed></td> </tr>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("\n");
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
