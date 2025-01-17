package com.practice.customerExample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cust_table")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerid;

    @Column(name="cname",length = 40, nullable = false)
    private String customername;

    @Column(name="cemail",nullable = false, unique = true)
    private String customeremail;

    public Customer() {
    }

    public Customer(int customerid, String customername, String customeremail) {
        this.customerid = customerid;
        this.customername = customername;
        this.customeremail = customeremail;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomeremail() {
        return customeremail;
    }

    public void setCustomeremail(String customeremail) {
        this.customeremail = customeremail;
    }

    @Override
    public String toString() {
        return "Customer [customerid=" + customerid + ", customername=" + customername + ", customeremail="
                + customeremail + "]";
    }
}
