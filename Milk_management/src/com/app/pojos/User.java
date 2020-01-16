package com.app.pojos;
import java.util.Date;
import java.util.*;

import javax.persistence.*;


@Entity
@Table(name = "user_dtls")
public class User 
{
  private Integer user_id;
  private String name,password,confirmPassword,email_id;
  private UserRole role;
  private String contact_No;
  private Address addr;
  private Date reg_date;
  
  
  private List<Customer_order> order_id=new ArrayList<>();
  private Staff staff_id;
  private Seller seller_id;
  private List<Feedback> feedback=new ArrayList<>();
  
  
  public User()
  { }
  
  public User(String name, String password, String confirmPassword, String email_id, UserRole role,
		String contact_No) {
	super();
	this.name = name;
	this.password = password;
	this.confirmPassword = confirmPassword;
	this.email_id = email_id;
	this.role = role;
	this.contact_No = contact_No;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="userId")
   public Integer getUser_id() 
   {
	return user_id;
   }
   
   public void setUser_id(Integer user_id) 
   {
	this.user_id = user_id;
   }
   
   @Column(length = 50)
   public String getName() 
   {
	return name;
   }
   
   public void setName(String name) 
   {
	this.name = name;
   }
   
   @Column(length = 50)
   public String getPassword() 
   {
	return password;
   }
   
   
   public void setPassword(String password) 
   {
	this.password = password;
   }
   
   @Transient
   @Column(length = 50)
   public String getConfirmPassword() 
   {
	return confirmPassword;
   }
   
   public void setConfirmPassword(String confirmPassword) 
   {
	this.confirmPassword = confirmPassword;
   }
   
   @Column(length = 30,unique = true)
   public String getEmail_id() 
   {
	return email_id;
   }
   
   public void setEmail_id(String email_id) 
   {
	this.email_id = email_id;
   }
   
   @Enumerated(EnumType.STRING)
   public UserRole getRole() 
   {
	return role;
   }
   
   
   public void setRole(UserRole role) {
	this.role = role;
   }
   
   @Column(length = 20)
   public String getContact_No() 
   {
	return contact_No;
   }
   
   
   public void setContact_No(String contact_No) 
   {
	this.contact_No = contact_No;
   }
   
   @Embedded
   public Address getAddr() 
   {
	return addr;
   }
   
   public void setAddr(Address addr) 
   {
	this.addr = addr;
   }

   
   @Temporal(TemporalType.DATE)
   public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	
	
	
	
	
	
	@OneToMany(mappedBy="user_id",cascade = CascadeType.ALL,orphanRemoval = true)
	public List<Customer_order> getOrder_id() {
		return order_id;
	}

	public void setOrder_id(List<Customer_order> order_id) {
		this.order_id = order_id;
	}
	
	

	@OneToOne(mappedBy="user_id",cascade = CascadeType.ALL,orphanRemoval = true)
	public Staff getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(Staff staff_id) {
		this.staff_id = staff_id;
	}

	
	@OneToOne(mappedBy="user_id",cascade = CascadeType.ALL,orphanRemoval = true)
	public Seller getSeller_id() {
		return seller_id;
	}

	public void setSeller_id(Seller seller_id) {
		this.seller_id = seller_id;
	}

	
	@OneToMany(mappedBy="user_id",cascade = CascadeType.ALL,orphanRemoval = true)
	public List<Feedback> getFeedback() {
		return feedback;
	}

	public void setFeedback(List<Feedback> feedback) {
		this.feedback = feedback;
	}

	
	
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", password=" + password + ", confirmPassword="
				+ confirmPassword + ", email_id=" + email_id + ", role=" + role + ", contact_No=" + contact_No
				+ ", addr=" + addr + ", reg_date=" + reg_date + "]";
	}

	
	
}
