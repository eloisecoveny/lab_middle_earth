package Merchandise;

public enum HealingToolType {
    MANDRAKE( 0.5,0),
    DEVIL_SNARE(0.9,10),
    VENOMOUS_TENTACULA(1,20),
    FELIX_FELICIS( 0.4,0),
    POLYJUICE_POTION(1,20),
    VIDA_POTION(1.2,30);

    private final double effectiveness;
    private final int price;

    HealingToolType(double effectiveness, int price){
        this.effectiveness = effectiveness;
        this.price = price;
    }

    public double getEffectiveness() {
        return this.effectiveness;
    }

    public int getPrice() {
        return this.price;
    }
}
