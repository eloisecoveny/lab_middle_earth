package characters;

public enum CreatureType {

    BROWN_EAGLE(30, 50),
    GOLDEN_EAGLE(40, 60),
    HAWK(20, 50),
    ENT_OAK(30, 50),
    ENT_WILLOW(10, 30);

    private final int defenceStrength;
    private final int price;

    CreatureType(int defenceStrength, int price){
        this.defenceStrength = defenceStrength;
        this.price = price;
    }

    public int getDefenceStrength(){
        return this.defenceStrength;
    }

    public int getPrice(){
        return this.price;
    }


}
