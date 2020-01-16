package com.app.pojos;
import javax.persistence.*;


@Entity
@Table(name = "milk")
public class Milk 
{
	private double fat;
	private double price_cow;
	private double price_buffalo;
	private double quantity_cow;
	private double quantity_buffalo;
	
	public Milk()
	{	}
	
	


	public Milk(double fat, double price_cow, double price_buffalo, double quantity_cow, double quantity_buffalo) {
		super();
		this.fat = fat;
		this.price_cow = price_cow;
		this.price_buffalo = price_buffalo;
		this.quantity_cow = quantity_cow;
		this.quantity_buffalo = quantity_buffalo;
	}




	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public double getFat() {
		return fat;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}
	
	public double getPrice_cow() {
		return price_cow;
	}

	public void setPrice_cow(double price_cow) {
		this.price_cow = price_cow;
	}

	public double getPrice_buffalo() {
		return price_buffalo;
	}

	public void setPrice_buffalo(double price_buffalo) {
		this.price_buffalo = price_buffalo;
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




	@Override
	public String toString() {
		return "Milk [fat=" + fat + ", price_cow=" + price_cow + ", price_buffalo=" + price_buffalo + ", quantity_cow="
				+ quantity_cow + ", quantity_buffalo=" + quantity_buffalo + "]";
	}


	

	                                                                                                                                                                                       
}
