package exercices.tp2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class SalarieCdiTest {
    private SalarieCdi salarieCdi;
    private double heures = 170;
    Adresse adresseMock = mock(Adresse.class);
    Identite identiteMock = mock(Identite.class);

    Salaire salaireMock = mock(Salaire.class);

   @BeforeEach
    public void setUp() {

       Identite identiteMock = mock(Identite.class);
       when(identiteMock.getPrenom()).thenReturn("Jean");
       when(identiteMock.getNom()).thenReturn("Dupont");
       when(identiteMock.getAdresse()).thenReturn(adresseMock);

      Salarie salarieMock = mock(Salarie.class);
       when(salarieMock.getIdentite()).thenReturn(identiteMock);

      Salaire salaireMock = mock(Salaire.class);
       when(salaireMock.payer(heures)).thenReturn(2793.32);
       when(salaireMock.getTauxHoraire()).thenReturn(16.00);

       salarieCdi = new SalarieCdi(
               salaireMock,
               identiteMock
       );
   }


    @Test
    public void testDemenager() {
        salarieCdi.demenager(adresseMock);
        verify(
                identiteMock,
                times(1)
        ).setAdresse(adresseMock);



    }

    @Test
    public void testTravaillerSansParametre() {
        salarieCdi.travailler();
        verify(
                salaireMock
        ).payer(151.67);
    }


    @Test
    public void testPhraseTravailler() {
        String result = salarieCdi.phraseTravailler(heures);

        assertEquals(
                "Le salarié Jean Dupont a travaillé 170.0 heures et a perçu 2793.32 euros.", result
        );


    }

    @ParameterizedTest
    @CsvSource({
            "10,20,12",
            "20,20,24"
    })
    public void testAugmenter() {
       double tauxHoraireInitial;
       double purcentageAugmentation;
       double nouveauTauxHoraire;
       when(salaireMock.getTauxHoraire()).thenReturn(10.00);
        salarieCdi.augmenter(20);
        verify(
                salaireMock,
                times(1)
        ).setTauxHoraire(12);

    }



}