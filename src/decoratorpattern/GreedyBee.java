package decoratorpattern;

public class GreedyBee extends BeeDecoratorBase {
    

    public GreedyBee(BeeBase parmBee) {
        super(parmBee);
    }
    
    @Override
    public int getHarvestSpeed() {
        return super.getHarvestSpeed() + 5;
    }

}
