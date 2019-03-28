package characters;

import Interfaces.IFight;
import Interfaces.IProtect;
import Merchandise.Creature;
import Merchandise.Spell;

public class Magic extends Character implements IFight {

    private Spell spell;
    private Creature creature;

    public Magic(String name, CharacterType type, Spell spell, Creature creature){
        super(name, type);
        this.spell = spell;
        this.creature = creature;
    }

    public Spell getSpell(){
        return spell;
    }

    public void setSpell(Spell spell){
        this.spell = spell;
    }

    public Creature getCreature(){
        return creature;
    }

    public void setCreature(Creature creature){
        this.creature = creature;
    }

    public int getAttackStrength(){
        return this.spell.getAttackStrength();
    }

    public int attack(){
        return this.getAttackStrength();
    }

    public boolean canCreatureDefend(int attackStrength){
        return this.creature.getHealthPoints() >= attackStrength;
    }

    public String creatureDefend(int attackStrength){
        double remainingAttack = this.creature.defend(attackStrength);
        if(remainingAttack > 0){ // TODO finish this when we have a player class.
            return "Player is deducted " + remainingAttack + " health points.";
        }
        return "The creature has defended you successfully.";
    }
}
