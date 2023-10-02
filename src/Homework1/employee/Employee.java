package Homework1.employee;

import java.sql.Driver;

public class Employee {
    private String Name;
    private String Surname;
    private String employeeid;
    private double salary;
    private String company;
    private String position;

    public Employee(String name, String sourname, String employeeid, double salary, String company, String position) {
        Name = name;
        Surname = sourname;
        this.employeeid = employeeid;
        this.salary = salary;
        this.company = company;
        this.position = position;
    }

    public Employee() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSourname() {
        return Surname;
    }

    public void setSourname(String sourname) {
        Surname = sourname;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
