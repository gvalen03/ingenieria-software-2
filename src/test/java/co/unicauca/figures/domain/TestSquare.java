package co.unicauca.figures.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSquare {
    
    @Test
    public void testPerimeter() {
        Square square = new Square(2);
        double expResult = 8;
        double result = square.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testArea() {
        Square square = new Square(3);
        double expResult = 9;
        double result = square.calculateArea();
        assertEquals(expResult, result, 0.01);
    }
}
