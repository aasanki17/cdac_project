package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "feedback")
public class Feedback 
{
	private Integer f_id;
	private String feedback;
	
	private User user_id;
	
	public Feedback()
	{	}

	
	public Feedback(String feedback) {
		super();
		this.feedback = feedback;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getF_id() {
		return f_id;
	}



	public void setF_id(Integer f_id) {
		this.f_id = f_id;
	}

	
	public String getFeedback() {
		return feedback;
	}


	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}


	@ManyToOne
	@JoinColumn(name="user_id")
	public User getUser_id() {
		return user_id;
	}

	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}


	@Override
	public String toString() {
		return "Feedback [f_id=" + f_id + ", feedback=" + feedback + "]";
	}
	
	
}
