package enemies;

public enum EnemyType {
    RINGWRATIH(1),
    GIANT(3),
    ORC(5),
    GOBLIN(5),
    TROLL(4),
    URUK_HAI(7),
    WIZARD(8),
    SAURON(10),
    DRAGON(9);

    private final int threatLevel;

    EnemyType(int threatLevel){
        this.threatLevel = threatLevel;
    }

    public int getThreatLevel(){
        return this.threatLevel;
    }
}
