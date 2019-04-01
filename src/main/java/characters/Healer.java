package characters;

import Interfaces.IHeal;
import Interfaces.IProtect;
import Merchandise.HealingTool;

public class Healer extends Character implements IHeal {

    private int defenceStrength;
    private HealingTool healingTool;

    public Healer(String name, CharacterType type, HealingTool healingTool) {
        super(name, type);
        this.healingTool = healingTool;
        this.defenceStrength = 10;
    }

    public int getDefenceStrength() {
        return defenceStrength;
    }

    public HealingTool getHealingToool() {
        return healingTool;
    }

    public void setHealingTool(HealingTool healingToool) {
        this.healingTool = healingToool;
    }

    public double getHealingToolEffectiveness(){
        return this.healingTool.getEffectiveness();
    }

    public int getHealingToolStockLevel(){
        return this.healingTool.getStockLevel();
    }

    //TODO the returned health Points must be added to the player associated to that character.
    public int heal(Character character, int quantity) {
        int currentStockLevel = this.healingTool.getStockLevel();

        if(currentStockLevel == 0){
            //no healingTool stocks left
            return 0;

        } else if (currentStockLevel < quantity ) {
            //we can't apply as much as was requested
            this.healingTool.reduceStockLevel(currentStockLevel);
            return (int) (this.healingTool.getType().getEffectiveness() * currentStockLevel);

        } else {
            //reduce healingTool stock level
            this.healingTool.reduceStockLevel(quantity);

            //return health points that will be added to the player's health.
            //the number of health points will depend on the strength and quantity of healing potion applied
            return (int) (this.healingTool.getType().getEffectiveness() * quantity);

        }
    }
}
