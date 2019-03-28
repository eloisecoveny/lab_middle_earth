import Merchandise.Weapon;
import Merchandise.WeaponType;
import characters.CharacterType;
import characters.Warrior;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Warrior warrior;
    Weapon weapon;

    @Before
    public void setup(){
        weapon = new Weapon(WeaponType.SWORD);
        warrior = new Warrior("Bilbo", CharacterType.HOBBIT, weapon );
    }

    @Test
    public void canGetAttackStrength(){
        assertEquals(20, warrior.getAttackStrength());
    }
}
