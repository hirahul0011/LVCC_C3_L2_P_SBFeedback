package com.ecommerce.LVCC_C3_L2_P_SBFeedback.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ecommerce.LVCC_C3_L2_P_SBFeedback.entity.Feedback;

import jakarta.persistence.EntityManager;

//@RepositoryRestResource(path="feedbacks")
public interface FeedbackSpringDataRepository extends JpaRepository<Feedback, Long>{	

}
