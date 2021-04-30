package com.niit.JavaHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
        //Student student = new Student(12, "sana",54,80);
        //Student student1 = new Student(3, "hyma",8,60);
    	StudentName sname = new StudentName("naru","lahari","reddy");
    	Student student = new Student(10,6,70,sname);
    	
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        //Student s1 = session.get(Student.class, 12);
		//System.out.println(s1);
        session.save(student);
        //session.save(student1);

        transaction.commit();
        }
}
