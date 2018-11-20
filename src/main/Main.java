package main;

import builderPattern.BeeHiveBuilder;
import builderPattern.Hive;
import builderPattern.HiveDirector;
import builderPattern.RestfulHive;
import decoratorPattern.Bee;
import decoratorPattern.FastBee;
import decoratorPattern.GreedyBee;
import decoratorPattern.StrongBee;

public class Main {

    public static void main(String[] args) {
        runBuilderPattern();

    }
    
    public static void runBuilderPattern() {
        HiveDirector director = new HiveDirector();
        
        BeeHiveBuilder restfulHiveBuilder = new RestfulHive();
        director.makeHive(restfulHiveBuilder);
        Hive sleepHive = restfulHiveBuilder.getHive();
        
        System.out.println(sleepHive);
    }
    
    public static void runDecoratorPatten() {
        Bee myBee = new Bee();
        
        System.out.println("myBee\n-----------");
        System.out.println("Bee strength: " + myBee.getStrength()); 
        System.out.println("Bee move speed: " + myBee.getMoveSpeed());
        System.out.println("Bee harvest speed: " + myBee.getHarvestSpeed());
        System.out.println();
        
        StrongBee strongBee = new StrongBee(myBee);
        
        System.out.println("strongBee\n-----------");
        System.out.println("Bee strength: " + strongBee.getStrength()); 
        System.out.println("Bee move speed: " + strongBee.getMoveSpeed());
        System.out.println("Bee harvest speed: " + strongBee.getHarvestSpeed());
        System.out.println();
        
        FastBee strongFastBee = new FastBee(strongBee);
        
        System.out.println("strongFastBee\n-----------");
        System.out.println("Bee strength: " + strongFastBee.getStrength()); 
        System.out.println("Bee move speed: " + strongFastBee.getMoveSpeed());
        System.out.println("Bee harvest speed: " + strongFastBee.getHarvestSpeed());
        System.out.println();
        
        GreedyBee strongFastGreedyBee = new GreedyBee(strongFastBee);
        
        System.out.println("strongFastGreedyBee\n-----------");
        System.out.println("Bee strength: " + strongFastGreedyBee.getStrength()); 
        System.out.println("Bee move speed: " + strongFastGreedyBee.getMoveSpeed());
        System.out.println("Bee harvest speed: " + strongFastGreedyBee.getHarvestSpeed());
        System.out.println();
        
        StrongBee anotherStrongBee = new StrongBee(new Bee());
        
        System.out.println("anotherStrongBee\n-----------");
        System.out.println("Bee strength: " + anotherStrongBee.getStrength()); 
        System.out.println("Bee move speed: " + anotherStrongBee.getMoveSpeed());
        System.out.println("Bee harvest speed: " + anotherStrongBee.getHarvestSpeed());
        System.out.println();
        
        GreedyBee anotherStrongGreedyBee = new GreedyBee(anotherStrongBee);
        
        System.out.println("anotherStrongGreedyBee\n-----------");
        System.out.println("Bee strength: " + anotherStrongGreedyBee.getStrength()); 
        System.out.println("Bee move speed: " + anotherStrongGreedyBee.getMoveSpeed());
        System.out.println("Bee harvest speed: " + anotherStrongGreedyBee.getHarvestSpeed());
        System.out.println();
        
        GreedyBee testBee = new GreedyBee(new FastBee(new StrongBee(new Bee())));
        
        System.out.println("testBee\n-----------");
        System.out.println("Bee strength: " + testBee.getStrength()); 
        System.out.println("Bee move speed: " + testBee.getMoveSpeed());
        System.out.println("Bee harvest speed: " + testBee.getHarvestSpeed());
        System.out.println();
    }

}
