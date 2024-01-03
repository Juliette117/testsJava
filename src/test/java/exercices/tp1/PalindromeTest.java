package exercices.tp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    private Palindrome palindrome;

    //Arrange
    @BeforeEach
    public void  setUp() {
        palindrome = new Palindrome();
    }

    @ParameterizedTest
    @DisplayName("Test vérification si le nombre est un palindrome")
    @ValueSource(ints = {101, 202,21 })
    public void testVerifierSiPalindrome(int nombre) {
            //Act
            boolean result = palindrome.estUnPalindrome(nombre);
            //Assert
            assertEquals(true, result);
        }

    }

