package tests;

import config.ProjectConfig;
import main.Parrot;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { ProjectConfig.class })
public class AppTests {

    @Autowired
    private ApplicationContext context;

    @Test
    @DisplayName("Test that Parrot instance named parrot1 has the name Koko.")
    public void testParrotKokoHasTheNameKoko() {
        Parrot p = context.getBean("koko", Parrot.class);

        assertEquals("Koko", p.getName());
    }

    @Test
    @DisplayName("Test that Parrot instance named miki has the name Miki.")
    public void testParrotMikiHasTheNameMiki() {
        Parrot p = context.getBean("miki", Parrot.class);

        assertEquals("Miki", p.getName());
    }

    @Test
    @DisplayName("Test that Parrot instance named parrot3 has the name Riki.")
    public void testParrotRikiHasTheNameRiki() {
        Parrot p = context.getBean("riki", Parrot.class);

        assertEquals("Riki", p.getName());
    }
}
