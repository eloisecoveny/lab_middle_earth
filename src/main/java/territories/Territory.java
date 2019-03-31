package territories;

import Interfaces.IDwell;

import java.util.ArrayList;

public class Territory {

    private String name;
    private int minEnemyDifficulty;
    private int maxEnemyDifficulty;
    private ArrayList<Room> rooms;

    public Territory(String name, int minEnemyDifficulty, int maxEnemyDifficulty) {
        this.name = name;
        this.minEnemyDifficulty = minEnemyDifficulty;
        this.maxEnemyDifficulty = maxEnemyDifficulty;
        this.rooms = new ArrayList<Room>();
    }

    public String getName() {
        return name;
    }

    public int getMinEnemyDifficulty() {
        return minEnemyDifficulty;
    }

    public int getMaxEnemyDifficulty() {
        return maxEnemyDifficulty;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

}
