package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.AUGUST;
import static java.time.Month.OCTOBER;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student Jayson = new Student(
                    "Jayson",
                    "absd@gmail.com",
                    LocalDate.of(1999, AUGUST, 16),
                    21);
            Student Jacob = new Student(
                    "Jacob",
                    "Jacob@gmail.com",
                    LocalDate.of(1997, OCTOBER, 21),
                    26);
            repository.saveAll(
                    List.of(Jayson,Jacob)
            );

        };

    }
}
