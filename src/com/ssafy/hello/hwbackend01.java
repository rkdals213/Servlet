package com.ssafy.hello;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/productsave.do")
public class hwbackend01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public hwbackend01() {
        super();       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productName = request.getParameter("productname");
		String productPrice = request.getParameter("productprice");
		String productDiscription = request.getParameter("productdiscription");
		
		System.out.println(productName);
		System.out.println(productPrice);
		System.out.println(productDiscription);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
