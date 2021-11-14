package com.example.springbootproject.Data.Models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )

    private Long id;
    private String name;
    private String email;
    private LocalDate dob;

    @Transient
    private Integer age;

    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public Student(String name, String email, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.dob = dob;
    }
}