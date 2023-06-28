package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = new Parrot();
        p.setName("Kiki");

        Supplier<Parrot> parrotSupplier = () -> p;

        context.registerBean("parrot", Parrot.class, parrotSupplier);

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.getName());
    }
}
