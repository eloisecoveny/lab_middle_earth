package Merchandise;

public enum WeaponType {

    SWORD(20, 15),
    AXE(10, 5),
    CLUB(7, 2),
    BRUTE_FORCE(5, 0),
    BOW_AND_ARROW(15, 10),
    BALL_AND_CHAIN(12, 7),
    SPEAR(10, 5),
    DAGGER(7, 2);

    private final int attackStrength;
    private final int price;

    WeaponType(int attackStrength, int price){
        this.attackStrength = attackStrength;
        this.price = price;
    }

    public int getAttackStrength(){
        return this.attackStrength;
    }

    public int getPrice(){
        return this.price;
    }
}
