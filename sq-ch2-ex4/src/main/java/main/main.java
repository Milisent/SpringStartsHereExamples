package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p1 = context.getBean("koko", Parrot.class);
        System.out.println(p1.getName());
        Parrot p2 = context.getBean("miki", Parrot.class);
        System.out.println(p2.getName());
        Parrot p3 = context.getBean("riki", Parrot.class);
        System.out.println(p3.getName());
    }
}
