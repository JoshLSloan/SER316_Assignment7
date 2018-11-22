package decoratorpattern;

public class FastBee extends BeeDecoratorBase {

    public FastBee(BeeBase parmBee) {
        super(parmBee);
    }
    
    @Override
    public int getMoveSpeed() {
        return super.getMoveSpeed() + 1;
    }

}
