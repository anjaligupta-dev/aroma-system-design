package class_05.goodDesignSRP;

import java.util.Date;

//this is a class following SRP because it just contains the employee information
public class Employee {
    private int id;
    private String name;
    private Date doj;

    public Employee(int id, String name, Date doj) {
        this.id = id;
        this.name = name;
        this.doj = doj;
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
