package com.example.demoHibernate.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID Id;
    private String FirstName;
    private String LastName;
    @OneToMany
    private List<Book> Books;
    @Temporal(TemporalType.DATE)
    private Date DateOfBirth;
}
