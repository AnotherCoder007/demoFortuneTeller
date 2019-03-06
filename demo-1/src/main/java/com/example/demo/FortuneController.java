package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FortuneController {

	//private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(Greeting.class);
	@RequestMapping("/fort")
	public @ResponseBody String greet() {
		 /*LOGGER.trace("doStuff needed more information - {}");
	        LOGGER.debug("doStuff debug - {}");
	        LOGGER.info("doStuff info - {}");
	        LOGGER.warn("doStuff warn - {}");
	        LOGGER.error("doStuff error - {}");
		*/
		System.out.println("Greetings print test change!");
		return "have a good day!";
	}
	
}
