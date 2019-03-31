import Merchandise.*;
import characters.Character;
import characters.CharacterType;
import characters.Magic;
import game.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Character character;
    Weapon weapon;
    Spell spell;
    Creature creature;

    @Before
    public void setup(){
        weapon = new Weapon(WeaponType.AXE);
        spell = new Spell(SpellType.EXPELLIARMUS);
        creature = new Creature(CreatureType.ENT_OAK);
        character = new Magic("Gimley", CharacterType.DWARF, spell, creature);
        player = new Player("Carme", character);
    }

    @Test
    public void hasName(){
        assertEquals("Carme", player.getName());
    }

    @Test
    public void hasCharacter(){
        assertEquals(character, player.getCharacter());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, player.getHealth());
    }

    @Test
    public void startsWithNoFunds(){
        assertEquals(0, player.getPurse());
    }

    @Test
    public void canReadCharacterName(){
        assertEquals("Gimley", player.getCharacter().getName());
    }

//    @Test
//    public void canGetCharacterSpell(){
//        assertEquals(spell, player.getCharacter().);
//    }
}
