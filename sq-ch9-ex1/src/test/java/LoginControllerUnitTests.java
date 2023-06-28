import com.example.controllers.LoginController;
import com.example.models.LoginProcessor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class LoginControllerUnitTests {
    @Mock
    private Model model;
    @InjectMocks
    private LoginController loginController;

    @Test
    public void loginPostLoginSucceedsTest() {
        String result = loginController.loginPost("natalie", "password", model);
        assertEquals("login.html", result);
        verify(model).addAttribute("message", "You are now logged in.");
    }

    @Test
    public void loginPostLoginFailsTest() {
        String result =
                loginController.loginPost("username", "password", model);
        assertEquals("login.html", result);
        verify(model)
                .addAttribute("message", "Login failed!");
    }
}
