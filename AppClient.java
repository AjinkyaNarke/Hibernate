package test;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import model.Language;

public class AppClient {

	


	
	public static void main(String[]args)
	{
		Language l=new Language();
		l.setLid(6);
		l.setLName("Ajs");
	
		
		Configuration con=new Configuration().configure("config/hibernate.cfg.xml").addAnnotatedClass(Language.class);
		ServiceRegistry sr=new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		
		Transaction tx=s.beginTransaction();
		//s.save(l);
		
		tx.commit();
	String hql="from model.Language where Lid in (:a)" ;
	Query q=s.createQuery(hql);
	List<Integer> lag=Arrays.asList(1,3,5);
q.setParameter("a",lag);
   List <Language> ol=q.list();

		for(Language jj:ol)
	{
		System.out.println(jj);
	}
	

	}

}
