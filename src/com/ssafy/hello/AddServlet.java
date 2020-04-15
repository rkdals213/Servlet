package com.ssafy.hello;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 파라미터 추출...
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		// 2. business logic 처리 --> model에게 처리 요청
		// -- 결과에 따라서
		int result = AddService.getService().add(num1, num2);
		System.out.println("더하기 결과 " + result);
		request.setAttribute("result", result);
		// 3. 적절한 view로 연결
		// sendredirect : 전혀 새로운 요청이다
//		response.sendRedirect("/hs/view/addresult.jsp");
		// forward
		RequestDispatcher disp = request.getRequestDispatcher("/view/addresult.jsp");
		disp.forward(request, response);
	}
}
