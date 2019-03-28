package Merchandise;

public class Creature extends Merchandise {

    private double healthPoints;
    private CreatureType type;

    public Creature(CreatureType type){
        super(type.getPrice());
        this.healthPoints = 100;
        this.type = type;
    }

    public CreatureType getCreatureType(){
        return this.type;
    }

    public int getDefenceStrength(){
        return this.type.getDefenceStrength();
    }

    public double getHealthPoints(){
        return healthPoints;
    }

    public void calculateHealthPoints(double attackStrength){
        double damage = ((100.00 - this.getDefenceStrength()) / 100.00) * attackStrength;
        this.healthPoints -= damage;
    }


}
