package com.ssafy.hello;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class EncodingFilter implements Filter {

    public EncodingFilter() {
    	
    }

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {	
		// 서블릿 호출 전에 동작 - 전처리
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8"); // POST
		// 실제 서블릿 또는 다른 필터 호출
		chain.doFilter(request, response);
		// 서블릿 동작 후처리 작업
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
