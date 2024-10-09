package com.workintech.developers;

public class HRManager extends Employee {
    // Junior, Mid ve Senior Developer'lar için arrayler
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    // Parametreli constructor metodu, id, name, salary ve array boyutlarını alır
    public HRManager(int id, String name, double salary, int juniorSize, int midSize, int seniorSize) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[juniorSize];
        this.midDevelopers = new MidDeveloper[midSize];
        this.seniorDevelopers = new SeniorDeveloper[seniorSize];
    }

    // Parametre almayan veya sadece id, name ve salary alan constructor metodu
    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[10]; // Varsayılan boyut
        this.midDevelopers = new MidDeveloper[10]; // Varsayılan boyut
        this.seniorDevelopers = new SeniorDeveloper[10]; // Varsayılan boyut
    }

    @Override
    public void work() {
        System.out.println("HRManager is managing employees.");
    }

    // Junior Developer ekleyen metod
    public void addEmployee(JuniorDeveloper junior) {
        boolean added = false;
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = junior;
                System.out.println(junior.getName() + " has been added to the Junior Developer team.");
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("No space available in the Junior Developer team for " + junior.getName());
        }
    }

    // Mid Developer ekleyen metod
    public void addEmployee(MidDeveloper mid) {
        boolean added = false;
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = mid;
                System.out.println(mid.getName() + " has been added to the Mid Developer team.");
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("No space available in the Mid Developer team for " + mid.getName());
        }
    }

    // Senior Developer ekleyen metod
    public void addEmployee(SeniorDeveloper senior) {
        boolean added = false;
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = senior;
                System.out.println(senior.getName() + " has been added to the Senior Developer team.");
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("No space available in the Senior Developer team for " + senior.getName());
        }
    }
}
