package characters;

import Merchandise.Weapon;

public class Warrior extends Character{

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
}
