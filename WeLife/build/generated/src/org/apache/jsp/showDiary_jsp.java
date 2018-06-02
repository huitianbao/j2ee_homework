package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import edu.jlxy.Module.table.impl.DiaryImpl;
import edu.jlxy.Module.entity.DiaryEntity;
import java.util.ArrayList;

public final class showDiary_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"pragma\" content=\"no-cache\">  \n");
      out.write("        <meta http-equiv=\"cache-control\" content=\"no-cache\">  \n");
      out.write("        <meta http-equiv=\"expires\" content=\"0\">      \n");
      out.write("        <meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">  \n");
      out.write("        <meta http-equiv=\"description\" content=\"This is my page\">  \n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .contact-form {\n");
      out.write("    margin: 3em 0 0;\n");
      out.write("\tpadding-bottom: 2em;\n");
      out.write("}\n");
      out.write(".contact-form input[type=\"text\"] {\n");
      out.write("  display: inline-block;\n");
      out.write("  background: none;\n");
      out.write("  border: 1.5px solid #6e6e6e;\n");
      out.write("  width: 100%;\n");
      out.write("  outline: none;\n");
      out.write("  padding: 10px 15px 10px 15px;\n");
      out.write("  font-size: .9em;\n");
      out.write("  font-weight: 400;\n");
      out.write("  color: #111111;\n");
      out.write("  margin-bottom: 1.5em;\n");
      out.write("}\n");
      out.write(".contact-form input[type=\"email\"] {\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tbackground: none;\n");
      out.write("\tborder: 1.5px solid #CBCBCB;\n");
      out.write("\twidth: 100%;\n");
      out.write("\toutline: none;\n");
      out.write("\tpadding: 10px 15px 10px 15px;\n");
      out.write("\tfont-size: .9em;\n");
      out.write("\tfont-weight: 400;\n");
      out.write("\tcolor: #111111;\n");
      out.write("\tmargin: 0 1.25em;\n");
      out.write("}\n");
      out.write(".contact-form textarea {\n");
      out.write("\tbackground: none;\n");
      out.write("\tborder: 1.5px solid #6e6e6e;\n");
      out.write("\twidth: 100%;\n");
      out.write("\tdisplay: block;\n");
      out.write("\theight: 150px;\n");
      out.write("\toutline: none;\n");
      out.write("\tfont-size: 0.9em;\n");
      out.write("\tcolor: #111111;\n");
      out.write("\tfont-weight: 400;\n");
      out.write("\tresize: none;\n");
      out.write("\tpadding: 10px 15px 10px 15px;\n");
      out.write("\tmargin-bottom:2em;\n");
      out.write("}\n");
      out.write("button.btn1.btn-1.btn-1b {\n");
      out.write("    color: #FFF;\n");
      out.write("    border: none;\n");
      out.write("    background:#0dc5dd;\n");
      out.write("    padding: .5em 1.5em;\n");
      out.write("    font-size: 1em;\n");
      out.write("    outline: none;\n");
      out.write("\tborder:2px solid #0dc5dd;\n");
      out.write("}\n");
      out.write("            table {\n");
      out.write("\tbackground-image: url(images/bgt.png);\n");
      out.write("\ttable-layout: fixed;\n");
      out.write("\tempty-cells: show;\n");
      out.write("\tborder-collapse: collapse;\n");
      out.write("\tmargin: 0 auto;\n");
      out.write("}\n");
      out.write("td {\n");
      out.write("\theight: 20px;\n");
      out.write("}\n");
      out.write("h1, h2, h3 {\n");
      out.write("\tfont-size: 12px;\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("}\n");
      out.write("/*这个是借鉴一个论坛的样式*/\n");
      out.write("table.t1 {\n");
      out.write("\tborder: 1px solid #9DB3C5;\n");
      out.write("\tcolor: #666;\n");
      out.write("}\n");
      out.write("table.t1 th {\n");
      out.write(" background-repeat::repeat-x;\n");
      out.write("\theight: 30px;\n");
      out.write("}\n");
      out.write("table.t1 td, table.t1 th {\n");
      out.write("\tborder: 1px solid #ffffff;\n");
      out.write("\tpadding: 0 1em 0;\n");
      out.write("        \n");
      out.write("}\n");
      out.write(".banner{\n");
      out.write("\tbackground:url(../images/c1.jpg) no-repeat 0px 0px;\n");
      out.write("\tbackground-size:cover;\n");
      out.write("\tmin-height:790px;\t\n");
      out.write("}\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("   <script>\n");
      out.write("            function return(){\n");
      out.write("                location.href=\"http://localhost:8080/WeLife/Diary.jsp\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     \n");
      out.write("        \n");
      out.write("        <div class=\"banner\">\n");
      out.write("        <h1>this is show   diary page</h1>\n");
      out.write("        <a href=\"/WeLife/Diary.jsp\"> 返回</a>\n");
      out.write("        ");

            DiaryImpl di = new DiaryImpl();
            ArrayList<DiaryEntity> al = new ArrayList<>();
            al = di.getList();

        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--        <table border = 1px align = \"center\">  -->\n");
      out.write(" <table width=\"90%\" border=\"1\" class=\"t1\">\n");
      out.write("            <tr>  \n");
      out.write("                <th>diaId</th>  \n");
      out.write("                <th>userId</th>  \n");
      out.write("                <th>title</th>  \n");
      out.write("                <th>content</th> \n");
      out.write("                <th>date</th>\n");
      out.write("                <th>permission</th>\n");
      out.write("            </tr>  \n");
      out.write("            \n");
      out.write("\n");
      out.write("            ");
            for (int i = 0; i < al.size(); i++) {
                DiaryEntity de = (DiaryEntity) al.get(i);
      out.write("\n");
      out.write("\n");
      out.write("            <tr> \n");
      out.write("                <th>");
      out.print(de.getDiaId());
      out.write("</th>\n");
      out.write("                <th>");
      out.print(de.getUserId());
      out.write("</th>\n");
      out.write("                <th>");
      out.print(de.getTitle());
      out.write("</th>\n");
      out.write("                <th>");
      out.print(de.getContent());
      out.write("</th>\n");
      out.write("                <th>");
      out.print(de.getDate());
      out.write("</th>\n");
      out.write("                <th>");
      out.print(de.getPermission());
      out.write("</th><br/>\n");
      out.write("\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("        ");
 }
        
      out.write("  \n");
      out.write("    </table> \n");
      out.write("    \n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
