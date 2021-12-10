package Q1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Student Mark = new Student("Mark", 3.5);
        Student Ashish = new Student("Ashish", 4.0);
        Student John = new Student("John", 4.0);
        Student Peter = new Student("Peter", 4.0);
        Student Tom = new Student("Tom", 2.5);
        Student Sara = new Student("Sara", 3.0);
        Student Beth = new Student("Beth", 4.0);
        ArrayList<Student> students = new ArrayList<>();
        students.add(Mark);
        students.add(Ashish);
        students.add(John);
        students.add(Peter);
        students.add(Tom);
        students.add(Sara);
        students.add(Beth);
        System.out.println("Before sort-------------");
        //Sort by ascending order of 'name'
        for(Student student : students){
            System.out.println( student.getName()+ "," + student.getGpa());
        }
        System.out.println("1. Sort by ascending order of 'name'-----------");
//
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
        for(Student student : students){
            System.out.println( student.getName()+ "," + student.getGpa());
        }
        //Sort by descending order of 'gpa'
        System.out.println("2. Sort by descending order of 'gpa'-----------");
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

        for(Student student : students){
            System.out.println( student.getName()+ "," + student.getGpa());
        }
        System.out.println("3. Sort by ascending order of 'dateOfBirth'-----------");

    }
}
