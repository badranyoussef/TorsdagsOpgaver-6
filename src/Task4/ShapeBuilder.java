package Task4;

import java.util.ArrayList;

public class ShapeBuilder{
    ArrayList<Shape> arrOfShapes = new ArrayList<>();


    public void addShapes (Shape s){
        arrOfShapes.add(s);
    }

    public double getTotalArea(){
        double sum = 0;

        for(Shape s: arrOfShapes){
         sum += s.getArea();
        }
        return sum;
    }

}
