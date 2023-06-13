package com.cmpt276.studenttracking.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;
    public double weight;
    private String name;
    private double height;
    private String hairColour;
    private double gpa;
    private String favouriteColour;
    public Student(double weight, String name, double height, String hairColour, double gpa, String favouriteColour) {
        this.weight = weight;
        this.name = name;
        this.height = height;
        this.hairColour = hairColour;
        this.gpa = gpa;
        this.favouriteColour = favouriteColour;
    }
    public Student(){
        
    }
    public String getFavouriteColour() {
        return favouriteColour;
    }
    public void setFavouriteColour(String favouriteColour) {
        this.favouriteColour = favouriteColour;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public String getHairColour() {
        return hairColour;
    }
    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
}
