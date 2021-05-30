package models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class TetragonTest {

    @Test
    @DisplayName("Test for calculating of square of Tetragon")
    void square() {
        Tetragon tetragon = new Tetragon(2, 3, 4, 5);
        tetragon.square();
        assertEquals(10.9545, tetragon.getSquare(), 0.001);
        Tetragon tetragon1 = new Tetragon(1, 2, 3, 4);
        tetragon.square();
        //assertNotEquals(11, tetragon1.getSquare(), 0.001);
    }

    @Test
    @DisplayName("Test of getting Tetragon's sides")
    void sidesGetters() {
        Tetragon tetragon = new Tetragon(2, 3, 4, 5);
        assertEquals(2, tetragon.getSide1());
        assertEquals(3, tetragon.getSide2());
        assertEquals(4, tetragon.getSide3());
        assertEquals(5, tetragon.getSide4());

        assertNotEquals(0, tetragon.getSide1());
        assertNotEquals(0, tetragon.getSide2());
        assertNotEquals(0, tetragon.getSide3());
        assertNotEquals(0, tetragon.getSide4());
    }

    @Test
    @DisplayName("Test of setting Tetragon's sides")
    void sidesSetters() {
        Tetragon tetragon = new Tetragon(2, 3, 4, 5);
        tetragon.setSide1(20);
        tetragon.setSide2(30);
        tetragon.setSide3(40);
        tetragon.setSide4(50);

        assertEquals(20, tetragon.getSide1());
        assertEquals(30, tetragon.getSide2());
        assertEquals(40, tetragon.getSide3());
        assertEquals(50, tetragon.getSide4());

        assertNotEquals(2, tetragon.getSide1());
        assertNotEquals(0, tetragon.getSide2());
        assertNotEquals(4, tetragon.getSide3());
        assertNotEquals(0, tetragon.getSide4());
    }


}