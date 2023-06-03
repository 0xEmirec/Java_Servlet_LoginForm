

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/login"})
public class LoginForm extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setHeader("content-type", "text/html;charset=UTF-8");
		PrintWriter printWriter = resp.getWriter();
		String user="admin";
		String pass="admin12345";
		String username = String.valueOf(req.getParameter("username"));
		String password = String.valueOf(req.getParameter("password"));
		if((username.equals(user))&& (password.equals(pass))) {
			printWriter.write("Hoşgeldiniz "+user+"!");
		}else printWriter.write("Yanlış kullanıcı adı veya şifre!");
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setHeader("content-type", "text/html;charset=UTF-8");
		resp.sendRedirect("./index.html");
	}
}
