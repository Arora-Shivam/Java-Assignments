package Java.Assignments.Day15.Problem1;

import java.io.Serializable;

public class Student implements Serializable {
    private int roll;
    private String name;
    private String email;
    private transient String password;
    private Address address;

    public Student(int r,String n,String em,String pass,Address ad){
        this.roll=r;
        this.name=n;
        this.email=em;
        this.password=pass;
        this.address=ad;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address=" + address +
                '}';
    }

    public void setRoll(int roll){
        this.roll=roll;
    }
    public int getRoll(){
        return roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
