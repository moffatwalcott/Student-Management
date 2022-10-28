package com.example.demo.students;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudent() {
        return List.of(
                new Student(
                        1L,
                        "Moffat",
                        "moffatwaweru@gmail.com",
                        LocalDate.of(1998, Month.SEPTEMBER, 4),
                        24
                )
        );
    }
}
