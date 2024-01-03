package Exercices.TP1;

import Exercices.TP1.Moyenne;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoyenneTest {

    //Arrange
    private Moyenne moyenne;
    @BeforeEach
    public void  setUp() {
        moyenne = new Moyenne();
    }

    @Test
    @DisplayName("Test calcul de la moyenne")
    public void testMoyenne() {
        double[] notes = { 14, 16, 12 };
        //Arrange
        //Moyenne moyenne = new Moyenne();
        //Act
        double result = moyenne.getMoyenne(notes);
        //Assert
        assertEquals(14.0, result);
    }

    @Test
    @DisplayName("Test vérification des notes")
    public void testVerifierNotes() {
        double[] notes = { 14, 16, 12 };
        double result = moyenne.verifierSiNotesComprisesEntreOet20(notes);

        assertEquals(0, result);
    }

   




}



