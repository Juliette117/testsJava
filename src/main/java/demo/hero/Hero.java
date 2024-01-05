package demo.hero;

import java.util.List;

public class Hero {

    private Identity identity;
    private List<Power> powers;

    public Hero(Identity identity, List<Power> powers) {
        this.identity = identity;
        this.powers = powers;
    }

    public String removeCostume() {
        return "Le hero retire son costume et redevient " + identity.getIdentity();
    }

    public String fight() {
        return "Le hero utilise son pouvoir : " + this.getRandomPower();
    }

    public Power getRandomPower() {
        int index = (int) Math.floor(Math.random() * powers.toArray().length);
        return this.powers.get(index);

    }

    public void setPowers(List<Power> powers) {
        this.powers = powers;
    }
}

