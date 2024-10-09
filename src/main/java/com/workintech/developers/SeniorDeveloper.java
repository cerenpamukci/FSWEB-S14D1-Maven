package com.workintech.developers;

public class SeniorDeveloper extends Employee {

    // Constructor metodu
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is designing architecture and mentoring the team.");
        setSalary(getSalary() + 2000); // Senior geliştirici maaşı artırımı
    }
}
