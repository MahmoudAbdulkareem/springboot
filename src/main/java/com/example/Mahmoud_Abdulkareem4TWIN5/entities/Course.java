package com.example.Mahmoud_Abdulkareem4TWIN5.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numCourse;

    private int level;

    @Enumerated(EnumType.STRING)
    private TypeCourse typeCourse;

    @Enumerated(EnumType.STRING)
    private Support support;

@OneToMany(mappedBy = "course")
Set<Registration> registrations;
}
