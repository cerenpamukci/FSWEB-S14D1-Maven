package com.workintech.developers;

public class MidDeveloper extends Employee {

    // Constructor metodu
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is developing intermediate-level code and helping juniors.");
        setSalary(getSalary() + 1000); // Mid geliştirici maaşı artırımı
    }
}
