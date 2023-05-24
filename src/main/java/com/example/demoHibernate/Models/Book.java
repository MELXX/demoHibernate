package com.example.demoHibernate.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.UUID;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID Id;
    @Column(nullable = false)
    private String Title;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date YearPublished;
    @Column(nullable = false)
    private String ISBN;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Genre Genre;
    @ManyToOne
    @Column(nullable = false)
    private Author Author;
    @ManyToOne
    private Publisher Publisher;
}
