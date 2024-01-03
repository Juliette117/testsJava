package exercices.tp1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PrixTTCTest {

   // int prixHt = { };

    @ParameterizedTest
    @CsvSource({
            "10,12",
            "20,24",
            "100,120"
        })
    @DisplayName("Test prix TTC")
    public void testPrixTTC(int prixHT, int expected) {

        PrixTTC prixTTC = new PrixTTC();
        //Act
        double result = prixTTC.HtToTtc(prixHT);
        //Assert
        assertEquals(expected, result);
    }

}