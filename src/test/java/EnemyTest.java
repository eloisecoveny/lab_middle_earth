import Merchandise.Merchandise;
import Merchandise.Weapon;
import Merchandise.WeaponType;
import enemies.Enemy;
import enemies.EnemyType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {
    Enemy enemy;
    Merchandise club;

    @Before
    public void setup(){
        club = new Weapon(WeaponType.CLUB);
        enemy = new Enemy(EnemyType.GIANT, club, 3);
    }

    @Test
    public void hasType(){
        assertEquals(EnemyType.GIANT, enemy.getType());
    }

    @Test
    public void getEnemyThreatLevel(){
        assertEquals(3, enemy.getType().getThreatLevel());
    }

    @Test
    public void hasWeapon(){
        assertEquals(club, enemy.getAttackTool());
    }

    @Test
    public void hasLootValue(){
        assertEquals(3, enemy.getLootValue());
    }

    @Test
    public void startsWithFullHealth(){
        assertEquals(100, enemy.getHealth());
    }
}

