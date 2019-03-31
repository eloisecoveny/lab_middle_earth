package enemies;


import Interfaces.IDwell;
import Merchandise.Merchandise;


public class Enemy implements IDwell {
    private EnemyType type;
    private Merchandise attackTool;
    private int health;
    private int lootValue;

    public Enemy(EnemyType type, Merchandise attackTool, int lootValue) {
        this.type = type;
        this.attackTool = attackTool;
        this.lootValue = lootValue;
        this.health = 100;
    }

    public EnemyType getType() {
        return type;
    }

    public Merchandise getAttackTool() {
        return attackTool;
    }

    public int getHealth() {
        return health;
    }

    public int getLoot() {
        return lootValue;
    }

    public boolean isAlive(){
        return this.health > 0;
    }


}
