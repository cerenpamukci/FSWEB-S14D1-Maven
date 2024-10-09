package com.workintech.cylinder;

public class Circle {
    // Sınıf değişkeni (radius)
    private double radius;

    // Constructor metodu
    public Circle(double radius) {
        // radius 0'dan küçükse 0 olarak ayarla
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    // getRadius metodu
    public double getRadius() {
        return this.radius;
    }

    // getArea metodu
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}

