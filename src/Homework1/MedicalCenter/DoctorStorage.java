package Homework1.MedicalCenter;


import java.util.Scanner;

public class DoctorStorage {
    private Doctor[] doctors = new Doctor[10];
    Scanner scanner=new Scanner(System.in);
    private int size;

    public  void add(Doctor doctor){
        if (size== doctors.length){
            extend();
        }
        doctors[size++]=doctor;
    }

    private void extend() {
        Doctor[] tmp = new Doctor[doctors.length+10];
        System.arraycopy(doctors,0,tmp,0,doctors.length);
        doctors = tmp;
    }
    public void searchprofession(String profession){
        for (int i = 0; i <size ; i++) {
            if (doctors[i].getProfession().contains(profession)) {
                System.out.println(doctors[i].getId()+" "+doctors[i].getName()+" "+
                        doctors[i].getSourname()+" "+doctors[i].getEmail()+" "+doctors[i].getPhoneNumber()+" "+doctors[i].getProfession());
            }

        }
    }
    public void DeleteByID(String id){
        for (int i = 0; i <size ; i++) {
            if (doctors[i].getId().equals(id)){
                for (int j = 0; j <size ; j++) {
                    doctors[j]=doctors[j+1];


                }size--;
                break;
            }

        }}
    public void ChangedoctorByid(String id){
        for (int i = 0; i <size ; i++) {
            if (doctors[i].getId().equals(id)){
                System.out.println("please input your new name");
                String name=scanner.nextLine();
                doctors[i].setName(name);
                System.out.println("please input your new sourname");
                String sourname = scanner.nextLine();
                doctors[i].setSourname(sourname);
                System.out.println("please input your new email");
                String email=scanner.nextLine();
                doctors[i].setEmail(email);
                System.out.println("please input your new phonenumber");
                String phonenumber=scanner.nextLine();
                doctors[i].setPhoneNumber(phonenumber);
                System.out.println("please input your new profession ");
                String profession=scanner.nextLine();
                doctors[i].setProfession(profession);


            }

        }

}}
