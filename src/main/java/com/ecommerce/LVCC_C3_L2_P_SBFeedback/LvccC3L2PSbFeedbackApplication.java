package com.ecommerce.LVCC_C3_L2_P_SBFeedback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ecommerce.LVCC_C3_L2_P_SBFeedback.repository.FeedbackRepository;

@SpringBootApplication
public class LvccC3L2PSbFeedbackApplication implements CommandLineRunner {
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private FeedbackRepository feedbackRepository;

	public static void main(String[] args) {
		SpringApplication.run(LvccC3L2PSbFeedbackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		feedbackRepository.insertWithQuery_Feedback();
		
	}

}
