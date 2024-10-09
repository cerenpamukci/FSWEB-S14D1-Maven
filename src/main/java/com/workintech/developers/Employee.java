package com.workintech.developers;

public class Employee {
    // Sınıf değişkenleri
    private int id;
    private String name;
    private double salary;

    // Constructor metodu
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter ve Setter metodları
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // work metodu
    public void work() {
        System.out.println("Employee starts working.");
    }
}
