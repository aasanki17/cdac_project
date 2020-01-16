package com.app.pojos;
import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "customer_order_dtls")
public class Customer_order 
{
	private Integer order_id;
	private Status status;
	private CattleType cattle_type;
	private double quantity;
	private Date from_date;
	private Date to_date;
	
	private User user_id;
	private Staff staff_id;
	private Payment p_id;
	
	
	public Customer_order()
	{		}



	public Customer_order(Status status, CattleType cattle_type, double quantity, Date from_date, Date to_date) {
		super();
		this.status = status;
		this.cattle_type = cattle_type;
		this.quantity = quantity;
		this.from_date = from_date;
		this.to_date = to_date;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getOrder_id() {
		return order_id;
	}



	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	

	
	@Enumerated(EnumType.STRING)
	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}

	@Enumerated(EnumType.STRING)
	public CattleType getCattle_type() {
		return cattle_type;
	}

	
	public void setCattle_type(CattleType cattle_type) {
		this.cattle_type = cattle_type;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	@Temporal(TemporalType.DATE)
	public Date getFrom_date() {
		return from_date;
	}

	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}


	@Temporal(TemporalType.DATE)
	public Date getTo_date() {
		return to_date;
	}

	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}

	
	@ManyToOne
	@JoinColumn(name="user_id")
	public User getUser_id() {
		return user_id;
	}


	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}
	
	
	@ManyToOne
	@JoinColumn(name="staff_id")
	public Staff getStaff_id() {
		return staff_id;
	}



	public void setStaff_id(Staff staff_id) {
		this.staff_id = staff_id;
	}
	

	@OneToOne(mappedBy="cust_order_id",cascade = CascadeType.ALL,orphanRemoval = true)
	public Payment getP_id() {
		return p_id;
	}



	public void setP_id(Payment p_id) {
		this.p_id = p_id;
	}



	@Override
	public String toString() {
		return "Customer [order_id=" + order_id + ", status=" + status + ", cattle_type=" + cattle_type + ", quantity="
				+ quantity + ", from_date=" + from_date + ", to_date=" + to_date + "]";
	}

}
