package Homework1.MedicalCenter;

public class Patient {
    private String id;
    private String name;
    private String sourname;
    private String phone;
    private String doctor;
    private String registerdatetime;

    public Patient(String id, String name, String sourname, String phone, String doctor, String registerdatetime) {
        this.id = id;
        this.name = name;
        this.sourname = sourname;
        this.phone = phone;
        this.doctor = doctor;
        this.registerdatetime = registerdatetime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSourname() {
        return sourname;
    }

    public void setSourname(String sourname) {
        this.sourname = sourname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getRegisterdatetime() {
        return registerdatetime;
    }

    public void setRegisterdatetime(String registerdatetime) {
        this.registerdatetime = registerdatetime;
    }
}
