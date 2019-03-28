package Merchandise;

public class Weapon extends Merchandise {
    private WeaponType type;

    public Weapon(WeaponType type){
        super(type.getPrice());
        this.type = type;
    }

    public WeaponType getType() {
        return this.type;
    }

    public int getAttackStrength(){
        return this.type.getAttackStrength();
    }
}
