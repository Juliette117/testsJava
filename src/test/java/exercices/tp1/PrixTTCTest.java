package exercices.tp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PrixTTCTest {

    private PrixTTC prixTTC;

    //Arrange
    @BeforeEach
    public void  setUp() {
        prixTTC = new PrixTTC();
    }

    @DisplayName("Test prix HT et TTC")
    @ParameterizedTest(name = "Test {index} : {0} * 1.20 = {1}")
    //Données prix HT et prix TTC (expected) au format CSV
    @CsvSource({
            "10,12",
            "20,24",
            "100,120"
        })
    public void testPrixTTC(int prixHT, int expected) {
        //Act
        double result = prixTTC.HtToTtc(prixHT);
        //Assert
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @DisplayName("Test vérification nombre négatif")
    @ValueSource(ints = {10, 20, 100, -20})
    public void testVerifierPrixHT(int prixHTNegatif) {
        assertThrows(IllegalArgumentException.class, () -> prixTTC.verifierPrix(prixHTNegatif));
    }





}