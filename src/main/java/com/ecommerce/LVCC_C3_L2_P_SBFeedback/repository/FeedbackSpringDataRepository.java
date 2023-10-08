package com.ecommerce.LVCC_C3_L2_P_SBFeedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ecommerce.LVCC_C3_L2_P_SBFeedback.entity.Feedback;

//This interface would work as a REST API even if we do not use @RepositoryRestResource
//@RepositoryRestResource can be used to change the standard path
@RepositoryRestResource(path="productFeedbacks")
public interface FeedbackSpringDataRepository extends JpaRepository<Feedback, Long>{	

}
