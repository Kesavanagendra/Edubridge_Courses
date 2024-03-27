package com.practice.OneToOneRelExample.OneToOneRelExample2;

import java.io.File;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainStuCourse {
    public static void main(String[] args) {


        Configuration config = new Configuration();
        File hiber = new File("C:\\Users\\kesava nagendra\\Downloads\\java preparation\\hibernate-project\\src\\resource\\hibernate.cfg.xml");
        config.configure(hiber);
        config.addAnnotatedClass(Student.class);
        config.addAnnotatedClass(Course.class);

        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        Student sob = new Student();
        sob.setStudentname("Kesava");

        Course cob = new Course();
        cob.setCoursename("Aptitude");
        cob.setCoursefee(100);

        sob.setCourse(cob);

        session.save(sob);
        session.save(cob);

        tx.commit();

        session.close();
    }
}
