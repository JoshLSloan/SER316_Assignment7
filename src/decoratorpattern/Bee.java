package decoratorpattern;

public class Bee extends BeeBase {

    @Override
    public int getStrength() {
        return 5;
    }
    
    @Override
    public int getMoveSpeed() {
        return 1;
    }
    
    @Override
    public int getHarvestSpeed() {
        return 5;
    }
}
