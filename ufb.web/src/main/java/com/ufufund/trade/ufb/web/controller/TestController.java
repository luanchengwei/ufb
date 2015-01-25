package com.ufufund.trade.ufb.web.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	private static final Logger log = Logger.getLogger(TestController.class);
	
	@RequestMapping(value="test/index" , method=RequestMethod.GET)
	public String getPage(Model model){
		
		log.info("xxxxx---------------");
		
		return "test/test_index";
	}

}
