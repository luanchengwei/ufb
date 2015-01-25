package com.ufufund.mvc.exception.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

public class UfuMappingExceptionResolver extends SimpleMappingExceptionResolver {
	private static Logger logger=Logger.getLogger(UfuMappingExceptionResolver.class);
	protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response,
			Object handler, Exception ex) {
		logger.error("spring mvc error:", ex);
		return super.doResolveException(request, response, handler, ex);
	}
}
