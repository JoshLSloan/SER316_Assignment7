package decoratorPattern;

public class StrongBee extends BeeDecoratorBase {

    public StrongBee(BeeBase pBee) {
        super(pBee);
    }
    
    @Override
    public int getStrength() {
        return super.getStrength() + 5;
    }
 
}
