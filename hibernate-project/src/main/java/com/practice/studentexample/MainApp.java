package com.practice.studentexample;

import java.io.File;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {

		//step 1
		Configuration configuration = new Configuration();
		// configuration.configure("hibernate.cfg.xml");

		File hiberfile = new File("C:\\Users\\kesava nagendra\\Downloads\\java preparation\\hibernate-project\\src\\resource\\hibernate.cfg.xml");
		configuration.configure(hiberfile);

		configuration.addAnnotatedClass(Student.class);
		
		//step 2
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		//Step 3
		Session session=sessionFactory.openSession();
		//step 4
		Transaction transaction =session.beginTransaction();
		
		// Student student=new Student(); //Transient
		// student.setSid(1);
		// student.setSname("Kesava");

		//For inserting multiple records
		for(int i=1;i<=1;i++){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter id & name");
			int id = sc.nextInt();
			String name = sc.next();
			Student student=new Student();
			student.setSid(id);
			student.setSname(name);

			session.save(student);
			
		}
		
		// session.save(student); 
		transaction.commit();
		session.close();// Detached state
	}
}




/*+---------------------------+-----------------------------------+-----------------------------------------------+ */
/*------------------HQL queries to Retrive,Update,Delete.------------------------------------------------------------*/

/*Hibernate Query Language (HQL) is same as SQL (Structured Query Language) but it doesn't depends on the table of the database. 
Instead of table name, we use class name in HQL. So it is database independent query language */


/*
 * Example of HQL to get all the records
	1.	Query query=session.createQuery("from Emp");//here persistent class name is Emp  
	2.	List list=query.list();  
 */

// package com.practice.studentexample;

// import java.io.File;
// import java.util.Iterator;
// import java.util.List;

// import org.hibernate.Session;
// import org.hibernate.SessionFactory;
// import org.hibernate.Transaction;
// import org.hibernate.cfg.Configuration;
// import org.hibernate.query.Query;

// public class MainApp {

// 	public static void main(String[] args) {

// 			//step 1
// 		Configuration configuration = new Configuration();
// 		// configuration.configure("hibernate.cfg.xml");

// 		File hiberfile = new File("C:\\Users\\kesava nagendra\\Downloads\\java preparation\\hibernate-project\\src\\resource\\hibernate.cfg.xml");
// 		configuration.configure(hiberfile);

// 		configuration.addAnnotatedClass(Student.class);
		
// 		//step 2
// 		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
// 		//Step 3
// 		Session session=sessionFactory.openSession();
// 		//step 4
// 		Transaction tx =session.beginTransaction();
		
// 		//Using HQL to retrieve the records from database.
// 		Query<Student> que = session.createQuery("from Student");
// 		List<Student> obj = que.list();

// 		Iterator<Student> iter = obj.iterator();
// 		System.out.println("Sid\tSname");

// 		while(iter.hasNext()){
// 			Student sob = iter.next();
// 			// System.out.println("enter");
// 			System.out.println(sob.getSid()+"\t"+sob.getSname());
// 			// System.out.println(iter.next());
// 		}
// 	}
// }



/*+---------------------------+-----------------------------------+-----------------------------------------------+ */


/*
Example of HQL to get records with pagination
	1.	Query query=session.createQuery("from Emp");  
	2.	query.setFirstResult(5);  
	3.	query.setMaxResult(10);  
	4.	List list=query.list();//will return the records from 5 to 10th number  
 */ 
// package com.practice.studentexample;

// import java.io.File;
// import java.util.Iterator;
// import java.util.List;

// import org.hibernate.Session;
// import org.hibernate.SessionFactory;
// import org.hibernate.Transaction;
// import org.hibernate.cfg.Configuration;
// import org.hibernate.query.Query;

// public class MainApp {

// 	public static void main(String[] args) {

// 			//step 1
// 		Configuration configuration = new Configuration();
// 		// configuration.configure("hibernate.cfg.xml");

// 		File hiberfile = new File("C:\\Users\\kesava nagendra\\Downloads\\java preparation\\hibernate-project\\src\\resource\\hibernate.cfg.xml");
// 		configuration.configure(hiberfile);

// 		configuration.addAnnotatedClass(Student.class);
		
// 		//step 2
// 		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
// 		//Step 3
// 		Session session=sessionFactory.openSession();
// 		//step 4
// 		Transaction tx =session.beginTransaction();
		
// 		//Using HQL to retrieve the records from database, from particular position to other position.
// 		Query<Student> q = session.createQuery("from Student");
// 		q.setFirstResult(0);
// 		q.setMaxResults(2);
// 		List<Student> lob = q.list();

// 		System.out.println("Sid\tSname");

// 		Iterator<Student> iter = lob.iterator();

// 		while(iter.hasNext()){
// 			Student sob = iter.next();
// 			// System.out.println("enter");
// 			System.out.println(sob.getSid()+"\t"+sob.getSname());
// 			// System.out.println(iter.next());
// 		}
// 	}
// }




/*+---------------------------+-----------------------------------+-----------------------------------------------+ */


/*
 * Example of HQL update query
	1.	Transaction tx=session.beginTransaction();  
	Query q=session.createQuery("update User set name=:n where id=:i");  
	q.setParameter("n","Udit Kumar");  
	q.setParameter("i",111); 
	int status=q.executeUpdate();  
	System.out.println(status);  
	tx.commit();  
 
 */
// package com.practice.studentexample;

// import java.io.File;
// import java.util.Iterator;
// import java.util.List;

// import org.hibernate.Session;
// import org.hibernate.SessionFactory;
// import org.hibernate.Transaction;
// import org.hibernate.cfg.Configuration;
// import org.hibernate.query.Query;

// public class MainApp {

// 	public static void main(String[] args) {

// 			//step 1
// 		Configuration configuration = new Configuration();
// 		// configuration.configure("hibernate.cfg.xml");

// 		File hiberfile = new File("C:\\Users\\kesava nagendra\\Downloads\\java preparation\\hibernate-project\\src\\resource\\hibernate.cfg.xml");
// 		configuration.configure(hiberfile);

// 		configuration.addAnnotatedClass(Student.class);
		
// 		//step 2
// 		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
// 		//Step 3
// 		Session session=sessionFactory.openSession();
// 		//step 4
// 		Transaction tx =session.beginTransaction();
		
//		//Update the query using HQL.
// 		Query<Student> q = session.createQuery("update Student set sname = :n where sid = :i");
// 		q.setParameter("n", "Kesava1");
// 		q.setParameter("i", 2 );
// 		q.executeUpdate();
		
//		//Retrieve the records using HQL.
// 		Query<Student> q2 = session.createQuery("from Student");
// 		List<Student> obj = q2.list();
// 		System.out.println("id\tname");

// 		Iterator<Student> iter = obj.iterator();

// 		while(iter.hasNext()){
// 			Student sob = iter.next();
// 			System.out.println(sob.getSid()+"\t"+sob.getSname());

// 		}
// 		tx.commit();
// 	}
// }




/*+---------------------------+-----------------------------------+-----------------------------------------------+ */



/*
 * Example of HQL delete query
	1.	Query query=session.createQuery("delete from Emp where id=100");  
	2.	//specifying class name (Emp) not tablename  
	3.	query.executeUpdate(); 
 */

// package com.practice.studentexample;

// import java.io.File;
// import java.util.Iterator;
// import java.util.List;

// import org.hibernate.Session;
// import org.hibernate.SessionFactory;
// import org.hibernate.Transaction;
// import org.hibernate.cfg.Configuration;
// import org.hibernate.query.Query;

// public class MainApp {

// 	public static void main(String[] args) {

// 			//step 1
// 		Configuration configuration = new Configuration();
// 		// configuration.configure("hibernate.cfg.xml");

// 		File hiberfile = new File("C:\\Users\\kesava nagendra\\Downloads\\java preparation\\hibernate-project\\src\\resource\\hibernate.cfg.xml");
// 		configuration.configure(hiberfile);

// 		configuration.addAnnotatedClass(Student.class);
		
// 		//step 2
// 		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
// 		//Step 3
// 		Session session=sessionFactory.openSession();
// 		//step 4
// 		Transaction tx =session.beginTransaction();
		
// 		//delete the query using HQL
// 		Query<Student> q = session.createQuery("delete from Student where sid = :i");
// 		q.setParameter("i", 2 );
// 		q.executeUpdate();
		
// 		//Retrieve the records using HQL
// 		Query<Student> q2 = session.createQuery("from Student");
// 		List<Student> obj = q2.list();
// 		System.out.println("id\tname");

// 		Iterator<Student> iter = obj.iterator();

// 		while(iter.hasNext()){
// 			Student sob = iter.next();
// 			System.out.println(sob.getSid()+"\t"+sob.getSname());

// 		}

// 		tx.commit();
// 	}
// }