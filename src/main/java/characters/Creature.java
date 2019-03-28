package characters;

public class Creature {

    private int healthPoints;
    private CreatureType type;

    public Creature(CreatureType type){
        this.healthPoints = 100;
        this.type = type;
    }
}
