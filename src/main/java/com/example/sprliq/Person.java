package com.example.sprliq;

import javax.persistence.*;

@Entity
@Table(name = "persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Column
    private String name;

    @Column
    private String height;

    public Person(){

    }
    public Person(String name, String height){
        this.name=name;
        this.height=height;
    }

}
