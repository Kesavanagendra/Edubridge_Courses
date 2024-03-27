package com.practice.OneToOneRelExample.OneToOneRelExample1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class Userdetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;
    @Column(length=40,nullable = false)
    private String username;

    @OneToOne
    @JoinColumn(name ="vehicleid")
    Vehicle vehicle;



    public Userdetails() {
    }

    public Userdetails(int userid, String username) {
        this.userid = userid;
        this.username = username;
    }

    
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    

    @Override
    public String toString() {
        return "Userdetails [userid=" + userid + ", username=" + username + "]";
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    
    
}
