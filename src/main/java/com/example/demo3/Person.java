package com.example.demo3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.security.PrivateKey;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Person{
    @Id
    @GeneratedValue
    private int id;

    private String name;

    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Person()
    {
        //this.name = "hah";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
}