package exercices.tp2;

public class Salaire {

    private static final double HEURES_TRAVAILLEES = 151;
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
     * Salaire en fonction des heures travaillées
     * @param heures
     * @return double
     */
    public double payer(double heures) {
        return calculerSalaire(heures);
    }

    /**
     * Calcule le salaire en fonction du temps travaillé dans le mois
     *
     * @return double
     */
    double calculerSalaire(double heures) {
        if (heures > HEURES_TRAVAILLEES) {
            double salaire = 0;
            salaire += HEURES_TRAVAILLEES * this.tauxHoraire;
            salaire += (heures - HEURES_TRAVAILLEES) * this.tauxHoraire * 0.25;

            return salaire;
        } else {
            return heures * this.tauxHoraire;
        }
    }
}
