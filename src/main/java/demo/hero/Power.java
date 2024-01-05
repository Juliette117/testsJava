package demo.hero;

public class Power {

    private String nom;
    private String description;

    public Power(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    @Override
    public String toString() {
        return this.nom + " : " + this.description;
    }
}
