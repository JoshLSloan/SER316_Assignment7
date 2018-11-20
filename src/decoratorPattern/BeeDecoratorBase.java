package decoratorPattern;

public abstract class BeeDecoratorBase extends BeeBase {
    
    private BeeBase bee;
    
    public BeeDecoratorBase(BeeBase pBee) {
        bee = pBee;
    }
    
    @Override
    public int getStrength() {
        return this.bee.getStrength();
    }
    
    @Override
    public int getMoveSpeed() {
        return this.bee.getMoveSpeed();
    }
    
    @Override
    public int getHarvestSpeed() {
        return this.bee.getHarvestSpeed();
    }
}
