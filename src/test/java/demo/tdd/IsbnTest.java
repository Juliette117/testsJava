package demo.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsbnTest {

    @Test
    public void isbnEstValide_2266232991() {
        Isbn isbn = new Isbn();
        boolean resultat = isbn.checkIsbn("2266232991");
        assertTrue(resultat);

    }

    @Test
    public void isbnEstValide_1491926309() {
        Isbn isbn = new Isbn();
        boolean resultat = isbn.checkIsbn("1491926309");
        assertTrue(resultat);
    }

    @Test
    public void isbnEstInvalide() {
        Isbn isbn = new Isbn();
        boolean resultat = isbn.checkIsbn("1491926307");
        assertFalse(resultat);
    }

    @Test
    public  void isbn_se_termine_par_X_valide() {
        Isbn isbn = new Isbn();
        boolean resultat = isbn.checkIsbn("155404295X");
        assertTrue(resultat);
    }

    @Test
    public  void isbn_se_termine_par_X_invalide() {
        Isbn isbn = new Isbn();
        boolean resultat = isbn.checkIsbn("030640617X");
        assertFalse(resultat);
    }

}
