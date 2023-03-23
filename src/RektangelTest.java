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
}