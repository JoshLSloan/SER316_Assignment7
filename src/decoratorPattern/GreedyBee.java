package decoratorPattern;

public class GreedyBee extends BeeDecoratorBase {
    

    public GreedyBee(BeeBase pBee) {
        super(pBee);
    }
    
    @Override
    public int getHarvestSpeed() {
        return super.getHarvestSpeed() + 5;
    }

}
