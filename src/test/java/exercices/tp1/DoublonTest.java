package exercices.tp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Objects;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DoublonTest {

    private Doublon doublon;

    //Arrange
    @BeforeEach
    public void  setUp() {
        doublon = new Doublon();
    }

    @ParameterizedTest
    @MethodSource("provideNunberWithoutDoublons")
    public void testVerifierSiContientDoublon(int[] nombres) {
        boolean result = doublon.verifierSiDoublons(nombres);
        assertTrue(result);
    }
    public static Stream<Arguments> provideNunberWithoutDoublons() {
        return Stream.of(
                Arguments.of((Object) new int[]{1 ,2 ,3, 4}),
                Arguments.of((Object) new int[]{1 ,1 ,3, 4}),
                Arguments.of((Object) new int[]{1 ,2 ,2, 4, 5})
        );
    }

}