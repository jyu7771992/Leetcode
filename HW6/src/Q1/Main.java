package Q1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Student Mark = new Student("Mark Bruce", 3.5);
        Student Ashish = new Student("Ashish Ashish", 4.0);
        Student John = new Student("John Mercer", 4.0);
        Student Peter = new Student("Peter Gambling", 4.0);
        Student Tom = new Student("Tom Secrecy", 2.5);
        Student Sara = new Student("Sara Smith", 3.0);
        Student Beth = new Student("Beth Clinton", 4.0);
        ArrayList<Student> students = new ArrayList<>();
        students.add(Mark);
        students.add(Ashish);
        students.add(John);
        students.add(Peter);
        students.add(Tom);
        students.add(Sara);
        students.add(Beth);

        for(Student student : students){
            System.out.println(student.name + ", age: " + student.gpa);
        }
        //Sort by ascending order of 'name'
        System.out.println("Sort by ascending order of 'name'");
        String upperCased = doStringStuff(new StringFunction() {
            @Override
            public String ConvertUppercaseAndConcatenate(String str1, String str2) {
                return str1.toUpperCase() + " " + str2.toUpperCase();
            }
        }, "Ashish", "Singh");

        StringFunction sf = (str1, str2) -> str1.toUpperCase() + " " + str2.toUpperCase();
        upperCased = doStringStuff(sf, "Ashish", "Singh");

        System.out.println(upperCased);

        //Sort by descending order of 'gpa'
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                Double gpa1 = s1.getGpa();
                Double gpa2 = s2.getGpa();
                if(gpa1 == gpa2){
                    return 0;
                } else if (gpa1 < gpa2){
                    return 1;
                } else{
                    return -1;
                }
            }
        });
        System.out.println("Sort by descending order of 'gpa'");
        System.out.println(students);

    }
    public static  String doStringStuff(StringFunction sf, String str1, String str2 ){
        return sf.ConvertUppercaseAndConcatenate(str1, str2);
    }
}
