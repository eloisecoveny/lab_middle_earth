package Merchandise;

import Interfaces.IProtect;

public class Creature extends Merchandise implements IProtect {

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

    public double defend(int attackStrength){
        double damage = ((100.00 - this.getDefenceStrength()) / 100.00) * attackStrength;
        if(this.healthPoints >= damage){
            this.healthPoints -= damage;
            return 0.0;
        } else {
            return damage - this.healthPoints;
        }
    }


}
