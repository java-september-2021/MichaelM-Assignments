package com.michael.datetime.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {
	private Date getDate() {
		Date now = new Date();
		return now;
	}
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
		}
	@RequestMapping("/date")
	public String date(Model veiwModel) {
		veiwModel.addAttribute("datetime", getDate());
		return "date.jsp";
		}
	@RequestMapping("/time")
	public String time(Model veiwModel) {
		veiwModel.addAttribute("datetime", getDate());
		return "time.jsp";
		}
}
