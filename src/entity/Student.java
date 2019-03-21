package entity;

import java.util.UUID;

public class Student extends Person{

    private String rollNumber;

    public Student() {
        super();
    }

    public Student( String name, String email, int age, String address, String phone, int status, String rollNumber) {
        super(name, email, age, address, phone, status);
        this.rollNumber = rollNumber;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber)
    {
        this.rollNumber = rollNumber;
    }

}
