package Merchandise;

public enum SpellType {

    EXPELLIARMUS(5, 0),
    LUMOS(1, 0),
    RIDDIKULUS(7, 2),
    SECTUMSEMPRA(10, 5),
    WINGARDIUM_LEVIOSA(15, 10),
    EXPECTO_PATRONUM(17, 12),
    AVADA_KEDAVRA(50, 45),
    OBLIVIATE(25, 20);

    private final int attackStrength;
    private final int price;

    SpellType(int attackStrength, int price){
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
