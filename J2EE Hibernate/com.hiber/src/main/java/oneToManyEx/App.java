package oneToManyEx;

import java.util.*;
import org.hibernate.cfg.*;
import org.hibernate.*;

public class App {
        public static void main(String[] args) {
                Product p1 = new Product();
                Product p2 = new Product();
                Product p3 = new Product();
                Product p4 = new Product();

                List<Product> pList1 = new ArrayList<Product>();
                pList1.add(p1);
                pList1.add(p2);

                List<Product> pList2 = new ArrayList<Product>();
                pList2.add(p3);
                pList2.add(p4);

                Customer cust1 = new Customer(101, "Vig", "Chennai", pList1);
                Customer cust2 = new Customer(102, "Vis", "Bangalore", pList2);

                p1.setpId(1111);
                p1.setpName("Think Like A Monk");
                p1.setpPrice(199);
                p1.setCust(cust1);

                p2.setpId(2222);
                p2.setpName("As A Man Thinketh");
                p2.setpPrice(66);
                p2.setCust(cust1);

                p3.setpId(3333);
                p3.setpName("Emotional Intelligence");
                p3.setpPrice(149);
                p3.setCust(cust2);

                p4.setpId(4444);
                p4.setpName("Antifragile");
                p4.setpPrice(599);
                p4.setCust(cust2);

                Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

                SessionFactory sf = cfg.buildSessionFactory();
                Session session = sf.openSession();

                Transaction t = session.beginTransaction();

                session.save(p1);
                session.save(p2);
                session.save(p3);
                session.save(p4);

                session.save(cust1);
                session.save(cust2);

                t.commit();
        }
}
