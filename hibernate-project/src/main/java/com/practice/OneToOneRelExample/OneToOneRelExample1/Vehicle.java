package com.practice.OneToOneRelExample.OneToOneRelExample1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle_table")
public class Vehicle {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vehicleid;
    @Column(length=40,nullable = false)
    private String vehiclename;

    public Vehicle() {
    }

    public Vehicle(int vehicleid, String vehiclename) {
        this.vehicleid = vehicleid;
        this.vehiclename = vehiclename;
    }

    public int getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(int vehicleid) {
        this.vehicleid = vehicleid;
    }

    public String getVehiclename() {
        return vehiclename;
    }

    public void setVehiclename(String vehiclename) {
        this.vehiclename = vehiclename;
    }

    @Override
    public String toString() {
        return "Vehicle [vehicleid=" + vehicleid + ", vehiclename=" + vehiclename + "]";
    }

    
}
