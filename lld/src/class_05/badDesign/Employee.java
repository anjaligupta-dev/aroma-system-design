package class_05.badDesign;

import java.util.Date;

public class Employee {
    private int id;
    private String name;
    private Date doj;

    public Employee(int id, String name, Date doj) {
        this.id = id;
        this.name = name;
        this.doj = doj;
    }

    //Decided by company board of directors
    public void calculateSalary() {
        System.out.println("Logic for calculating salary.");
    }

    //Decided by HR team
    public void hireEmployee() {
        System.out.println("Logic for hiring employee.");
    }

    //Decided by Managers and evaluation team
    public void evaluateEmployee() {
        System.out.println("Logic for evaluating team.");
    }

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

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date id) {
        this.doj = doj;
    }
}
