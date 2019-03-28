package characters;

public enum CreatureType {

    BROWN_EAGLE(30),
    GOLDEN_EAGLE(40),
    HAWK(20),
    ENT_OAK(30),
    ENT_WILLOW(10);

    private final int defenceStrength;

    CreatureType(int defenceStrength){
        this.defenceStrength = defenceStrength;
    }

    public int getDefenceStrength(){
        return this.defenceStrength;
    }


}
