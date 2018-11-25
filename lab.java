import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class lab extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws
	IOException,ServletException
	{
		String name, addr;
		//
		response.setContentType("text/html");
		name=request.getParameter("uname");
		addr=request.getParameter("address");
		PrintWriter out=response.getWriter();
		out.println("<html><body-bgcolor='#ffffff' text='#000000'>");
		out.println("<h1 align=center> helloo.....!!"+name+ "</h1><hr>Address:"+addr);
		out.close();
	}
}
Lab.html code is given below
<html>
<head>
<title>greeting...</title>
</head>
<body-bgcolor='#ffffff' text='#000000'>
<h1 align=center>GREETING A USER</h1>
<hr>
<form method=get action="http://localhost:8080/examples/servlets/servlet/lab">
<b>NAME:</b>
<input type=text name=uname />
<b>Address:</b>
<input type=text name=address />
<input type=submit value=SUBMIT />
</hr>
</form>
</body>
</html>