package Homework1.MedicalCenter;

public class PatientStorage {
    private Patient[] patients = new Patient[10];
    private int size;

    public  void add(Patient patient){
        if (size== patients.length){
            extend();
        }
        patients[size++]=patient;
    }

    private void extend() {
        Patient[] tmp = new Patient[patients.length+10];
        System.arraycopy(patients,0,tmp,0,patients.length);
        patients = tmp;
    }
    public  void printbydoctor(String doctor){
        for (int i = 0; i <size ; i++) {
            if (patients[i].getDoctor().contains(doctor)){
                System.out.println(patients[i].getId()+" "+patients[i].getName()+" "+patients[i].getSourname()+" "+
                        patients[i].getPhone()+" "+patients[i].getDoctor()+" "+patients[i].getRegisterdatetime());
            }

        }
    }
    public  void print(){
        for (int i = 0; i <size ; i++) {
            System.out.println(patients[i].getId()+" "+patients[i].getName()+" "+patients[i].getSourname()+" "+
                    patients[i].getPhone()+" "+patients[i].getDoctor()+" "+patients[i].getRegisterdatetime());

        }

    }
}
