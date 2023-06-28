import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();

        Parrot p = new Parrot();
    }
}
