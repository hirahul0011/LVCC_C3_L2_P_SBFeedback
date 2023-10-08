package com.ecommerce.LVCC_C3_L2_P_SBFeedback.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;

@Repository
@Transactional
public class FeedbackRepository {
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager em;	
	
	public void insertWithQuery_Feedback() {
	    em.createNativeQuery("insert into feedback (id,feedback,product,source) \r\n"
	    		+ "values (50001,'Great','Wet Shaver','Amazon');"
	    		+"insert into feedback (id,feedback,product,source) \r\n"
	    		+ "values (50002,'Wonderful','Wet Shaver','Flipkart');"
	    		+"insert into feedback (id,feedback,product,source) \r\n"
	    		+ "values (50003,'Awesome','Wet Shaver','Chroma');"
	    		
	    		+"insert into feedback (id,feedback,product,source) \r\n"
	    		+ "values (50004,'Great','Dry Shaver','Amazon');"
	    		+"insert into feedback (id,feedback,product,source) \r\n"
	    		+ "values (50005,'Wonderful','Dry Shaver','Flipkart');"
	    		+"insert into feedback (id,feedback,product,source) \r\n"
	    		+ "values (50006,'Awesome','Dry Shaver','Chroma');"
	    		
				+"insert into feedback (id,feedback,product,source) \r\n"
				+ "values (50007,'Great','Trimmer','Amazon');"
				+"insert into feedback (id,feedback,product,source) \r\n"
				+ "values (50008,'Wonderful','Trimmer','Flipkart');"
				+"insert into feedback (id,feedback,product,source) \r\n"
				+ "values (50009,'Awesome','Trimmer','Chroma');")	      
	      .executeUpdate();
	}	

}
