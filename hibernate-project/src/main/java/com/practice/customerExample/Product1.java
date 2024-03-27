package com.practice.customerExample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produ_table")
public class Product1 {
    
    @Id //primary key
	@Column(name="pid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productid;

	//productname varchar(40) not null unique
	@Column(name="pname",length = 40,nullable = false,unique = true)
	private String productname;

	@Column(name="pprice", nullable = false)
	private float productprice;
	
	//generate constructor , with no arg, with arg, and setter and getter method ,
		 //toString method
	public Product1() {
		super();
	}

    public Product1(int productid, String productname, float productprice) {
        this.productid = productid;
        this.productname = productname;
        this.productprice = productprice;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public float getProductprice() {
        return productprice;
    }

    public void setProductprice(float productprice) {
        this.productprice = productprice;
    }

    @Override
    public String toString() {
        return "Product1 [productid=" + productid + ", productname=" + productname + ", productprice=" + productprice
                + "]";
    }
}

