package Homework1.employee;

import classwork.library.Book;

import java.lang.reflect.Array;
import java.util.Scanner;

public class EmployeeStorage {
    private Scanner scanner=new Scanner(System.in);
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
    public void DeleteByID(String id){
        for (int i = 0; i <size ; i++) {
            if (employees[i].getEmployeeid().equals(id)){
                for (int j = 0; j <size ; j++) {
                    employees[j]=employees[j+1];


                }size--;
                break;
            }

        }

    }public void ChangeemployeeByid(String id){
        for (int i = 0; i <size ; i++) {
            if (employees[i].getEmployeeid().equals(id)){
                System.out.println("please input your new name");
                String name=scanner.nextLine();
                employees[i].setName(name);
                System.out.println("please input your new sourname");
                String sourname = scanner.nextLine();
                employees[i].setSourname(sourname);
                System.out.println("please input your new salary");
                int salary = Integer.parseInt(scanner.nextLine());
                employees[i].setSalary(salary);
                System.out.println("please input your new company");
                String company=scanner.nextLine();
                employees[i].setCompany(company);
                System.out.println("please input your new position ");
                String position=scanner.nextLine();
                employees[i].setPosition(position);


            }

        }
    }





}
