package com.michael.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DojoController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(value="/survey", method=RequestMethod.POST)
	public String survey(@RequestParam("name") String name,
			@RequestParam("location") String location,@RequestParam("language") String language,
			@RequestParam("comment") String comment, Model veiwModel) {
		veiwModel.addAttribute("name", name);
		veiwModel.addAttribute("location", location);
		veiwModel.addAttribute("language", language);
		veiwModel.addAttribute("comment", comment);
		
		return "result.jsp";
	}
}
