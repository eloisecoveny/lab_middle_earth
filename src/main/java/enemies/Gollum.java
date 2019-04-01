package enemies;

import Interfaces.IDwell;
import Interfaces.ISteal;
import game.Player;

public class Gollum implements IDwell, ISteal {

    private int loot;

    public Gollum(){
        this.loot = 0;
    }

    public void steal(Player player){
        int loot = player.isRobbed();
        this.loot += loot;
    }

    public int getLoot(){
        int loot = this.loot;
        this.loot = 0;
        return loot;
    }

}
