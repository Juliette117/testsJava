package exercices.tp2;

public class Salaire {

    private static final double HEURES_TRAVAILLEES_NORMALES = 151.67;
    private double tauxHoraire;



    public Salaire(double tauxHoraire) {

        this.tauxHoraire = tauxHoraire;
    }

    public double getTauxHoraire() {
        return this.tauxHoraire;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;

    }




    /**
     * Salaire en fonction des heures travaillées dans le mois
     * @param heures
     * @return double - Salaire
     */
    public double payer(double heures) {
        double salaire;
        if (heures > HEURES_TRAVAILLEES_NORMALES) {
            double heuresSupplementaires = heures - HEURES_TRAVAILLEES_NORMALES;
            salaire = ((heuresSupplementaires * (tauxHoraire * 1.25)) + (HEURES_TRAVAILLEES_NORMALES * tauxHoraire));
        } else {
            salaire = heures * tauxHoraire;
        }
        return salaire;

         /*public double payer() {

        return this.payer(151.67);
    }*/

    }
}
