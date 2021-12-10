package Q1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

    private int id;
    public String name;
    public double gpa;
    public String dateOfBirth;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public Student(int id, String name, double gpa, String dateOfBirth){ //
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.dateOfBirth = dateOfBirth;
    }
}
