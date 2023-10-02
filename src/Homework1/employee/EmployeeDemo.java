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
                    System.out.println("employee creatid");
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("please input keyword");
                    String keyword = scanner.nextLine();
                    employeeStorage.search(keyword);
                    break;
                case "4":
                    System.out.println("please input keyword");
                    keyword= scanner.nextLine();
                    employeeStorage.search(keyword);

                    break;
                default:
                    System.out.println("unknown command try again");


            }

        }
    }
}
