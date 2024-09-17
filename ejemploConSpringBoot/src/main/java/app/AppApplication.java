package app;

import app.controller.ControllerInterface;
import app.controller.LoginController;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Getter
@Setter
@NoArgsConstructor
@SpringBootApplication
public class AppApplication implements CommandLineRunner {
    @Autowired
    LoginController controller;

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        try {
            controller.session();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
