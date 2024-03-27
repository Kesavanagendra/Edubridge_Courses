package com.practice.AllRelationExample;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainStuSubTec {

    public static void main(String[] args) {

        Configuration config=new Configuration();
        File hiber = new File("C:\\Users\\kesava nagendra\\Downloads\\java preparation\\hibernate-project\\src\\resource\\hibernate.cfg.xml");
		config.configure(hiber);
		config.addAnnotatedClass(Student3.class);
		config.addAnnotatedClass(Subject.class);
		config.addAnnotatedClass(Teacher.class);

		SessionFactory sf = config.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx=session.beginTransaction();

        // Student3 sob = new Student3();
        // sob.setStudentname("Kesava");
        // sob.setStudentage(22);
        // sob.setStudentfee(2000);

        // Student3 sob1 = new Student3();
        // sob1.setStudentname("Rakesh");
        // sob1.setStudentage(22);
        // sob1.setStudentfee(2000);

        // Set<Student3> set = new HashSet<>();
        // set.add(sob);
        // set.add(sob1);

        // Subject sub = new Subject();
        // sub.setSubjectname("Java Fullstack");

        // Set<Subject> subset = new HashSet<>();
        // subset.add(sub);

        // Teacher tob =new Teacher();
        // tob.setTeachername("Madam");
        // tob.setTeachersalary(50000f);

        // sub.setStudent_subject(set);
        // tob.setSubject(subset);

        // session.save(sub);
        // session.save(tob);
        // // session.save(sob);

        // tx.commit();
        // session.close();


    }
    
}
