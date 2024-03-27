package com.practice.customerExample;

import java.io.File;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainCusto_produ {

    public static void main(String[] args) {

        File hiber = new File("C:\\Users\\kesava nagendra\\Downloads\\java preparation\\hibernate-project\\src\\resource\\hibernate.cfg.xml");
        Configuration config = new Configuration();
        config.configure(hiber);
        config.addAnnotatedClass(Customer.class);
        config.addAnnotatedClass(Product1.class);

        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();

        Customer cob = new Customer();
        cob.setCustomername("king");
        cob.setCustomeremail("king@123");

        session.save(cob);

        Product1 pob = new Product1();
        pob.setProductname("HP");
        pob.setProductprice(5000);

        session.save(pob);

        tx.commit();
        session.close();
    }
}
