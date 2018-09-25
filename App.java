package Beans;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.mysql.cj.xdevapi.SessionFactory;

public class App {

	public static void main(String[] args) {


		
	
		
	Aliean_Name a=new Aliean_Name();
	a.setFname("Arua");
	a.setMlame("seema");
	a.setLname("Narke");
	
		Alien ai=new Alien();
		Alien ai5=new Alien();
		ai.setColor("Red");
		ai.setAliname(a);
		ai.setBday(new Date(1994-12-29));
		
		
		ai5.setColor("Pink");
		ai5.setAliname(a);
		ai5.setBday(new Date(1694-12-29));
		Configuration con=new Configuration().configure("config/hibernate.cfg.xml").addAnnotatedClass(Alien.class);
		ServiceRegistry reg=new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		
		org.hibernate.SessionFactory sf=con.buildSessionFactory(reg);
		
		Session ses=sf.openSession();
		
	Transaction tx=ses.beginTransaction();
	ses.save(ai5);
	//ai=(Alien)ses.get(Alien.class, 102);
	ses.save(ai);
	//	ai=(Alien)ses.get(Alien.class,101);
		System.out.println(ai);
		tx.commit();
		
		
	
	}

}
