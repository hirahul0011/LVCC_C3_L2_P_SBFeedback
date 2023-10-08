package com.ecommerce.LVCC_C3_L2_P_SBFeedback.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
public class Feedback {
	
	@Id
	@GeneratedValue
	private Long id;
	private String feedback;
	private String product;
	private String source;
	
	//so that other classes which do not inherit the course class are not able to 
	//use this constructor 
	protected Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}	

	public Feedback(String feedback, String product, String source) {
		super();
		this.feedback = feedback;
		this.product = product;
		this.source = source;
	}	

	public Long getId() {
		return id;
	}	

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", feedback=" + feedback + ", product=" + product + ", source=" + source + "]";
	}	

}
