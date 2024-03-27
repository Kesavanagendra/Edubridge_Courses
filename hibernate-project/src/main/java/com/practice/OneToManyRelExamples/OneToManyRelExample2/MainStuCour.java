package com.practice.OneToManyRelExamples.OneToManyRelExample2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainStuCour {

    public static void main(String[] args) {

        Configuration config = new Configuration();
        File hiber = new File("C:\\Users\\kesava nagendra\\Downloads\\java preparation\\hibernate-project\\src\\resource\\hibernate.cfg.xml");
        config.configure(hiber);
        config.addAnnotatedClass(Student1.class);
        config.addAnnotatedClass(Course1.class);

        SessionFactory sf = config.buildSessionFactory();

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        Course1 cob = new Course1();
        cob.setCoursename("Java fullstack");
        cob.setCoursefee(2000);

        Student1 sob = new Student1();
        sob.setStudentname("Kesava");
        sob.setStudentage(22);
        sob.setStudentemail("Kesava@gmail.com");

        List<Student1> list = new ArrayList<>();
        list.add(sob);

        Student1 sob1 = new Student1();
        sob1.setStudentname("Rakesh");
        sob1.setStudentage(22);
        sob1.setStudentemail("Rakesh@gmail.com");
        list.add(sob1);

        //---To insert multiple records at a time.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter how many records you want");
        // int n = sc.nextInt();
        // for(int i=1;i<=n;i++){

        //     Student1 sob2 = new Student1();
        //     System.out.println("Enter student name");
        //     String sname = sc.next();
        //     System.out.println("Enter student age");
        //     int sage = sc.nextInt();
        //     System.out.println("Enter student email");
        //     String semail = sc.next();

        //     sob2.setStudentname(sname);
        //     sob2.setStudentage(sage);
        //     sob2.setStudentemail(semail);
        //     list.add(sob2);

        //     cob.setStudent(list);
        //     session.save(cob);
        // }

        cob.setStudent(list);

        session.save(cob);

        tx.commit();

        session.close();

    }
    
}
