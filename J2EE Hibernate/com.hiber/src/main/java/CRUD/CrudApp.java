package CRUD;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class CrudApp {
        public static void main(String[] args) {
                // create();
                // read();
                // update();
                delete();
        }

        public static void create() {
                Citizen c1 = new Citizen(111, "Nobeta", 16);
                Citizen c2 = new Citizen(222, "Suzuca", 16);
                Citizen c3 = new Citizen(333, "Doraemon", 12);
                Citizen c4 = new Citizen(444, "Giyan", 17);
                Citizen c5 = new Citizen(555, "Suniyo", 15);

                Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
                SessionFactory sf = cfg.buildSessionFactory();
                Session session = sf.openSession();
                Transaction tr = session.beginTransaction();

                session.save(c1);
                session.save(c2);
                session.save(c3);
                session.save(c4);
                session.save(c5);

                tr.commit();
        }

        public static void read() {
                Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
                SessionFactory sf = cfg.buildSessionFactory();
                Session session = sf.openSession();
                Transaction tr = session.beginTransaction();

                // Using get(): It returns "null" if item doesn't exist
                // Relatively slower
                Citizen c1 = session.get(Citizen.class, 111);
                System.out.println(c1);

                // Using load(): It returns "ObjectNotFoundException" if item doesn't exist
                // Relatively faster
                Citizen c2 = session.load(Citizen.class, 222);
                System.out.println(c2);

                tr.commit();
        }

        public static void update() {
                Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
                SessionFactory sf = cfg.buildSessionFactory();
                Session session = sf.openSession();
                Transaction tr = session.beginTransaction();

                Citizen cz = session.get(Citizen.class, 111); // Get the item
                cz.setName("Nobi"); // Set new data
                session.save(cz); // Save to DB

                tr.commit();
        }

        public static void delete() {
                Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
                SessionFactory sf = cfg.buildSessionFactory();
                Session session = sf.openSession();
                Transaction tr = session.beginTransaction();

                Citizen cz = session.get(Citizen.class, 111);
                session.delete(cz);

                tr.commit();
        }
}
