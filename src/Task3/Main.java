package Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main (String[]args){
        ArrayList<Person>persons = new ArrayList<>();
        ArrayList<String> courses = new ArrayList<>();
        ArrayList<String> courses2 = new ArrayList<>();

        courses.add("Java 1.0");
        courses.add("Danish");

        courses2.add("Math");



        Teacher t1 = new Teacher("Tess", courses);
        Teacher t2 = new Teacher("Signe", courses);
        Teacher t3 = new Teacher("Tom", courses2);
        Teacher t4 = new Teacher("Claus", courses);

        Student s1 = new Student("Egon", courses);
        Student s2 = new Student("Benny", courses);
        Student s3 = new Student("Kjeld", courses2);
        Student s4 = new Student("Sara", courses2);
        Student s5 = new Student("Susanne", courses);

        persons.add(t1);
        persons.add(t2);
        persons.add(t3);
        persons.add(t4);

        persons.add(s1);
        persons.add(s2);
        persons.add(s3);
        persons.add(s4);


        for(Person p: persons) {
            p.addCourse("Java 1.0");
        }
    }

}
