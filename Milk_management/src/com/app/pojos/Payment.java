package com.app.pojos;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "cust_payment_dtls")
public class Payment
{
	private Integer bid;
	private double quantity;
	private double amount;
	private Date bill_date;
	private String bill_status;
	
	private Customer_order cust_order_id;
	
	public Payment()
	{		}
	


	public Payment(double quantity, double amount, Date bill_date, String bill_status) {
		super();
		this.quantity = quantity;
		this.amount = amount;
		this.bill_date = bill_date;
		this.bill_status = bill_status;
	}



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}


	
	public double getQuantity() {
		return quantity;
	}



	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Temporal(TemporalType.DATE)
	public Date getBill_date() {
		return bill_date;
	}

	public void setBill_date(Date bill_date) {
		this.bill_date = bill_date;
	}

	
	public String getBill_status() {
		return bill_status;
	}

	public void setBill_status(String bill_status) {
		this.bill_status = bill_status;
	}


	@OneToOne
	@JoinColumn(name="cust_id")
	public Customer_order getCust_order_id() {
		return cust_order_id;
	}



	public void setCust_order_id(Customer_order cust_order_id) {
		this.cust_order_id = cust_order_id;
	}
	
	

	@Override
	public String toString() {
		return "Payment [bid=" + bid + ", quantity=" + quantity + ", amount=" + amount + ", bill_date=" + bill_date
				+ ", bill_status=" + bill_status + "]";
	}
	
}
