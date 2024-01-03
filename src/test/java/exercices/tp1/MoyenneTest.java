package exercices.tp1;

import exercices.tp1.Moyenne;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        double[] notesMoyenne = { 14, 16, 12 };
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
        double[] notesIncorrectes = { 14, 16, -2, 21 };
        assertThrows(IllegalArgumentException.class, () -> moyenne.verifierSiNotesComprisesEntreOet20(notesIncorrectes));
    }

    @Test
    @DisplayName("Test vérification nombre de notes")
    public void testVerifierNombreDeNotes() {
        double[] nombreNotes = { 14, 16, 12, 10 };
        assertThrows(IllegalArgumentException.class, () -> moyenne.verifierNombreDeNotes(nombreNotes));
    }


}



