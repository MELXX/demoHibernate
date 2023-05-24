package com.example.demoHibernate.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID Id;
    @Column(nullable = false)
    private String Name;
    @OneToMany
    private List<Book> Books;

    public Publisher(){}
    public Publisher(String name){
        Name=name;
    }
}
