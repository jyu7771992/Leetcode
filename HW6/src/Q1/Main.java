package Q1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Build Data in Student List
        Student Jhope = new Student(1,"Jhope", 3.5, "02/18/1994");
        Student JungKook = new Student(2, "JungKook", 4.0, "09/01/1997");
        Student RM = new Student(3,"RM", 4.0, "09/12/1994");
        Student Jin = new Student(4,"Jin", 4.0, "12/04/1992");
        Student TaeTae = new Student(5,"TaeTae", 2.5, "12/30/1995");
        Student Yoongi = new Student(6,"Yoongi", 3.0, "03/09/1993");
        Student Jimin = new Student(7,"Jimin", 4.0, "10/13/1995");
        ArrayList<Student> students = new ArrayList<>();
        students.add(Jhope);
        students.add(JungKook);
        students.add(RM);
        students.add(Jin);
        students.add(TaeTae);
        students.add(Yoongi);
        students.add(Jimin);

        //Original Sort
        System.out.println("<-----------Before sort: Original List ------------->");
        for(Student student : students){
            System.out.println( student.getId() + " | " + student.getName()+ " | " + student.getGpa() +" | " + student.getDateOfBirth());
        }
        System.out.println("<-----------1. Sort by ascending order of 'name'----------->");

        //Sort by ascending order of 'name'
        NameComparator(students);
        for(Student student : students){
            System.out.println( student.getId() + " | " + student.getName()+ " | " + student.getGpa() +" | " + student.getDateOfBirth());
        }

        //Sort by descending order of 'gpa'
        System.out.println("<-----------2. Sort by descending order of 'gpa'----------->");
        GpaComparator(students);
        for(Student student : students){
            System.out.println( student.getId() + " | " + student.getName()+ " | " + student.getGpa() +" | " + student.getDateOfBirth());
        }

        //Sort by ascending order of 'dateOfBirth'
        System.out.println("<-----------3. Sort by ascending order of 'dateOfBirth'----------->");
        DateOfBirthComparator(students);
        for(Student student : students){
            System.out.println( student.getId() + " | " + student.getName()+ " | " + student.getGpa() +" | " + student.getDateOfBirth());
        }
    }
    private static void NameComparator(ArrayList<Student> students){
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
    }
    private static void GpaComparator(ArrayList<Student> students){
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                Double gpa1 = s1.getGpa();
                Double gpa2 = s2.getGpa();
                if(gpa1 == gpa2){
                    return s1.name.compareTo(s2.name);
                } else if (gpa1 < gpa2){
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }
    private static void DateOfBirthComparator(ArrayList<Student> students){
        Collections.sort(students, new Comparator<Student>() {
            DateFormat dateFormat = new SimpleDateFormat("MM/DD/YYYY");
            @Override
            public int compare(Student s1, Student s2) {
                String date1 = s1.getDateOfBirth();
                String date2 = s2.getDateOfBirth();
                try{
                    return dateFormat.parse(String.valueOf(date1)).compareTo(dateFormat.parse(String.valueOf(date2)));
                } catch (ParseException e){
                    throw new IllegalArgumentException(e);
                }
            }
        });
    }
}
