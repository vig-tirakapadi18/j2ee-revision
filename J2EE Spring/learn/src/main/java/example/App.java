package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
        public static void main(String[] args) {
                ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

                KodnestClasses kod = (KodnestClasses) ctx.getBean("kod");
                System.out.println(kod);

                ctx.close();
        }
}
