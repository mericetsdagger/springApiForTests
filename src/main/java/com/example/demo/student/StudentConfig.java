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
            Student mariam = new Student(
                    "Testowy",
                    "adres.email@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    21

            );

            Student alex = new Student(
                    "Testowy2",
                    "adres.email2@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    21

            );

            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}
