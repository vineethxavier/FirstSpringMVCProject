package com.gontuseries.hellocontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

@RequestMapping("/greet")
public class HelloController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","hello worlddddd");

		return model;
	}

	@RequestMapping("/hi")
	public ModelAndView hiWorld() {
		ModelAndView model = new ModelAndView("HelloPage ");
		 model.addObject("msg", "hi world-> /hi");
		 return model;
	}
	
	@RequestMapping("/howdy")
	public ModelAndView howdyWorld() {
		ModelAndView model = new ModelAndView("howdy");
		model.addObject("msg", "msg-> /howdy");
		model.addObject("msg1", "msg1-> /howdy");
		return model;
	}
}