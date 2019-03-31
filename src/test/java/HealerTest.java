import Merchandise.HealingTool;
import Merchandise.HealingToolType;
import Merchandise.Weapon;
import Merchandise.WeaponType;
import characters.Character;
import characters.CharacterType;
import characters.Healer;
import characters.Warrior;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {

    Healer healer;
    HealingTool mandrake;
    Character warrior;
    Weapon weapon;

    @Before
    public void setup(){
        mandrake = new HealingTool(HealingToolType.MANDRAKE);
        healer = new Healer("Galadriel", CharacterType.ELF, mandrake);
        weapon = new Weapon(WeaponType.SWORD);
        warrior = new Warrior("Bilbo", CharacterType.HOBBIT, weapon );
    }

    @Test
    public void hasName(){
        assertEquals("Galadriel", healer.getName());
    }

    @Test
    public void canHeal(){
        assertEquals( 0, healer.heal(warrior, 50));
    }

    @Test
    public void canProtect(){
        assertEquals(0.0, healer.defend(20), 0.01);
    }

    @Test
    public void canGetHealingToolEffectiveness(){
        assertEquals(0.5, healer.getHealingToolEffectiveness(), 0.01);
    }

    @Test
    public void canGetHealingToolStock(){
        assertEquals(100, healer.getHealingToolStockLevel());
    }
}
