package Homework1.MedicalCenter;

public class Doctor {
    private String id;
    private String name;
    private String sourname;
    private String email;
    private  String phoneNumber;
    private String profession;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Doctor(String id, String name, String sourname, String email, String phoneNumber, String profession) {
        this.id = id;
        this.name = name;
        this.sourname = sourname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.profession = profession;
    }
}
