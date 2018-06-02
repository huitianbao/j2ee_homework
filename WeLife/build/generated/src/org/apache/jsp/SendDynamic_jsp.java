package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import edu.jlxy.Module.table.impl.SendDynamicImpl;
import java.util.Collection;
import edu.jlxy.Module.entity.SendDynamicEntity;
import java.util.ArrayList;

public final class SendDynamic_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"pragma\" content=\"no-cache\">  \n");
      out.write("        <meta http-equiv=\"cache-control\" content=\"no-cache\">  \n");
      out.write("        <meta http-equiv=\"expires\" content=\"0\">      \n");
      out.write("        <meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">  \n");
      out.write("        <meta http-equiv=\"description\" content=\"This is my page\">  \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <form action=\"/WeLife/SendDynamic_handle\" method=\"post\">\n");
      out.write("            title:<input type=\"text\" name=\"title\"><br/>\n");
      out.write("\n");
      out.write("            content:<input type=\"text\" name=\"content\"><br/>\n");
      out.write("            photo:<input type=\"text\" name=\"photo\"><br/>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"发送\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        ");

            session.setAttribute("currentuser", "1");
          

        
      out.write("\n");
      out.write("       \n");
      out.write("    \n");
      out.write("    ");

        SendDynamicImpl sdi=new SendDynamicImpl();
        ArrayList<SendDynamicEntity> al=new ArrayList<SendDynamicEntity>();
        al=sdi.getList();
    
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <table border = 1px align = \"center\">  \n");
      out.write("        <tr>  \n");
      out.write("            <th>uid</th>  \n");
      out.write("            <th>did</th>  \n");
      out.write("            <th>title</th>  \n");
      out.write("            <th>content</th> \n");
      out.write("            <th>photo</th>\n");
      out.write("            <th>date</th>\n");
      out.write("        </tr>  \n");
      out.write("        <!-- 继续使用jsp语句 循环放入存放于list中的Book实体类中的数据 -->  \n");
      out.write("        ");
  
            for(int i = 0;i<al.size();i++){ 
                SendDynamicEntity sendDynamicEntity=(SendDynamicEntity)al.get(i);
      out.write("\n");
      out.write("                \n");
      out.write("                <tr> \n");
      out.write("                    <th>");
      out.print(sendDynamicEntity.getUid());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print(sendDynamicEntity.getDid());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print(sendDynamicEntity.getTitle());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print(sendDynamicEntity.getContent());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print(sendDynamicEntity.getPhoto());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print(sendDynamicEntity.getDate());
      out.write("</th><br/>\n");
      out.write("                    \n");
      out.write("         </tr>\n");
      out.write("             \n");
      out.write("       \n");
      out.write("        ");
 }  
         
      out.write("  \n");
      out.write("    </table> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
