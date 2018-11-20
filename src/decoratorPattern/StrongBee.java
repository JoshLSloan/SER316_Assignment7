package decoratorPattern;

public class StrongBee extends BeeDecoratorBase {
    
    private int extraStrength;

    public StrongBee(BeeBase pBee) {
        super(pBee);
    }
    
    @Override
    public int getStrength() {
        return super.getStrength() + extraStrength;
    }

    public int getExtraStrength() {
        return extraStrength;
    }

    public void setExtraStrength(int extraStrength) {
        this.extraStrength = extraStrength;
    }   
}
