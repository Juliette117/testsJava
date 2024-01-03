package exercices.tp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MajoritaireTest {

    private Majoritaire majoritaire;

    @BeforeEach
    public void setUp() {
        majoritaire = new Majoritaire();
    }

    @ParameterizedTest
    @MethodSource("provideArrayAvecElementMajoritaire")
    public void trouverElementMajoritaire(
            int[] nombres,
            int expected
    ) {

        int resultat = majoritaire.hashMap(nombres);

        assertEquals(expected, resultat);

    }

    public static Stream<Arguments> provideArrayAvecElementMajoritaire() {
        return Stream.of(
                Arguments.of((Object) new int[]{1, 1, 1, 1, 1, 2, 3, 4}, 1),
                Arguments.of((Object) new int[]{2, 3, 3, 3, 3, 3, 3, 3, 4, 5, 6, 7, 8}, 3),
                Arguments.of((Object) new int[]{2, 3, 3, 7, 8, 6, 7, 8, 7, 7, 7, 7, 7}, 7)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArraySansElementMajoritaire")
    public void retourneZeroSiPasElementMajoritaire(int[] nombres) {

        int result = majoritaire.hashMap(nombres);

        assertEquals(0, result);

    }

    public static Stream<Arguments> provideArraySansElementMajoritaire() {
        return Stream.of(
                Arguments.of((Object) new int[]{1, 2, 3, 4, 5, 6}),
                Arguments.of((Object) new int[]{30, 25, 40, 50, 50}),
                Arguments.of((Object) new int[]{100, 200, 100, 300, 100, 500})
        );
    }
}