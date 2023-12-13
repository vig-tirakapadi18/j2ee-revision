package learning.com.hiber;

import org.hibernate.*;
import org.hibernate.cfg.*;

class App 
{
    public static void main( String[] args ) {
    	Bike b1 = new Bike();
    	Bike b2 = new Bike();
    	Bike b3 = new Bike();
    	
    	Student s1 = new Student(101, "Abc", 2018, b1);
    	Student s2 = new Student(102, "Vig", 2022, b2);
    	Student s3 = new Student(103, "Vis", 2024, b3);
    	
    	b1.setBikeNum(1111);
    	b1.setModel("Mountain Rider");
    	b1.setPrice(355000);
    	b1.setStud(s1);
    	
    	b2.setBikeNum(2222);
    	b2.setModel("Bullet");
    	b2.setPrice(120000);
    	b2.setStud(s2);
    	
    	b3.setBikeNum(3333);
    	b3.setModel("Apachi");
    	b3.setPrice(180000);
    	b3.setStud(s3);
    	
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        
        Transaction t = session.beginTransaction();
        session.save(s1);
        session.save(s2);
        session.save(s3);
        
        session.save(b1);
        session.save(b2);
        session.save(b3);
        t.commit();
    }
}
