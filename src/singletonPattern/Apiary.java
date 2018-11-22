package singletonPattern;

import java.util.ArrayList;

/**
 * A singleton that represents an Apiary which holds a list of Hives.
 * Only one Apiary can ever exist.
 * @author Joshua Sloan
 *
 */
public class Apiary {

    private static Apiary singleApiary = null;
    
    private ArrayList<Hive> hives = new ArrayList<>();
    
    private Apiary() {}
    
    /**
     * Creates an returns an apiary instance if none exist.  Otherwise
     * returns the existing Apiary.
     * @return An apiary.
     */
    public static Apiary getApiary() {
        if(singleApiary == null) {
            singleApiary = new Apiary();
        }
        
        return singleApiary;
    }
    
    /**
     * Adds a hive to the apiary with an id number if that number is not
     * currently in use.
     * @param parmId The id number of the new hive.
     * @return True if the hive was added sucessfully, false otherwise.
     */
    public boolean addHive(int parmId) {
        if (hives.contains(parmId)) {
            return false; //id already in use
        } else {
            hives.add(new Hive(parmId));
            return true;
        }
    }
    
    @Override
    public String toString() {
        String ret = "";
        for (int i = 0; i < hives.size(); i++) {
            ret += hives.get(i).toString() + "\n";
        }
        return ret;
    }
}
