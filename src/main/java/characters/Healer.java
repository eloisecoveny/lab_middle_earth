package characters;

import Interfaces.IHeal;
import Interfaces.IProtect;
import Merchandise.HealingTool;

public class Healer extends Character implements IHeal, IProtect {

    private int defenceStrength;
    private HealingTool healingToool;

    public Healer(String name, CharacterType type, HealingTool healingTool) {
        super(name, type);
        this.healingToool = healingTool;
        this.defenceStrength = 10;
    }

    public int getDefenceStrength() {
        return defenceStrength;
    }

    public void setDefenceStrength(int defenceStrength) {
        this.defenceStrength = defenceStrength;
    }

    public HealingTool getHealingToool() {
        return healingToool;
    }

    public void setHealingTool(HealingTool healingToool) {
        this.healingToool = healingToool;
    }

    public double getHealingToolEffectiveness(){
        return this.healingToool.getEffectiveness();
    }

    public int getHealingToolStockLevel(){
        return this.healingToool.getStockLevel();
    }

    public double defend(int attackStrength){
        //if we use Creature as a model, it means that either we need access to the Player's health points
        //a way around it would be to give the healer 110 health points by default, instead of 100.
        return 0.0;
    }

    public int heal(java.lang.Character character, int quantity) {
        //returns health points that will be added to the player's health.
        //the number of health points will depend on the strength and quantity of healing potion applied.
        return 0;
    }
}
