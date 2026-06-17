abstract class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Encapsulation
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    // Abstraction
    public abstract double calculateBonus();

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Inheritance
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(int id, String name, double salary, String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Polymorphism
    @Override
    public double calculateBonus() {
        return getSalary() * 0.20;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer");
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("----------------------");
    }
}

class Tester extends Employee {
    private String testingTool;

    public Tester(int id, String name, double salary, String testingTool) {
        super(id, name, salary);
        this.testingTool = testingTool;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.15;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Tester");
        System.out.println("Testing Tool: " + testingTool);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("----------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Developer(101, "Rakshith Reddy", 50000, "Java");
        Employee emp2 = new Tester(102, "Praveen", 45000, "Selenium");

        emp1.displayDetails();
        emp2.displayDetails();
    }
}