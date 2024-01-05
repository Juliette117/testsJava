package exercices.tp2;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;


import static org.junit.jupiter.api.Assertions.assertEquals;

class SalaireTest {

    private Salaire salaire;


        @BeforeEach
        public void setUp() {

            salaire = new Salaire(16.00);
        }


        @ParameterizedTest(name = "Test {index} : {0}")
        @CsvSource({
            "151.67, 2426.72",
            "170, 2793.32"
        })
        @DisplayName("Test de la méthode payer()")
        public void testPayer(double heures, double expected) {
            assertEquals(expected, salaire.payer(heures));
    }


}