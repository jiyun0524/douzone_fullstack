/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.65
 * Generated at: 2021-05-21 00:56:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.members;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/members/../view/color.jsp", Long.valueOf(1621501863724L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	String bodyback_c = "#FFFFFF";
	String back_c = "#FFFAFA";
	String title_c = "#F0FFFF";
	String value_c = "#FFFFF0";
	String bar = "#FFF5EE";

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head><title>로그인 창</title></head>\r\n");
      out.write("\r\n");
      out.write("<link href=\"../view/mystyle.css\" rel=\"stylsheet\" type=\"text/css\" >\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\" >\r\n");
      out.write("\t<!--\r\n");
      out.write("\tfunction begin(){\r\n");
      out.write("\t\tdocument.myform.id.focus();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction checkIt(){\r\n");
      out.write("\t\tif(!document.myform.id.value){\r\n");
      out.write("\t\t\talert(\"ID를 입력하지 않았습니다.\");\r\n");
      out.write("\t\t\tdocument.myform.id.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(!document.myform.pwd.value){\r\n");
      out.write("\t\t\talert(\"비밀번호를 입력하지 않았습니다.\");\r\n");
      out.write("\t\t\tdocument.myform.pwd.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t//-->\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"begin()\" bgcolor=\"");
      out.print(bodyback_c);
      out.write("\">\r\n");
      out.write("<form name=\"myform\" action=\"loginPro.jsp\" \r\n");
      out.write("\t\t\t\t\tmethod=\"post\" onSubmit=\"return checkIt()\">\r\n");
      out.write("\t<table width=\"260\" border=\"1\" align=\"center\" >\r\n");
      out.write("\t\t<tr height=\"30\">\r\n");
      out.write("\t\t\t<td colspan=\"2\" align=\"middle\" bgcolor=\"");
      out.print(title_c );
      out.write("\" >\r\n");
      out.write("\t\t\t\t\t<strong> 회원 로그인 </strong></td></tr>\r\n");
      out.write("\t\t<tr height=\"30\">\r\n");
      out.write("\t\t\t<td width=\"110\" align=\"center\" bgcolor=\"");
      out.print(title_c );
      out.write("\" >아이디</td>\r\n");
      out.write("\t\t\t<td width=\"150\" align=\"center\" bgcolor=\"");
      out.print(value_c );
      out.write("\" >\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"id\" size=\"15\" maxlenth=\"12\" >\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t<tr height=\"30\">\r\n");
      out.write("\t\t\t<td width=\"110\" align=\"center\" bgcolor=\"");
      out.print(title_c );
      out.write("\" >비밀번호</td>\r\n");
      out.write("\t\t\t<td width=\"150\" align=\"center\" bgcolor=\"");
      out.print(value_c );
      out.write("\" >\r\n");
      out.write("\t\t\t\t<input type=\"password\" name=\"pwd\" size=\"15\" maxlenth=\"12\" >\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr height=\"30\">\r\n");
      out.write("\t\t\t<td colspan=\"2\" align=\"middle\" bgcolor=\"");
      out.print(title_c );
      out.write("\" >\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"로그인\" >\r\n");
      out.write("\t\t\t\t<input type=\"reset\" value=\"다시입력\" >\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"회원가입\" \r\n");
      out.write("\t\t\t\t\tonclick=\"javascript:window.location='insertForm.jsp' \">\r\n");
      out.write("\t\t\t </td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}