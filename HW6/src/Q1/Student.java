package Q1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

    private int id;
    public String name;
    public double gpa;
    public Date dateOfBirth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }
}
