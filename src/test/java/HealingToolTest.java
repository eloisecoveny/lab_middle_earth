import Merchandise.HealingTool;
import Merchandise.HealingToolType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealingToolTest {
    HealingTool healingTool;

    @Before
    public void setup(){
        healingTool = new HealingTool(HealingToolType.MANDRAKE);
    }

    @Test
    public void startsWithFullStock(){
        assertEquals(100, healingTool.getStockLevel());
    }

    @Test
    public void canGetEffectiveness(){
        assertEquals(0.5, healingTool.getEffectiveness(), 0.01);
    }

    @Test
    public void canGetPrice(){
        assertEquals(0, healingTool.getPrice());
    }

    @Test
    public void canChangeStockIfEnoughLeft(){
        healingTool.reduceStockLevel(30);
        assertEquals( 70, healingTool.getStockLevel() );
    }

    @Test
    public void cannotChangeStockIfNotEnoughLeft(){
        healingTool.reduceStockLevel(120);
        assertEquals( 100, healingTool.getStockLevel() );
    }
}
