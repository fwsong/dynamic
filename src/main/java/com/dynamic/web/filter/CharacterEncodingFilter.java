package com.dynamic.web.filter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.dynamic.web.util.WebUtil;

public class CharacterEncodingFilter implements Filter{
	
	private  static String ENCODING = "UTF-8";

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		try {
			request.setCharacterEncoding(ENCODING);
			response.setCharacterEncoding(ENCODING);
			String url = WebUtil.getCurrentURL((HttpServletRequest)request);
			request.setAttribute("currentURL", url);
			chain.doFilter(request, response);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
