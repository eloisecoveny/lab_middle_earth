package game;

import Interfaces.IBuy;
import Merchandise.Merchandise;
import characters.Character;

public class Player implements IBuy {

    private String name;
    private int health;
    private Character character;
    private int purse;

    public Player(String name, Character character){
        this.name = name;
        this.character = character;
        this.health = 100;
        this.purse = 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public Character getCharacter() {
        return character;
    }

    public int getPurse() {
        return purse;
    }

    public void buy(Merchandise merchandise){
        if(enoughFunds(merchandise)){
            this.pay(merchandise.getPrice());
        }
    }

    public void pay(int price){
        this.purse -= price;
    }

    public boolean enoughFunds(Merchandise merchandise){
        return merchandise.getPrice() <= this.purse;
    }

    public int isRobbed(){
        int loot = this.purse;
        this.purse = 0;
        return loot;
    }
}
