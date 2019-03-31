package territories;

import Interfaces.IDwell;

import java.util.ArrayList;

public class Room {

    private ArrayList<IDwell> dwellers;

    public Room(ArrayList<IDwell> dwellers){
        this.dwellers = dwellers;
    }

    public ArrayList<IDwell> getDwellers() {
        return dwellers;
    }

    public void setDwellers(ArrayList<IDwell> dwellers) {
        this.dwellers = dwellers;
    }
}
