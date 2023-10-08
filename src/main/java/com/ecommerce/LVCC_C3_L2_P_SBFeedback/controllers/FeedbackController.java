package com.ecommerce.LVCC_C3_L2_P_SBFeedback.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.LVCC_C3_L2_P_SBFeedback.entity.Feedback;
import com.ecommerce.LVCC_C3_L2_P_SBFeedback.repository.FeedbackSpringDataRepository;

@RestController
public class FeedbackController {
	
	@Autowired
	FeedbackSpringDataRepository feedbackSpringDataRepository;
	
	@RequestMapping(value="formSubmission",method=RequestMethod.POST)
	public String formSubmission(@RequestParam("feedback")String feedback,
			@RequestParam("product")String product,
			@RequestParam("source")String source,
			ModelMap map) {
		
		String page="status";
		
		Feedback fb=new Feedback(feedback, product, source);
		feedbackSpringDataRepository.save(fb);
		
		return page;
		
	}

}
