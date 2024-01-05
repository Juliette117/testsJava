package exercices.tp2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class SalarieCdiTest {

   private SalarieCdi salarieCdi;
    Adresse adresseMock;

   @BeforeEach
    public void setUp() {

       Identite identiteMock = mock(Identite.class);
       when(identiteMock.getPrenom()).thenReturn("Jean");
       when(identiteMock.getNom()).thenReturn("Dupont");
       when(identiteMock.getAdresse()).thenReturn(adresseMock);

      Salarie salarieMock = mock(Salarie.class);
       when(salarieMock.getIdentite()).thenReturn(identiteMock);

      Salaire salaireMock = mock(Salaire.class);
       when(salaireMock.payer(170)).thenReturn(2793.32);
       when(salaireMock.getTauxHoraire()).thenReturn(16.00);


       salarieCdi = new SalarieCdi(
               salaireMock,
               identiteMock
       );
   }


    @Test
    public void testDemenager() {
        salarieCdi.demenager(adresseMock);



    }


    @Test
    public void testTravailler() {
        String result = salarieCdi.travailler(170);

        assertEquals(
                "Le salarié Jean Dupont a travaillé 170.0 heures et a perçu 2793.32 euros.", result
        );


    }

    @Test
    public void testAugmenter() {
        salarieCdi.augmenter(10);

    }



}