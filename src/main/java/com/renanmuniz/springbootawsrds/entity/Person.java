package com.renanmuniz.springbootawsrds.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer id;
    public String name;

    public LocalDateTime created_at;

    public Person() {
    }

    public Person(Integer id, String name, LocalDateTime created_at) {
        this.id = id;
        this.name = name;
        this.created_at = created_at;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Person{" +
                ", name='" + name + '\'' +
                ", created_at=" + created_at +
                '}';
    }
}
