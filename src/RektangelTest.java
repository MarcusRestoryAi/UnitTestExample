import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RektangelTest {

    @BeforeEach
    void setUp() {
        System.out.println("Innan ett test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Efter ett test");
    }

    //Skapa en Metod som testar Konstruktorn i Rektangel Klassen
    @Test
    void rektangelKonstruktor() {
        int height = 8;
        int width = 4;

        //Skapa ett objekt av klassen rektangel
        Rektangel rektangel = new Rektangel(height, width);

        //Testa med assert metoder
        assertEquals(rektangel.height, height);
        assertEquals(rektangel.width, width);
    }

    @Test
    void rektangelArea() {
        assertEquals(new Rektangel(8, 8).getArea(), 64);
        assertEquals(new Rektangel(10, 6).getArea(), 60);
        assertEquals(new Rektangel(8, 3).getArea(), 24);
        assertEquals(new Rektangel(15, 5).getArea(), 75);
    }

    @Test
    void rektangelSquare() {
        assertTrue(new Rektangel(10, 10).isSquare());
        assertTrue(new Rektangel(5, 5).isSquare());

        assertFalse(new Rektangel(10, 5).isSquare());
        assertFalse(new Rektangel(8, 3).isSquare());
    }
}