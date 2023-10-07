package Homework1.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        boolean isrun = true;
        while (isrun){
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 for add employee");
            System.out.println("please input 2 for print all employee");
            System.out.println("please input 3 for search employee by employee id");
            System.out.println("please input 4 for search employe by company name");
            System.out.println("please input 5 for removing");
            System.out.println("please input 6 for change employee");
            String command = scanner.nextLine();
            switch (command){
                case "0":
                    isrun=false;
                    break;
                case "1":
                    System.out.println("please input employee Name");
                    String Name = scanner.nextLine();
                    System.out.println("please input employee Surname ");
                    String Surname = scanner.nextLine();
                    System.out.println("please input employee employeeid");
                    String Employeesid = scanner.nextLine();
                    System.out.println("please input employee salary");
                    double Salary = Double.parseDouble( scanner.nextLine());
                    System.out.println("please input employee company");
                    String Company = scanner.nextLine();
                    System.out.println("please input employee position");
                    String Position = scanner.nextLine();
                    Employee employee = new Employee(Name,Surname,Employeesid,Salary,Company,Position);
                    employeeStorage.add(employee);
                    System.out.println("employee created");
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("please input id");
                    String id = scanner.nextLine();
                    employeeStorage.searchid(id);
                    break;
                case "4":
                    System.out.println("please input company");
                    String company= scanner.nextLine();
                    employeeStorage.searchcompany(company);

                    break;
                case "5":
                    System.out.println("please input id for remove");
                    String ID =scanner.nextLine();
                    employeeStorage.DeleteByID(ID);

                    break;
                case "6":
                    System.out.println("please input id for change");
                    String Changeemployeeid=scanner.nextLine();
                    employeeStorage.ChangeemployeeByid(Changeemployeeid);
                    System.out.println("employee is updated");
break;
                default:
                    System.out.println("unknown command try again");


            }

        }
    }
}
