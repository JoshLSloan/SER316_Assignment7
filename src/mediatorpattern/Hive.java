package mediatorpattern;

public class Hive {

    private final int id;
    
    public Hive(int parmId) {
        this.id = parmId;
    }
    
    @Override
    public String toString() {
        return "Hive: " + this.id;
    }
}
