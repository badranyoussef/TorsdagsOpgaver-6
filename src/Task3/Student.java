package Task3;

import java.util.ArrayList;

public class Student extends Person{
ArrayList<String>passedCourses = new ArrayList<>();
ArrayList<String> currentCourses = new ArrayList<>();

    Student(String name, ArrayList<String> list){
           super(name);
           this.passedCourses = list;
    }
    @Override
    public boolean addCourse(String course) {
        if(!passedCourses.contains(course)){
            currentCourses.add(course);
            return true;
        }else {
            System.out.println(toString()+" har allerede bestået dette kursus.");

            return false;
        }
    }

    @Override
    public String toString(){
        return "Student "+getName();
    }
}
