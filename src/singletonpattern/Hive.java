package singletonpattern;

public class Hive {

    private int id;
    
    public Hive(int parmId) {
        this.id = parmId;
    }

    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "ID: " + this.id;
    }
    
    
}
