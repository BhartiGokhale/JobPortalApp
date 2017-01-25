package com.cybage.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicantController {

	@RequestMapping(value = "/applicant", method = RequestMethod.GET)
	public ModelAndView applicantUser() {	   
		return new ModelAndView("applicant", "command", new Applicant());
	}

	@RequestMapping(value = "/success", method = RequestMethod.POST)
	public String success(@ModelAttribute("SpringWeb")Applicant a1, 
			ModelMap model) {

		
		model.addAttribute("success", "Successfully added details");
		return "success";

	}



}
