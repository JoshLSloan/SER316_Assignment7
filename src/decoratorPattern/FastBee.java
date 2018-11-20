package decoratorPattern;

public class FastBee extends BeeDecoratorBase {

    public FastBee(BeeBase pBee) {
        super(pBee);
    }
    
    @Override
    public int getMoveSpeed() {
        return super.getMoveSpeed() + 1;
    }

}
