package Exercices.TP1;

public class Moyenne {

    public double getMoyenne(double[] notes) {

        this.verifierSiNotesComprisesEntreOet20(notes);
        this.verifierTaille(notes);

        return this.calculerMoyenne(notes);
    }

    public double verifierSiNotesComprisesEntreOet20(double[] notes) throws IllegalArgumentException {
        for (double note : notes) {
            if (note < 0) {
                throw new IllegalArgumentException("L'éleve ne peut pas avoir une note en dessous de 0");
            } else if (note > 20) {
                throw new IllegalArgumentException("L'éleve ne peut pas avoir plus de 20");
            }
        }

        return 0;
    }
    private void verifierTaille(double[] notes) {
        if (notes.length != 3) {
            throw new IllegalArgumentException("Le carnet de notes doit contenir 3 notes");
        }
    }

    /**
     * Calcule la moyenne des notes saisies
     *
     * @param notes
     * @return double // La moyenne de l'élève
     */
    private double calculerMoyenne(double[] notes) {
        double moyenne = 0;
        for (double note : notes) {
            moyenne += note;
        }

        return moyenne / notes.length;
    }
}