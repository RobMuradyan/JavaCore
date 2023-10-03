package Homework1.employee;

import classwork.library.Book;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size;
    public  void add(Employee employee){
        if (size== employees.length){
            extend();
        }
employees[size++]=employee;
    }

    private void extend() {
        Employee[] tmp = new Employee[employees.length+10];
        System.arraycopy(employees,0,tmp,0,employees.length);
        employees=tmp;
    }
    public void print(){
        for (int i = 0; i <size ; i++) {
            System.out.println(employees[i].getName()+" "+employees[i].getSourname()+" "
                    +employees[i].getEmployeeid()+" "+employees[i].getSalary()+" "
                    +employees[i].getCompany()+" "+employees[i].getPosition());

        }
    }
    public void searchid(String id){
        for (int i = 0; i <size ; i++) {
            if (employees[i].getEmployeeid().contains(id)){
                System.out.println(employees[i].getName()+" "+employees[i].getSourname()+" "
                        +employees[i].getEmployeeid()+" "+employees[i].getSalary()+" "
                        +employees[i].getCompany()+" "+employees[i].getPosition());
            }

        }
    }
    public  void  searchcompany(String company){
        for (int i = 0; i <size ; i++) {
            if (employees[i].getCompany().contains(company)){
                System.out.println(employees[i].getName()+" "+employees[i].getSourname()+" "
                        +employees[i].getEmployeeid()+" "+employees[i].getSalary()+" "
                        +employees[i].getCompany()+" "+employees[i].getPosition());

            }
        }
    }





}
