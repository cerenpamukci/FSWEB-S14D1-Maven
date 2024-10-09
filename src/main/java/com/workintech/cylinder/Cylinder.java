package com.workintech.cylinder;

public class Cylinder extends Circle {
    // Sınıf değişkeni (height)
    private double height;

    // Constructor metodu, radius ve height değerleri alır
    public Cylinder(double radius, double height) {
        // Circle sınıfının constructor'ını çağırır
        super(radius);

        // height 0'dan küçükse 0 olarak ayarla
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // getHeight metodu
    public double getHeight() {
        return this.height;
    }

    // getVolume metodu, hacmi hesaplar
    public double getVolume() {
        return this.getArea() * this.height;
    }
}
