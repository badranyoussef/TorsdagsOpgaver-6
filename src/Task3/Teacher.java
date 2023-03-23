package Task3;

import java.util.ArrayList;

public class Teacher extends Person{
    ArrayList<String> canTeach = new ArrayList<>();
    ArrayList<String>currentCourses = new ArrayList<>();

    Teacher(String name, ArrayList<String> list){
        super(name);
        this.canTeach = list;
    }


    @Override
    public boolean addCourse(String course) {
        if(canTeach.contains(course)){
            currentCourses.add(course);
            return true;
        }else {
            System.out.println(toString()+" kan ikke undervise i dette fag");
            return false;
        }
    }

    @Override
    public String toString(){
        return "Teacher "+getName();
    }


}
