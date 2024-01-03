package Exercices.TP1;

public class Moyenne {

    public static double getMoyenne(double[] notes) throws IllegalAccessException {

        verifierSiNotesComprisesEntreOet20(notes);

        return calculerMoyenne(notes);
    }

    /**
     * Calcule la moyenne des notes saisies
     * @param notes
     * @return double // La moyenne de l'élève
     */
 public static double calculerMoyenne(double[] notes) {
        double moyenne =0;
        for(double note: notes) {
            moyenne += note;
        }

        return moyenne / notes.length;
    }

    private static void verifierSiNotesComprisesEntreOet20(double[] notes) throws IllegalArgumentException {
        for (double note: notes) {
            if(note < 0) {
                throw new IllegalArgumentException("L'éleve ne peut pas avoir une note en dessous de 0");
            }
            else if(note > 20) {
                throw new IllegalArgumentException("L'éleve ne peut pas avoir plus de 20");
            }
        }

    }



}
