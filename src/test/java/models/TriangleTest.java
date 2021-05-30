package models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    @DisplayName("Test for calculating of square of Triangle")
    void square() {
        //Triangle triangle = new Triangle(2, 3, 4);
        Triangle triangle = new Triangle(0,0,0);
        triangle.setSide1(2);
        triangle.setSide2(3);
        triangle.setSide3(4);

        triangle.square();
        assertEquals(2.9047, triangle.getSquare(), 0.001);
        Triangle triangle1 = new Triangle( 1, 2, 3);
        triangle.square();
        assertNotEquals(3.0, triangle.getSquare());
    }

    @Test
    @DisplayName("Test of getting Triangle's sides")
    void sidesGetters() {
        Triangle triangle = new Triangle(2, 3, 4);
        assertEquals(2, triangle.getSide1());
        assertEquals(3, triangle.getSide2());
        assertEquals(4, triangle.getSide3());

        assertNotEquals(0, triangle.getSide1());
        assertNotEquals(0, triangle.getSide2());
        assertNotEquals(0, triangle.getSide3());
    }

    @Test
    @DisplayName("Test of setting Triangle's sides")
    void sidesSetters() {
        Triangle triangle = new Triangle(2, 3, 4);
        triangle.setSide1(20);
        triangle.setSide2(30);
        triangle.setSide3(40);
        assertEquals(20, triangle.getSide1());
        assertEquals(30, triangle.getSide2());
        assertEquals(40, triangle.getSide3());

        assertNotEquals(2, triangle.getSide1());
        assertNotEquals(0, triangle.getSide2());
        assertNotEquals(4, triangle.getSide3());
    }
}