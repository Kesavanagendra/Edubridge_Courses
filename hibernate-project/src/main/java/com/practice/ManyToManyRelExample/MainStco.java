package com.practice.ManyToManyRelExample;

import java.io.File;
import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainStco {
    
    public static void main(String[] args) {

        Configuration config = new Configuration();
        File hiber = new File("C:\\Users\\kesava nagendra\\Downloads\\java preparation\\hibernate-project\\src\\resource\\hibernate.cfg.xml");
        config.configure(hiber);
        config.addAnnotatedClass(Stude.class);
        config.addAnnotatedClass(Course.class);

        SessionFactory sf = config.buildSessionFactory();

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        Stude sob = new Stude();
        sob.setStudentname("Kesava");
        Stude sob1 = new Stude();
        sob1.setStudentname("Rakesh");

        Course cob = new Course();
        cob.setCoursename("Java Fullstack");
        Course cob1 = new Course();
        cob1.setCoursename("Aptitude");

        sob.setCourses(Arrays.asList(cob,cob1));
        session.save(sob);
        sob1.setCourses(Arrays.asList(cob,cob1));
        session.save(sob1);

        tx.commit();

        session.close();


        
    
    }

}
