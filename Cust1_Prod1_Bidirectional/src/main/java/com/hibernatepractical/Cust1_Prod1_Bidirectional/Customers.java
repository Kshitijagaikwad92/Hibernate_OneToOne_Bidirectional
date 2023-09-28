package com.hibernatepractical.Cust1_Prod1_Bidirectional;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.OneToOne;
	import javax.persistence.Table;

	@Table(name="Customers") //giving the name to the table
	@Entity(name="Customer_details") //we are declaring the entity file

	public class Customers {
			@Id  //declaring the primary key
			@Column(name="Cust_ID")
			private int cust_id; 
			@Column(name="Cust_Name")
			private String cname;
			@Column(name="Cust_City")
			private String ccity;
			@Column(name="Cust_Phone")
			private String cphone;
			@OneToOne  //one to one connection
			@JoinColumn(name="prod_id") 
			private Products prod;
			//constructors of Customer
			public Customers(int cust_id, String cname, String ccity, String cphone, Products prod) {
				super();
				this.cust_id = cust_id;
				this.cname = cname;
				this.ccity = ccity;
				this.cphone = cphone;
				this.prod = prod;
			}
			public Customers() {
				super();
				// TODO Auto-generated constructor stub
			}
			public int getCust_id() {
				return cust_id;
			}
			public void setCust_id(int cust_id) {
				this.cust_id = cust_id;
			}
			public String getCname() {
				return cname;
			}
			public void setCname(String cname) {
				this.cname = cname;
			}
			public String getCcity() {
				return ccity;
			}
			public void setCcity(String ccity) {
				this.ccity = ccity;
			}
			public String getCphone() {
				return cphone;
			}
			public void setCphone(String cphone) {
				this.cphone = cphone;
			}
			public Products getProd() {
				return prod;
			}
			public void setProd(Products p1) {
				this.prod = p1;
			}		
}
