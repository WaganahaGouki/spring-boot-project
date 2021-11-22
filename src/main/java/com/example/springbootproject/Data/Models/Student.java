package com.example.springbootproject.Data.Models;

import lombok.*;

import javax.persistence.*;

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

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }
}