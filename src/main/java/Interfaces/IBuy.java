// TODO finish this when we have a player class.
package Interfaces;

import Merchandise.Merchandise;

public interface IBuy {

    void buy(Merchandise merchandise);
    void pay(int price);
    boolean enoughFunds(Merchandise merchandise);
}
