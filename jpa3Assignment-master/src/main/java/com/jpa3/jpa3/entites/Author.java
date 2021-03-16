package com.jpa3.jpa3.entites;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "author") // one to many Ques7
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    //Ques2
    @Embedded
    private Address address;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL) //Ques4
    private List<Subject> subjects;//Ques3


    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> books;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
