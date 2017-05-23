package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; \n");
      out.write("    charset=UTF-8\"> <title>JSP Page</title>\n");
      out.write("\n");
      out.write("<style type=\"text/css\"> <!--\n");
      out.write("\n");
      out.write(".style1 {font-size: 18px}\n");
      out.write("\n");
      out.write(".style2 {font-size: 18px; font-weight: bold; } -->\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");


String kliklink = request.getParameter("link");
String latarhome = "#00FFFF" ;

String latarproduk = "#00FFFF" ;
String latarkontak = "#00FFFF" ;
String latartentang = "#00FFFF" ;

if (kliklink.equals("home"))	
latarhome = "#999999" ;	
if (kliklink.equals("produk"))	
latarproduk = "#999999" ;	
if (kliklink.equals("kontak"))	
latarkontak = "#999999" ;	
if (kliklink.equals("tentang"))	
latartentang = "#999999" ;	

      out.write("\t\t\t\n");
      out.write("<table width=\"439\" border=\"0\" bgcolor=\"#0000FF\">\t\n");
      out.write("<tr>\t\t\t\n");
      out.write("<td\twidth=\"91\"\tbgcolor=\"");
      out.print(latarhome);
      out.write("\"\tclass=\"style1\"><div\n");
      out.write("align=\"center\"\tclass=\"style1\"><strong><a\n");
      out.write("href=\"indexMenu.html?link=home\">Home</a></strong></div></td>\n");
      out.write("<td\twidth=\"83\"\tbgcolor=\"");
      out.print(latarproduk);
      out.write("\"\tclass=\"style1\"><div\n");
      out.write("align=\"center\"\t\tclass=\"style2\"><a\n");
      out.write("href=\"TagMenu.jsp?link=produk\">Produk</a></div></td>\t\n");
      out.write("<td\twidth=\"101\"\tbgcolor=\"");
      out.print(latarkontak);
      out.write("\"\tclass=\"style1\"><div\n");
      out.write("align=\"center\"\t\tclass=\"style2\"><a\n");
      out.write("href=\"TagMenu.jsp?link=kontak\">Kontak</a></div></td>\t\n");
      out.write("<td\twidth=\"136\"\tbgcolor=\"");
      out.print(latartentang);
      out.write("\"\tclass=\"style1\"><div\n");
      out.write("        align=\"center\" class=\"style2\"><a href=\"TagMenu.jsp?link=tentang\">Tentang Kami</a> </div></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write(' ');
      out.write('\n');

    if (kliklink.equals("produk")) {
        out.println("hai ini produk kami ya silahkan datang kembali <br>");

    } else if (kliklink.equals("kontak")) {

        out.println("silahkan hubungi kami nomor kontak kami dibawah ini ya <br>");

    } else if (kliklink.equals("tentang")) {

        out.println("web kami tentang penjualan buku online silahkan dibaca2 ya <br>");

    }

      out.write("\n");
      out.write("</body>\n");
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
