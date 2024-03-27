package com.practice.productexample;

import java.io.File;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Mainproduct {
    public static void main(String[] args) {

        File hiber = new File("C:\\Users\\kesava nagendra\\Downloads\\java preparation\\hibernate-project\\src\\resource\\hibernate.cfg.xml");
        
        Configuration config = new Configuration();
        // config.configure("hibernate.cfg.xml");
        config.configure(hiber);
        config.addAnnotatedClass(Product.class);

        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        // Product obj = new Product();

        for(int i=0;i<3;i++){
            Scanner sc = new Scanner(System.in);
            String pname = sc.next();
            float pprice = sc.nextFloat();
            Product obj = new Product();
            obj.setProductname(pname);
            obj.setProductprice(pprice);
            session.save(obj);
        }
        //---(or)--------------------------------

        // for(int i=0;i<3;i++){
        //     Scanner sc = new Scanner(System.in);
        //     String pname = sc.next();
        //     float pprice = sc.nextFloat();
        //     Product obj = new Product(pname,pprice);
        //     session.save(obj);
        // }

        
        // session.save(obj);

        tx.commit();

        session.close();


    }
    
}
