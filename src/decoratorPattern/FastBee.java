package decoratorPattern;

public class FastBee extends BeeDecoratorBase {
    
    private int extraSpeed;

    public FastBee(BeeBase pBee) {
        super(pBee);
    }
    
    @Override
    public int getMoveSpeed() {
        return super.getMoveSpeed() + extraSpeed;
    }

    public int getExtraSpeed() {
        return extraSpeed;
    }

    public void setExtraSpeed(int extraSpeed) {
        this.extraSpeed = extraSpeed;
    }
    
    
}
