package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "seller_dtls")
public class Seller 
{
	private Integer se_id;
	private double fat_cow;
	private double fat_buffalo;
	private String cattle_type;
	private double quantity_cow;
	private double quantity_buffalo;
	private double payment;
	
	private User user_id;
	
	
	public Seller()
	{		}


	public Seller(double fat_cow, double fat_buffalo, String cattle_type, double quantity_cow, double quantity_buffalo,
			double payment) {
		super();
		this.fat_cow = fat_cow;
		this.fat_buffalo = fat_buffalo;
		this.cattle_type = cattle_type;
		this.quantity_cow = quantity_cow;
		this.quantity_buffalo = quantity_buffalo;
		this.payment = payment;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getSe_id() {
		return se_id;
	}

	public void setSe_id(Integer se_id) {
		this.se_id = se_id;
	}
	
	

	public double getFat_cow() {
		return fat_cow;
	}


	public void setFat_cow(double fat_cow) {
		this.fat_cow = fat_cow;
	}


	public double getFat_buffalo() {
		return fat_buffalo;
	}


	public void setFat_buffalo(double fat_buffalo) {
		this.fat_buffalo = fat_buffalo;
	}


	public String getCattle_type() {
		return cattle_type;
	}

	public void setCattle_type(String cattle_type) {
		this.cattle_type = cattle_type;
	}

	public double getQuantity_cow() {
		return quantity_cow;
	}

	public void setQuantity_cow(double quantity_cow) {
		this.quantity_cow = quantity_cow;
	}

	public double getQuantity_buffalo() {
		return quantity_buffalo;
	}

	public void setQuantity_buffalo(double quantity_buffalo) {
		this.quantity_buffalo = quantity_buffalo;
	}

	public double getPayment() {
		return payment;
	}


	public void setPayment(double payment) {
		this.payment = payment;
	}

	
	@OneToOne
	@JoinColumn(name="user_id")
	public User getUser_id() {
		return user_id;
	}


	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}
	


		@Override
		public String toString() {
			return "Seller [se_id=" + se_id + ", fat_cow=" + fat_cow + ", fat_buffalo=" + fat_buffalo + ", cattle_type="
					+ cattle_type + ", quantity_cow=" + quantity_cow + ", quantity_buffalo=" + quantity_buffalo
					+ ", payment=" + payment + "]";
		}
	  	
	
}
