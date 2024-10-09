package com.workintech.developers;

public class JuniorDeveloper extends Employee {

    // Constructor metodu
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is learning and developing basic code.");
        setSalary(getSalary() + 500); // Junior geliştirici maaşı artırımı
    }
}
