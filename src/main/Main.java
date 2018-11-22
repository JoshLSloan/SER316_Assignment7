package main;

import builderPattern.BeeHiveBuilder;
import builderPattern.GreedyHive;
import builderPattern.Hive;
import builderPattern.HiveDirector;
import builderPattern.RestfulHive;
import decoratorPattern.Bee;
import decoratorPattern.FastBee;
import decoratorPattern.GreedyBee;
import decoratorPattern.StrongBee;
import singletonPattern.Apiary;

public class Main {

    public static void main(String[] args) {
        //runBuilderPattern();
        runSingletonPattern();

    }
    
    public static void runSingletonPattern() {
        //Lets get an apiary
        Apiary myApiary1 = Apiary.getApiary();
        
        //Now add some hives to that apiary
        myApiary1.addHive(1);
        myApiary1.addHive(2);
        myApiary1.addHive(3);
        
        //Lets try and get a second apiary
        Apiary myApiary2 = Apiary.getApiary();
        
        //And add different hives to it
        myApiary2.addHive(4);
        myApiary2.addHive(5);
        myApiary2.addHive(6);
        
        //Now if we print out both Apiary references we see that they
        //both contain the same hives
        System.out.println("MyApiary1\n------------");
        System.out.println(myApiary1.toString());
        
        System.out.println("MyApiary2\n------------");
        System.out.println(myApiary2.toString());
        
        //And here we see that the references are to the same object
        boolean equal = myApiary1 == myApiary2;
        System.out.println("myApiary1 == myApiary2: " + equal);
    }
    
    public static void runBuilderPattern() {
        HiveDirector director = new HiveDirector();
        
        BeeHiveBuilder restfulHiveBuilder = new RestfulHive();
        director.makeHive(restfulHiveBuilder);
        Hive sleepHive = restfulHiveBuilder.getHive();
        
        System.out.println(sleepHive);
        System.out.println();
        
        BeeHiveBuilder greedyHiveBuilder = new GreedyHive();
        director.makeHive(greedyHiveBuilder);
        Hive greedyHive = greedyHiveBuilder.getHive();
        
        System.out.println(greedyHive);
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
