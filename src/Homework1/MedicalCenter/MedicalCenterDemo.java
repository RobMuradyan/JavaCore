package Homework1.MedicalCenter;

import java.util.Date;
import java.util.Scanner;

public class MedicalCenterDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoctorStorage doctorStorage = new DoctorStorage();
        PatientStorage patientStorage = new PatientStorage();
        boolean isrun = true;
        while (isrun){
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 for add doctor");
            System.out.println("plese input 2 for search doctor by profession");
            System.out.println("please input 3 for delete doctor by id");
            System.out.println("please input 4 for change doctor by id");
            System.out.println("please input 5 for add patient");
            System.out.println("please input 6 for print all patients by doctor");
            System.out.println("please input 7 for print all patients");
            String command = scanner.nextLine();
            switch (command){
                case "0":
                    isrun = false;
                    break;
                case "1":
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
                    doctorStorage.add(doctor);
                    System.out.println("doctor created");
                    break;
                case "2":
                    System.out.println("please input profession");
                            String keyword = scanner.nextLine();
                            doctorStorage.searchprofession(keyword);
                            break;
                case"3":
                    System.out.println("please input id for remove");
                    String ID =scanner.nextLine();
                    doctorStorage.DeleteByID(ID);
                    break;
                case "4":
                    System.out.println("please input id");
                    String Id = scanner.nextLine();
                    doctorStorage.ChangedoctorByid(Id);
                    break;
                case "5":
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
                    patientStorage.add(patient);
                    System.out.println( "patient is creatid");
                    break;

                case"6":
                    System.out.println("please input doctor");
                    String Doctor= scanner.nextLine();
                    patientStorage.printbydoctor(Doctor);
                    break;
                case "7":
                    patientStorage.print();
                    break;
                default:
                    System.out.println("invalid action");
                    break;

            }
        }
    }

}
