package com.practice.OneToOneRelExample.OneToOneRelExample1;

import java.io.File;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainUserVehicle {

    public static void main(String[] args) {
        
        Configuration config = new Configuration();
        File hiber = new File("C:\\Users\\kesava nagendra\\Downloads\\java preparation\\hibernate-project\\src\\resource\\hibernate.cfg.xml");
        config.configure(hiber);
        config.addAnnotatedClass(Userdetails.class);
        config.addAnnotatedClass(Vehicle.class);
    
        SessionFactory sf = config.buildSessionFactory();
        
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Userdetails uob = new Userdetails();
        Vehicle vob = new Vehicle();

        uob.setUsername("Kesava");
        vob.setVehiclename("Lamborghini");

        uob.setVehicle(vob);
        

        session.save(uob);
        session.save(vob);

        tx.commit();
    
    }
    
}
