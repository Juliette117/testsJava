package exercices.tp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ThermometreTest {

    int[] temperature;

    @Test
    public void should_return_0_if_empty_tab() {

        Thermometre thermometre = new Thermometre();
        int resultat = thermometre.checkThermometre(null);
        assertEquals(0,resultat);

    }


}
