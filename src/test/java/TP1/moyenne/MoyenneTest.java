package TP1.moyenne;

import Exercices.TP1.Moyenne;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoyenneTest {

    private Moyenne moyenne;


    @Test
    @DisplayName("Test calcul de la moyenne")
    public void testMoyenne() {
        double[] notes = { 14, 16, 12 };
        //Act
        double result = moyenne.calculerMoyenne(notes);
        //Assert
        assertEquals(14.0, result);
    }

}



