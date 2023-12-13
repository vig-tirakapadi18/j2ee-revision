package spring.learn;

import org.springframework.context.support.*;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Student st1 = (Student) ctx.getBean("st1");
        System.out.println(st1);

        Student st2 = (Student) ctx.getBean("st2");
        System.out.println(st2);

        Student st3 = (Student) ctx.getBean("st3");
        System.out.println(st3);

        Student st4 = (Student) ctx.getBean("st4");
        System.out.println(st4);

        College col = (College) ctx.getBean("col");
        System.out.println(col);

        Book book = (Book) ctx.getBean("book");
        System.out.println(book);

        ctx.close();
    }
}
