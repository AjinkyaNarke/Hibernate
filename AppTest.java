package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import beans.Student;

public class AppTest {

	public static void main(String[] args) {

		
	Student st;
	
	
		Configuration configuration=new Configuration().configure("config/Hibconfig.cfg.xml").addAnnotatedClass(Student.class);
		ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SessionFactory sf=configuration.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tx=ss.beginTransaction();
	
/*Hibernate: select student0_.pid as pid1_0_0_, student0_.pname as pname2_0_0_ from Stable student0_ where student0_.pid=?
Student [pid=101, pname=Ajinkya]
Student [pid=101, pname=Ajinkya]

*First time hit database
*Second time hit first level cache
*
*/

	      st=(Student)ss.get(Student.class,101);
	      System.out.println(st);
	      
	      st=(Student)ss.get(Student.class,101);
	      System.out.println(st);
	      
	    
			
			ss.close();
		
	      Session ss12=sf.openSession();
	      Student st1;
	      
	      st1=(Student)ss12.get(Student.class, 101);
	      System.out.println(st1);
	      
	      
	
		
		ss12.close();
	
		
		
	
	
	
	}

}
