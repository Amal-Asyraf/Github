package com.example.a17010596.exercisep08;

public class Employee {
    private String name;
    private String title;
    private double wage;

    public Employee(String name, String title, double wage) {
        this.name = name;
        this.title = title;
        this.wage=wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public double getwage(){
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "MovieItem{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

