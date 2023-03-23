package Task4;

public class Square implements Shape{
    double area;
    double length;
    Square(double input){
        this.length = input;
    }

    @Override
    public double getArea() {
        area = 3.14*(length*length);
        return area;
    }
}
