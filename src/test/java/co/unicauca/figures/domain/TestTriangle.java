package co.unicauca.figures.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTriangle {

    @Test
    public void testPerimeter() {
        Triangle triangle = new Triangle(3, 4); // un triángulo 3-4-5
        double expResult = 3 + 4 + 5; // perímetro esperado = 12
        double result = triangle.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }

    @Test
    public void testArea() {
        Triangle triangle = new Triangle(6, 4);
        double expResult = (6 * 4) / 2; // área esperada = 12
        double result = triangle.calculateArea();
        assertEquals(expResult, result, 0.01);
    }
}
