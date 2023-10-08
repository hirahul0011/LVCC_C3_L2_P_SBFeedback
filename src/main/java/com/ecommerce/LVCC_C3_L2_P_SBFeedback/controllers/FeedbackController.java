package com.ecommerce.LVCC_C3_L2_P_SBFeedback.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.LVCC_C3_L2_P_SBFeedback.entity.Feedback;
import com.ecommerce.LVCC_C3_L2_P_SBFeedback.repository.FeedbackSpringDataRepository;

//@RestController
@Controller
public class FeedbackController {
	
	@Autowired
	FeedbackSpringDataRepository feedbackSpringDataRepository;
	
//	@RequestMapping(value="/")
//	@GetMapping(value="/")
	public String start() {
		return "index";
	}	
	
	@RequestMapping(value="formSubmission",method=RequestMethod.POST)
	public String formSubmission(@RequestParam("feedback")String feedback,
			@RequestParam("product")String product,
			@RequestParam("source")String source,
			ModelMap map) {
		
		String page="index";
		String errorMessages="";
		
		if(feedback=="") {			
			errorMessages=errorMessages+"<br>Please enter some comment to continue!";			
		}
		
		if(product=="") {			
			errorMessages=errorMessages+"<br>Please enter Product Name to continue!";			
		}
		
		if(source=="") {			
			errorMessages=errorMessages+"<br>Please enter Source to continue!";			
		}
		
		if(errorMessages=="") {				
			Feedback fb=new Feedback(feedback, product, source);
			feedbackSpringDataRepository.save(fb);	
			page="submissioConfirmation";
		}else {
			map.addAttribute("errorMessages", errorMessages);	
			map.addAttribute("feedback", feedback);			
		}		
		
		return page;
		
	}
	
	@RequestMapping(value="redirect",method=RequestMethod.GET)	
	public String redirect(){
		
		String page="index";				
		return page;		
	}

}
