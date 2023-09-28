package com.hibernatepractical.Cust1_Prod1_Bidirectional;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="Products")
@Entity(name="Product_details") //naming the entity class

public class Products {

		@Id// it will create as primary key
		@Column(name="Product_ID")
		private int pid;
		@Column(name="Product_Name")
		private String pname;
		@Column(name="Product_Color")
		private String pcolor;
		@Column(name="Product_Price")
		private int pprice;
		@OneToOne  //one to one connection
		@JoinColumn(name="Cust_ID")
		private Customers cust;
		//constructor
		public Products(int pid, String pname, String pcolor, int pprice, Customers cust) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.pcolor = pcolor;
			this.pprice = pprice;
			this.cust = cust;
		}
		public Products() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public String getPcolor() {
			return pcolor;
		}
		public void setPcolor(String pcolor) {
			this.pcolor = pcolor;
		}
		public int getPprice() {
			return pprice;
		}
		public void setPprice(int pprice) {
			this.pprice = pprice;
		}
		public Customers getCust() {
			return cust;
		}
		public void setCust(Customers cust) {
			this.cust = cust;
		}
		
}	
