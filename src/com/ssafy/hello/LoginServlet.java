package com.ssafy.hello;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. parameter 처리
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		System.out.println(id + " " + pass);
		// 2. business logic 처리 - login service
		// 3. presentation logic 처리 - html을 만드는게 아니다.. --> 페이지 이동
		// 페이지 이동 : response.sendRedirect, RequestDispatcher dispatch
		// sendRedirect : 전혀 새로운 요청 - 기존의 request, reponse 사용 불가
		// dispatch : 기존 요청을 전달 - request, response 사용 가능
		if(id.equals("ssafy") && pass.equals("1111")) {
			System.out.println("로그인 성공");
			response.sendRedirect("/hs/view/result.html"); // container root
			// 
		}else {
			System.out.println("로그인 실패");
			response.sendRedirect("/hs/view/login.html"); // container root
		}
	}

}
