package com.practice.OneToManyRelExamples.OneToManyRelExample1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainDeptEmp {
    public static void main(String[] args) {
        Configuration config = new Configuration();
        File hiber = new File("C:\\Users\\kesava nagendra\\Downloads\\java preparation\\hibernate-project\\src\\resource\\hibernate.cfg.xml");
        config.configure(hiber);
        config.addAnnotatedClass(Employee.class);
        config.addAnnotatedClass(Department.class);
    
        SessionFactory sf = config.buildSessionFactory();
        
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Department dob = new Department();
        dob.setDepartmentname("CSE");
        dob.setDepartmentlocation("Hyderabad");

        Employee eob = new Employee();
        eob.setEmployeename("Kesava");
        eob.setEmployeeage(22);
        eob.setEmployeesalary(500000);
        eob.setEmployeeemail("Kesava@gmail.com");

        List<Employee> lob = new ArrayList<>();
        lob.add(eob);

        Employee eob1 = new Employee();
		eob1.setEmployeename("Ramesh");
		eob1.setEmployeeage(22);
		eob1.setEmployeeemail("Ramesh@gmail");
		eob1.setEmployeesalary(99761.54f);
        lob.add(eob1);

        dob.setEmployee(lob);

        session.save(dob);
        tx.commit();
        session.close();

    }
}
