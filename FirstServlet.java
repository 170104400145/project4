/*����1-3������һ���򵥵�Servlet����ͨ����дdoGet()��doPost()������
 * ʵ���������ҳ�������һ��������Ϣ��This is a Servlet program !����
 */

//�����嵥1-3:  FirstServlet.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {// �̳�HttpServlet��
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/htm/;charset=gb2312");
		// ������Ӧ���ͺ��ַ���
		PrintWriter out = response.getWriter();
		// ��ȡPrintWriter����������ͻ����������
		out.println("<html>");
		out.println("<head>");
		out.println("<title>��һ��Servlet</title>");
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
