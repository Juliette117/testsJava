package exercices.tp1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class NombresRomainsTest {

    @ParameterizedTest
    @CsvSource({
            "I, 1",
            "IX, 9",
            "MCMXCI, 1991"
    })
    public void convertirNombreRomainEnNombreArabe(String nombreRomain, int expected) {
        NombresRomains nombresRomains = new NombresRomains();

        int result = nombresRomains.convertirNombreRomainEnNombreArabe(nombreRomain);

        assertEquals(expected, result);

    }

}