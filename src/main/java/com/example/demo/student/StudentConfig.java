package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student berke = new Student("Berke", "berke@mail.com", LocalDate.of(2000, Month.FEBRUARY, 5));
            Student alex = new Student("Alex", "alex@mail.com", LocalDate.of(2004, Month.JANUARY, 6));
            repository.saveAll(List.of(berke, alex));
        };
    }
}
