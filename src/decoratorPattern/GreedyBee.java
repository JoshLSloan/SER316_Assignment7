package decoratorPattern;

public class GreedyBee extends BeeDecoratorBase {
    
    private int extraHarvest;

    public GreedyBee(BeeBase pBee) {
        super(pBee);
    }
    
    @Override
    public int getHarvestSpeed() {
        return super.getHarvestSpeed() + extraHarvest;
    }

    public int getExtraHarvest() {
        return extraHarvest;
    }

    public void setExtraHarvest(int extraHarvest) {
        this.extraHarvest = extraHarvest;
    }
}
