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
     * @return double
     */
    public double payer(double heures) {
        return calculerSalaire(heures);
    }

    /**
     * Calcule le salaire en fonction des heures supplémentaires travaillés dans le mois
     *
     * @return double
     */
    double calculerSalaire(double heuresSupplementaire) {
        if (heuresSupplementaire > HEURES_TRAVAILLEES) {
            double salaire = 0;
            salaire += HEURES_TRAVAILLEES * this.tauxHoraire;
            salaire += (heuresSupplementaire - HEURES_TRAVAILLEES) * this.tauxHoraire * 0.25;

            return salaire;
        } else {
            return heuresSupplementaire * this.tauxHoraire;
        }
    }
}
