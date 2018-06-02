package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Diary_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("      <html>\n");
      out.write("<head>\n");
      out.write("<title>Diary</title>\n");
      out.write("<link href=\"css3/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<link href=\"css3/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\n");
      out.write("<!-- jQuery (necessary JavaScript plugins) -->\n");
      out.write("<script type='text/javascript' src=\"js/js2/jquery-1.11.1.min.js\"></script>\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800|Titillium+Web:400,600,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<!--//theme-style-->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Game Spot Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("</head>\n");
      out.write(" \n");
      out.write("    <body>\n");
      out.write("    <!-- header -->\n");
      out.write("<div class=\"banner banner2\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"headr-right\">\n");
      out.write("      <div class=\"details\">\n");
      out.write("        <ul>\n");
      out.write("          <li><a href=\"mailto:@example.com\"><span class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></span>info(at)example.com</a></li>\n");
      out.write("          <li><span class=\"glyphicon glyphicon-earphone\" aria-hidden=\"true\"></span>(+1)000 123 456789</li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"banner_head_top\">\n");
      out.write("      <div class=\"logo\">\n");
      out.write("        <h1><a href=\"HomePage.html\">We<span class=\"glyphicon glyphicon-knight\" aria-hidden=\"true\"></span><span>Life</span></a></h1>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"top-menu\">\n");
      out.write("        <div class=\"content white\">\n");
      out.write("          <nav class=\"navbar navbar-default\"> \n");
      out.write("            <!--<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t</button>\t\t\t\t\n");
      out.write("\t\t\t\t\t\t </div>--> \n");
      out.write("            <!--/navbar header-->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("              <ul class=\"nav navbar-nav\">\n");
      out.write("                <li ><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li class=\"active\"><a href=\"Diary.jsp\">Diary</a></li>\n");
      out.write("                <li ><a href=\"AddFriend.html\">New Friend</a></li>\n");
      out.write("                <li><a href=\"PersonalPage.html\">My WeLife</a></li>\n");
      out.write("            <!--    <li><a href=\"shortcodes.html\">Shortcodes</a></li>\n");
      out.write("                <li class=\"active\">My WeLife</li>-->\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("            <!--/navbar collapse--> \n");
      out.write("          </nav>\n");
      out.write("          <!--/navbar--> \n");
      out.write("        </div>\n");
      out.write("        <div class=\"clearfix\"></div>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/js2/bootstrap-3.1.1.min.js\"></script> \n");
      out.write("      </div>\n");
      out.write("      <div class=\"clearfix\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!---->\n");
      out.write("<div class=\"contact\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <h2>Diary</h2>\n");
      out.write("    <div class=\"contact-form\">\n");
      out.write("        ");
 session.setAttribute("permission", "2");
      out.write("\n");
      out.write("        \n");
      out.write("      <form action=\"");
      out.print(request.getContextPath());
      out.write("/Diary_handle\" method=\"post\">\n");
      out.write("        <input type=\"text\" placeholder=\"Name\" required name=\"title\" autofocus>\n");
      out.write("        <!--<input type=\"email\" placeholder=\"Email\" required>\n");
      out.write("\t\t\t\t\t<input type=\"text\" placeholder=\"Telephone\" required>-->\n");
      out.write("        <textarea placeholder=\"Message\" required name=\"context\"></textarea>\n");
      out.write("        <button class=\"btn1 btn-1 btn-1b\">Submit</button>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- //contact --> \n");
      out.write("<div class=\"copywrite\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <p>Copyright &copy; 2018 WeLife \n");
      out.write("          | Group No.11  - Designed by elites</p>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!---->\n");
      out.write("\n");
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
