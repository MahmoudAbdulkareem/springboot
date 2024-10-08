package com.example.Mahmoud_Abdulkareem4TWIN5.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numSub;
    private LocalDate startDate;
    private LocalDate endDate;
    private float price;
    private TypeSubscription typeSub;


}
