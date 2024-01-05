package exercices.tp2;

public class Salaire {

    private static final double HEURES_TRAVAILLEES = 151.67;
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
        if (heures > HEURES_TRAVAILLEES) {
            double heureSupplementaires = heures - HEURES_TRAVAILLEES;
            salaire = ((heureSupplementaires * (tauxHoraire * 1.25)) + (HEURES_TRAVAILLEES * tauxHoraire));
        } else {
            salaire = heures * tauxHoraire;
        }
        return salaire;

    }
}
