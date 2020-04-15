package com.ssafy.hello;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class multiparam
 */
@WebServlet("/multiparam.do")
public class multiparam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public multiparam() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		// 1. parameter 처리
		String userId = request.getParameter("userid");
		String userName = request.getParameter("username");
		String [] fruits = request.getParameterValues("fruit");
		
		// 2. business Logic 처리
		StringBuilder sb = new StringBuilder(userId + " " + userName + " " + Arrays.toString(fruits));
				
		// 3. response
		PrintWriter out = response.getWriter();
		// servlet vs jsp
		out.println(sb);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 매번 이런 처리가 필요한가?? --> Filter
//		response.setContentType("text/html;charset=UTF-8");
//		request.setCharacterEncoding("UTF-8"); // POST
		// 1. parameter 처리
		String userId = request.getParameter("userid");
		String userName = request.getParameter("username");
		String [] fruits = request.getParameterValues("fruit");
		
		// 2. business Logic 처리
		StringBuilder sb = new StringBuilder(userId + " " + userName + " " + Arrays.toString(fruits));
				
		// 3. response
		PrintWriter out = response.getWriter();
		// servlet vs jsp
		out.println(sb);
	}

}
