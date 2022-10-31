package com.example.demo.students;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Moffat = new Student(
             1L,
             "Moffat",
             "moffatwaweru@gmail.com",
             LocalDate.of(1998, SEPTEMBER, 4),
             24
            );

            Student Anthony = new Student(
                    "Anthony",
                    "Anthonymaina@gmail.com",
                    LocalDate.of(1970, MAY, 10),
                    52
            );

            Student Lydiah = new Student(
                    "Lydiah",
                    "lydiahmaina@gmail.com",
                    LocalDate.of(1972, DECEMBER, 6),
                    50
            );


            repository.saveAll(
                    List.of(Moffat, Anthony, Lydiah)
            );
        };
    }
}
