package org.hbhk.secretary.backend.server.filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class ParameterRequestFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@SuppressWarnings("unchecked")
	public void doFilter(ServletRequest servletRequest,
			ServletResponse servletResponse, FilterChain chain) throws IOException,
			ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		String id = request.getParameter("id");
		if (id != null && "_empty".equals(id)) {
			Map<String,Object>  params = new HashMap<String,Object>(request.getParameterMap());
			params.put("id", 0);
			ParameterRequestWrapper wrapRequest = new ParameterRequestWrapper(
					request, params);
			chain.doFilter(wrapRequest, servletResponse);
		} else {
			chain.doFilter(servletRequest, servletResponse);
		}

	}

	public void destroy() {

	}

}
