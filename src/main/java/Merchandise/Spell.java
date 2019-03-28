package Merchandise;

public class Spell extends Merchandise {

    private SpellType type;

    public Spell(SpellType type){
        super(type.getPrice());
        this.type = type;
    }

    public SpellType getType() {
        return this.type;
    }

    public int getAttackStrength(){
        return this.type.getAttackStrength();
    }

}
