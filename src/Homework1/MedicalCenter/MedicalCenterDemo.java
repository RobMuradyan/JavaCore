package Homework1.MedicalCenter;

import java.util.Date;
import java.util.Scanner;

public class MedicalCenterDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Storage storage = new Storage();
        boolean isrun = true;
        while (isrun){
            String command = getString(scanner);
            switch (command){
                case "0":
                    isrun = false;
                    break;
                case "1":
                    extracted(scanner, storage);
                    break;
                case "2":
                    extracted1(scanner, storage);
                    break;
                case"3":
                    System.out.println("please input id for remove");
                    String ID =scanner.nextLine();
                    storage.DeleteByID(ID);
                    break;
                case "4":
                    extracted2(scanner, storage);
                    break;
                case "5":
                    extracted3(scanner, storage);
                    break;

                case"6":
                    extracted4(scanner, storage);
                    break;
                case "7":
                    storage.print();
                    break;
                default:
                    System.out.println("invalid action");
                    break;

            }
        }
    }

    private static void extracted4(Scanner scanner, Storage storage) {
        System.out.println("please input doctor");
        String Doctor= scanner.nextLine();
        storage.printbydoctor(Doctor);
    }

    private static void extracted3(Scanner scanner, Storage storage) {
        System.out.println("please input patient id");
        String iD = scanner.nextLine();
        System.out.println("please input patient name");
        String Name = scanner.nextLine();
        System.out.println("please input patient sourname ");
        String Sourname = scanner.nextLine();
        System.out.println("please input patient phone ");
        String phone = scanner.nextLine();
        System.out.println("please input patient doctorname");
        String doctorname= scanner.nextLine();
        System.out.println("please input registered time");
        String registerdatetime = scanner.nextLine();
        Patient patient = new Patient(iD,Name,Sourname,phone,doctorname, registerdatetime);
        storage.addp(patient);
        System.out.println( "patient is creatid");
    }

    private static void extracted2(Scanner scanner, Storage storage) {
        System.out.println("please input id");
        String Id = scanner.nextLine();
        storage.ChangedoctorByid(Id);
    }

    private static void extracted1(Scanner scanner, Storage storage) {
        System.out.println("please input profession");
        String keyword = scanner.nextLine();
        storage.searchprofession(keyword);
    }

    private static void extracted(Scanner scanner, Storage storage) {
        System.out.println("please input doctor id");
        String id = scanner.nextLine();
        System.out.println("please input doctor name");
        String name = scanner.nextLine();
        System.out.println("please input doctor sourname");
        String sourname = scanner.nextLine();
        System.out.println("please input doctor email");
        String email = scanner.nextLine();
        System.out.println("please input doctor phonenumber ");
        String phonenumber = scanner.nextLine();
        System.out.println("please inout doctor profession");
        String profession= scanner.nextLine();
        Doctor doctor = new Doctor(id,name,sourname,email,phonenumber,profession);
        storage.add(doctor);
        System.out.println("doctor created");
    }

    private static String getString(Scanner scanner) {
        System.out.println("please input 0 for exit");
        System.out.println("please input 1 for add doctor");
        System.out.println("plese input 2 for search doctor by profession");
        System.out.println("please input 3 for delete doctor by id");
        System.out.println("please input 4 for change doctor by id");
        System.out.println("please input 5 for add patient");
        System.out.println("please input 6 for print all patients by doctor");
        System.out.println("please input 7 for print all patients");
        String command = scanner.nextLine();
        return command;
    }

}
