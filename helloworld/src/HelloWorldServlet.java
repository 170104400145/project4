import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@WebServlet("/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {	
	@Override
	public void doGet(HttpServletRequest reqest, 
				HttpServletResponse response)
	throws IOException, ServletException
	{
		response.getWriter().println("Hello Servlet!");
	}
}

// javac HelloWorldServlet.java -classpath TOMCAT_DIR/lib/servlet-api.jar