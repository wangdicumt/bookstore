/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-23 09:27:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\"><head>\r\n");
      out.write("<title>图书购物系统</title> \r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.9.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/login.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.cookie.js\"  type=\"text/javascript\"></script>\r\n");
      out.write("<link href=\"css/login2.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("        if ($.cookie(\"remember-me\") == \"true\") {\r\n");
      out.write("        $(\"#remember-me\").attr(\"checked\", true);\r\n");
      out.write("        $(\"#inputText3\").val($.cookie(\"username\"));\r\n");
      out.write("        $(\"#inputPassword3\").val($.cookie(\"password\"));\r\n");
      out.write("        }\r\n");
      out.write("      });\r\n");
      out.write("     \r\n");
      out.write("      //记住用户名密码\r\n");
      out.write("      function Save() {\r\n");
      out.write("        if ($(\"#remember-me:checked\").length==1) {\r\n");
      out.write("          var str_username = $(\"#inputText3\").val();\r\n");
      out.write("          var str_password = $(\"#inputPassword3\").val();\r\n");
      out.write("          $.cookie(\"remember-me\", \"true\", { expires: 7 }); //存储一个带7天期限的cookie\r\n");
      out.write("          $.cookie(\"name\", str_username, { expires: 7 });\r\n");
      out.write("          $.cookie(\"password\", str_password, { expires: 7 });\r\n");
      out.write("        }\r\n");
      out.write("        else {\r\n");
      out.write("          $.cookie(\"remember-me\", \"false\", { expire: -1 });\r\n");
      out.write("          $.cookie(\"name\", \"\", { expires: -1 });\r\n");
      out.write("          $.cookie(\"password\", \"\", { expires: -1 });\r\n");
      out.write("        }\r\n");
      out.write("      };\r\n");
      out.write(" </script>\t\t\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>图书购物系统<sup>V2017</sup></h1>\r\n");
      out.write("<h1>登录页面</h1>\r\n");
      out.write("<div class=\"login\" style=\"margin-top:50px;\">\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"web_qr_login\" id=\"web_qr_login\" style=\"display: block; height: 300px;\">    \r\n");
      out.write("\r\n");
      out.write("            <!--登录-->\r\n");
      out.write("\t<div class=\"web_login\" id=\"web_login\">\r\n");
      out.write("               \r\n");
      out.write("               \r\n");
      out.write("        <div class=\"login-box\">\r\n");
      out.write("\t\t\t<div class=\"login_form\">\r\n");
      out.write("\t\t\t\t<h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.message }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h2>\r\n");
      out.write("\t\t\t\t<h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.success }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h2>\r\n");
      out.write("\t\t\t\t<form action=\"customerLogin\" name=\"form1\" accept-charset=\"utf-8\" id=\"login_form\" class=\"loginForm\" method=\"post\"><input type=\"hidden\" name=\"did\" value=\"0\"/>\r\n");
      out.write("\t                <input type=\"hidden\" name=\"to\" value=\"log\"/>\r\n");
      out.write("\t                <div class=\"uinArea\" id=\"uinArea\">\r\n");
      out.write("\t\t                  <label class=\"input-tips\" for=\"u\">帐号：</label>\r\n");
      out.write("\t\t                <div class=\"inputOuter\" id=\"uArea\">\r\n");
      out.write("\t\t                    <input type=\"text\" id=\"inputText3\" name=\"name\" class=\"inputstyle\"/>\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\r\n");
      out.write("\t                </div>\r\n");
      out.write("\t                \r\n");
      out.write("\t                <div class=\"pwdArea\" id=\"pwdArea\">\r\n");
      out.write("               \t\t\t<label class=\"input-tips\" for=\"p\">密码：</label> \r\n");
      out.write("\t\t\t           \t<div class=\"inputOuter\" id=\"pArea\">\r\n");
      out.write("\t\t\t                <input type=\"password\" id=\"inputPassword3\" name=\"password\" class=\"inputstyle\"/>\r\n");
      out.write("\t\t\t            </div>\r\n");
      out.write("         \r\n");
      out.write("\t                </div>\r\n");
      out.write("\t                \r\n");
      out.write("\t                <label for=\"remember-me\"><input id=\"remember-me\" type=\"checkbox\" >记住密码</label>\r\n");
      out.write("\t                \r\n");
      out.write("\t                <div style=\"padding-left:50px;margin-top:20px;\"><input type=\"submit\" value=\"登 录\" style=\"width:150px;\" class=\"button_blue\"/></div>\r\n");
      out.write("\t               \t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/registerForm\" style=\"font-size:20px\">注册</a><br/>\r\n");
      out.write("\t               \r\n");
      out.write("              </form>\r\n");
      out.write("              \r\n");
      out.write("           </div>\r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t  <a href=\"findPassword \" style=\"font-size:15px\">找回密码</a>\r\n");
      out.write("          <div style=\"padding-left:250px;margin-top:20px;\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/userLoginForm\" style=\"font-size:15px\">管理员登录</a></div>\r\n");
      out.write("           \r\n");
      out.write("           <!--登录end-->\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"jianyi\">*推荐使用ie8或以上版本ie浏览器或Chrome内核浏览器访问本站</div>\r\n");
      out.write("</body></html>");
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
