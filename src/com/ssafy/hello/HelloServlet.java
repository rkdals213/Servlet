package com.ssafy.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       
	
	/*
	 * 1. 요청 data get
	 * 2. Logic 처리
	 * 3. 결과 페이지 (html)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter(); // ISO-8859-1
		out.println("<html>");
		out.println("<body>");
		out.println("hello ssafy</br>");
		out.println("안녕 싸피");
		out.println();
		out.println("</body>");
		out.println("</html>");
	}

}
