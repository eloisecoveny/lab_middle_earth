import characters.Creature;
import characters.CreatureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CreatureTest {

    public Creature creature;

    @Before
    public void setup(){
        creature = new Creature(CreatureType.ENT_OAK);
    }

    @Test
    public void canGetCreatureDefenceStrength(){
        assertEquals(30, creature.getDefenceStrength());
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(100, creature.getHealthPoints(), 0.01);
    }

    @Test
    public void canCalculateHealthPoints(){
        creature.calculateHealthPoints(10);
        assertEquals(93, creature.getHealthPoints(), 0.01);
    }

    @Test
    public void canGetPrice(){
        assertEquals(50, creature.getPrice());
    }

}
