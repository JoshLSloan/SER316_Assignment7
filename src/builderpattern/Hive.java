package builderpattern;

import java.util.ArrayList;

public class Hive {

    ArrayList<Room> rooms = new ArrayList<>();

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
    
    @Override
    public String toString() {
        String ret = "";
        for (int i = 0; i < rooms.size(); i++) {
            ret += (i + 1) + ") " + rooms.get(i) + "\n";
        }
        return ret;
    }
}
