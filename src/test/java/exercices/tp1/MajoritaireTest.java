package exercices.tp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajoritaireTest {

    private Majoritaire majoritaire;

    @BeforeEach
    public void  setUp() {
        majoritaire = new Majoritaire();
    }

    @Test
    public void testNombreMajortaire() {

        int[] nombres = {1, 1, 2};
        int result = majoritaire.hashMap(nombres);

        assertEquals(1, result);
    }



}