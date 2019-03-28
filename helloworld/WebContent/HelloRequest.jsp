<%@page language="java" pageEncoding="utf-8" import="java.io.*, java.util.*" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<title>Http Request Example</title>
	</head>
	<body>
	<h1>HttpServletRequest示例</h1>
	<h4>getContextPath</h4>
	<p><% out.print(request.getContextPath()); %></p>
	
	<h4>getQueryString</h4>
	<p><% out.print(request.getQueryString()); %></p>
	
	
	<h4>getParameter("username")</h4>
	<p><% out.print(request.getParameter("username")); %></p>
	
	<h4>getRemoteUser</h4>
	<p><% out.print(request.getRemoteUser()); %></p>
	
	<h4>getRemoteAddr</h4>
	<p><% out.print(request.getRemoteAddr()); %></p>
	
	<h4>getRemoteHost</h4>
	<p><% out.print(request.getRemoteHost()); %></p>
	
	<h4>getRequestedSessionId</h4>
	<p><% out.print(request.getRequestedSessionId()); %></p>
	
	<h4>getRequestURL</h4>
	<p><% out.print(request.getRequestURL()); %></p>
	
	<h4>getRequestURI</h4>
	<p><% out.print(request.getRequestURI()); %></p>
	
	<h4>getServletPath</h4>
	<p><% out.print(request.getServletPath()); %></p>
	
	<h1>Request头部请求数据</h1>
	<table border="1" align="center">
	<tr bgcolor="#AAAAAA">
		<th>Header Name</th><th>Header Value</th>
	</tr>
	<% 
		Enumeration headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()) {
			String paramName = (String)headerNames.nextElement();
			out.print("<tr><td>"+paramName+"</td>");			
			out.print("<td>"+request.getHeader(paramName)+"</td></tr>");
		}
	%>
	</table>	
	
	<h1>QueryString数据</h1>
	<table border="1" align="center">
	<tr bgcolor="#AAAAAA">
		<th>Parameter Name</th><th>Value</th>
	</tr>
	<% 
		Enumeration parameterNames = request.getParameterNames();
		while(parameterNames.hasMoreElements()) {
			String paramName = (String)parameterNames.nextElement();
			out.print("<tr><td>"+paramName+"</td>");			
			out.print("<td>"+request.getParameter(paramName)+"</td></tr>");
		}
	%>
	</table>	
	
	</body>
</html>