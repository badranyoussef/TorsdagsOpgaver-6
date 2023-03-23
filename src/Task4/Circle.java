package Task4;

public class Circle implements Shape {

    double area;
    double radius;
    Circle(double input){
        this.radius = input;
    }

    @Override
    public double getArea() {
        area = 3.14*(radius*radius);
        return area;
    }
}
