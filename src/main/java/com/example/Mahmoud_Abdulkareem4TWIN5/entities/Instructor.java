package com.example.Mahmoud_Abdulkareem4TWIN5.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numInstructor;

    private String firstName;
    private String lastName;
    LocalDate dateOfHire;

@OneToMany
    Set<Course> courses;
}
