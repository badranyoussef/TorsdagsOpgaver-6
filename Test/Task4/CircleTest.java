package Task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    /*@BeforeEach
    void setUp() {
        Circle c = new Circle(4);


    }*/

    @Test
    void getArea() {
        Circle c = new Circle(10);
        assertEquals(10,c.getArea());
    }
}