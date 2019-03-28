package characters;

public class Creature {

    private double healthPoints;
    private CreatureType type;

    public Creature(CreatureType type){
        this.healthPoints = 100;
        this.type = type;
    }

    public CreatureType getCreatureType(){
        return this.type;
    }

    public int getDefenceStrength(){
        return this.type.getDefenceStrength();
    }

    public int getPrice(){
        return this.type.getPrice();
    }

    public double getHealthPoints(){
        return healthPoints;
    }

    public void calculateHealthPoints(double attackStrength){
        double damage = ((100.00 - this.getDefenceStrength()) / 100.00) * attackStrength;
        this.healthPoints -= damage;
    }


}
