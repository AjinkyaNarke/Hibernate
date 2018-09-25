package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



import beans.Module;
import beans.Product;

public class Appconfig {

	public static void main(String[] args) {
	
		
		
		Module md=new Module();
		md.setModid(105);
		md.setModName("Java");
		md.setModType("User");
		
		
		Module mod=new Module();
		mod.setModid(101);
		mod.setModName("Python");
		mod.setModType("Client");
	
	
		Product p=new Product();
		p.setProid(1);
		p.setProdName("Spring");
		p.setProdCost(5.5);
		p.getMod().add(mod);
		p.getMod().add(md);
		
		
		
		Configuration con=new Configuration().configure("config/hibernate.cfg.xml").addAnnotatedClass(Module.class).addAnnotatedClass(Product.class);
		ServiceRegistry reg=new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		
	SessionFactory sf=con.buildSessionFactory(reg);


	Session s=sf.openSession();

	Transaction tx=s.beginTransaction();
		s.save(md);
		s.save(mod);
		s.save(p);
	
		tx.commit();
		s.close();
		
		
	}

}
