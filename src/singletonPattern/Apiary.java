package singletonPattern;

public class Apiary {

    private static Apiary singleApiary = null;
    
    private Apiary() {}
    
    public static Apiary getApiary() {
        if(singleApiary == null) {
            singleApiary = new Apiary();
        }
        
        return singleApiary;
    }
}
