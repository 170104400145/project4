/*【例1-3】　第一个简单的Servlet程序。通过重写doGet()和doPost()方法，
 * 实现在浏览器页面中输出一级标题信息“This is a Servlet program !”。
 */

//程序清单1-3:  FirstServlet.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {// 继承HttpServlet类
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/htm/;charset=gb2312");
		// 设置响应类型和字符集
		PrintWriter out = response.getWriter();
		// 获取PrintWriter对象，用来向客户端输出内容
		out.println("<html>");
		out.println("<head>");
		out.println("<title>第一个Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>");
		out.println("This is a Servlet program !");
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
