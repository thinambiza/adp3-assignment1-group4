package ac.za.cput;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AutoConfiguration
public class FootballManagementSystem {
    public static void main(String[] args) {
        SpringApplication.run(FootballManagementSystem.class, args);
    }
}
