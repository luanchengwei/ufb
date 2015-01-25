package com.ufufund.mvc.exception.handler;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
@Controller
public class ExceptionHandlingController {
	private static final Logger LOGGER=Logger.getLogger(ExceptionHandlingController.class);
	@RequestMapping("/404")
	public ModelAndView handle404(WebRequest request) {
		ModelAndView mav = new ModelAndView("error/404");
		return mav;
	}
	
	@ExceptionHandler(Exception.class)
	@RequestMapping("/error")
	public ModelAndView handleException(Exception e,WebRequest request) {
		ModelAndView mav=new ModelAndView("error/500");
		LOGGER.error("error:",e);
		mav.addObject("ex", e);
		return mav;
	}
	
	@RequestMapping("/expire")
	public ModelAndView handleExpire(WebRequest request) {
		ModelAndView mav = new ModelAndView("error/expire");
		return mav;
	}
}
