package characters;

import Interfaces.IFight;
import Merchandise.Weapon;

public class Warrior extends Character implements IFight {

    private Weapon weapon;

    public Warrior(String name, CharacterType type, Weapon weapon){
        super(name, type);
        this.weapon = weapon;
    }

    public Weapon getWeapon(){
        return weapon;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public int getAttackStrength(){
        return this.weapon.getAttackStrength();
    }

    public int attack(){
        return this.getAttackStrength();
    }
}
