package demo.tdd;

import java.util.Objects;

public class Isbn {
    public boolean checkIsbn(String numeroIsbn){
        int somme = 0;
        for (int index = 0; index < numeroIsbn.length(); index++) {
            if (numeroIsbn.charAt(index) == 'X') {
                somme += 10 * (index +1);
            }else{
                somme += Integer.parseInt(String.valueOf(numeroIsbn.charAt(index))) * (index + 1);
            }

        }
        return somme % 11 == 0;
    }

}
