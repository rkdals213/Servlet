package com.ssafy.hello;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lifecycle")
public class ServletLifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletLifeCycle() {
        super();
        System.out.println("생성자 호출");
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget() 호출");
	}

	@Override
	public void destroy() {
		System.out.println("destroy() 호출");
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init() 호출  ");
		super.init();
	}
}
