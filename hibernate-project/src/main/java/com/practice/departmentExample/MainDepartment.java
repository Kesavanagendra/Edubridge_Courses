package com.practice.departmentExample;

import java.io.File;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainDepartment {

    public static void main(String[] args) {

        File hiber = new File("C:\\Users\\kesava nagendra\\Downloads\\java preparation\\hibernate-project\\src\\resource\\hibernate.cfg.xml");
        Configuration config = new Configuration();
        config.configure(hiber);
        config.addAnnotatedClass(Department.class);

        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        Department obj = new Department();
        obj.setName("Kumar");
        obj.setAddress("Tanuku");

        session.save(obj);
        tx.commit();
        session.close();
    }
}
