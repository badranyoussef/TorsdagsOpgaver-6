package Task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ShapeBuilderTest {

    ShapeBuilder sb;
    Square s;
    @BeforeEach
    void setUp() {
        sb = new ShapeBuilder();

        Circle c = new Circle(10);
        s = new Square(10);

        //s får index 0
        sb.addShapes(s);
        //c får index 0
        sb.addShapes(c);

    }

    @Test
    void addShapes (){
        //her sammenlignes s med det der ligger på index 0
        assertEquals(s,sb.arrOfShapes.get(0));
    }

    @Test
    void getTotalAreaTest() {
        assertEquals(31.4 + 100, sb.getTotalArea());
    }
}