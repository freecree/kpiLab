package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Scanner;

@Configuration
//@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = {"controllers", "commands", "services", "models", "views"})
public class SpringConfig {
    @Bean
    public Scanner scanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
}
