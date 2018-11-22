package decoratorpattern;

public class StrongBee extends BeeDecoratorBase {

    public StrongBee(BeeBase parmBee) {
        super(parmBee);
    }
    
    @Override
    public int getStrength() {
        return super.getStrength() + 5;
    }
 
}
