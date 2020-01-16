package com.app.pojos;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "staff_dtls")
public class Staff
{
	private Integer st_id;
	private String delivery_area;
	private double Salary;
	
	private User user_id;
	private List<Customer_order> order_id=new ArrayList<>();
	
	
	public Staff()
	{		}
	


	public Staff(String delivery_area, double salary) {
		super();
		this.delivery_area = delivery_area;
		Salary = salary;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getSt_id() {
		return st_id;
	}

	public void setSt_id(Integer st_id) {
		this.st_id = st_id;
	}


	

	public double getSalary() {
		return Salary;
	}



	public void setSalary(double salary) {
		Salary = salary;
	}

	public String getDelivery_area() {
		return delivery_area;
	}


	public void setDelivery_area(String delivery_area) {
		this.delivery_area = delivery_area;
	}
	
	
	
	@OneToOne
	@JoinColumn(name="user_id")
	public User getUser_id() {
		return user_id;
	}



	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}

	  
	 	
	@OneToMany(mappedBy="staff_id",cascade = CascadeType.ALL,orphanRemoval = true)
	public List<Customer_order> getOrder_id() {
		return order_id;
	}



	public void setOrder_id(List<Customer_order> order_id) {
		this.order_id = order_id;
	}	



	@Override
	public String toString() {
		return "Staff [st_id=" + st_id + ", delivery_add=" + delivery_area + ", Salary=" + Salary + "]";
	}



	
	


}
