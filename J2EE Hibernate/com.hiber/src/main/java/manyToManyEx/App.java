package manyToManyEx;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class App {
        public static void main(String[] args) {
                User u1 = new User();
                User u2 = new User();
                User u3 = new User();

                // User List for Instagram
                List<User> uList1 = new ArrayList<User>();
                uList1.add(u2);

                // User List for Snapchat
                List<User> uList2 = new ArrayList<User>();
                uList2.add(u1);
                uList2.add(u2);

                // User List for WhatsApp
                List<User> uList3 = new ArrayList<User>();
                uList3.add(u1);
                uList3.add(u2);
                uList3.add(u3);

                // User List for Flipkart
                List<User> uList4 = new ArrayList<User>();
                uList4.add(u2);
                uList4.add(u3);

                SocialMedia sm1 = new SocialMedia(101, "Instagram", uList1);
                SocialMedia sm2 = new SocialMedia(102, "Snapchat", uList2);
                SocialMedia sm3 = new SocialMedia(103, "WhatsApp", uList3);
                SocialMedia sm4 = new SocialMedia(104, "Flipkart", uList4);

                // List of SocialMedia for Vig
                List<SocialMedia> smList1 = new ArrayList<SocialMedia>();
                smList1.add(sm2);
                smList1.add(sm3);

                // List of SocialMedia for Vis
                List<SocialMedia> smList2 = new ArrayList<SocialMedia>();
                smList2.add(sm1);
                smList2.add(sm2);
                smList2.add(sm3);
                smList2.add(sm4);

                // List of SocialMedia for Ind
                List<SocialMedia> smList3 = new ArrayList<SocialMedia>();
                smList3.add(sm3);
                smList3.add(sm4);

                u1.setuId(1111);
                u1.setuName("Vig");
                u1.setsList(smList1);

                u2.setuId(2222);
                u2.setuName("Vis");
                u2.setsList(smList2);

                u3.setuId(3333);
                u3.setuName("Ind");
                u3.setsList(smList3);

                Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
                SessionFactory sf = cfg.buildSessionFactory();
                Session session = sf.openSession();
                Transaction tr = session.beginTransaction();

                session.save(sm1);
                session.save(sm2);
                session.save(sm3);
                session.save(sm4);

                session.save(u1);
                session.save(u2);
                session.save(u3);

                tr.commit();
        }
}
