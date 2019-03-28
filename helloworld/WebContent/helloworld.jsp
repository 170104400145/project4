<%@page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<title>html</title>
	</head>
	<body>
		<p><% 
		for (int i = 1; i <= 9; i++) {
			for (int j = i; j <= 9; j++)
				out.print(i+"*"+j+"="+i*j+"  "); 
			out.print("<br>");
		}
		%>
		</p>
	</body>
</html>