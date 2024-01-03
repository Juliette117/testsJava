package Exercices.TP1;

import Exercices.TP1.Moyenne;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MoyenneTest {

    double[] notesMoyenne = { 14, 16, 12 };
    double[] notesIncorrectes = { 14, 16, -2, 21 };
    double[] nombreNotes = { 14, 16, 12, 10 };
    //Arrange
    private Moyenne moyenne;
    @BeforeEach
    public void  setUp() {
        moyenne = new Moyenne();
    }

    @Test
    @DisplayName("Test calcul de la moyenne")
    public void testMoyenne() {
        //Arrange
        //Moyenne moyenne = new Moyenne();
        //Act
        double result = moyenne.getMoyenne(notesMoyenne);
        //Assert
        assertEquals(14.0, result);
    }

    @Test
    @DisplayName("Test vérification des notes")
    public void testVerifierNotes() {
        assertThrows(IllegalArgumentException.class, () -> moyenne.verifierSiNotesComprisesEntreOet20(notesIncorrectes));
    }

    @Test
    @DisplayName("Test vérification nombre de notes")
    public void testVerifierNombreDeNotes() {
        assertThrows(IllegalArgumentException.class, () -> moyenne.verifierNombreDeNotes(nombreNotes));




    }






}



