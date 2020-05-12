package ro.uaicinfo.lab11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"ro.uaicinfo.lab11"})
public class Lab11Application {
    public static void main(String[] args) {
        SpringApplication.run(Lab11Application.class, args);
    }
}
