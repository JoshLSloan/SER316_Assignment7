package main;

import builderpattern.BeeHiveBuilder;
import builderpattern.GreedyHive;
import builderpattern.Hive;
import builderpattern.HiveDirector;
import builderpattern.RestfulHive;
import decoratorpattern.Bee;
import decoratorpattern.FastBee;
import decoratorpattern.GreedyBee;
import decoratorpattern.StrongBee;
import mediatorpattern.ApiaryColleague;
import mediatorpattern.ConcreteMediator;
import mediatorpattern.TickColleague;
import singletonpattern.Apiary;

public class Main {

    /**
     * Runs examples showing off all patterns.
     * @param args Not used.
     */
    public static void main(String[] args) {
        runBuilderPattern();
        runSingletonPattern();
        runDecoratorPatten();
        runMediatorPattern();

    }
    
    /**
     * Runs a demonstration of the Mediator Pattern.
     */
    public static void runMediatorPattern() {
        System.out.println("MEDIATOR PATTERN");
        System.out.println("----------------");
        System.out.println("----------------");
        ConcreteMediator mediator = new ConcreteMediator();
        
        TickColleague ticker = new TickColleague(mediator);
        ApiaryColleague apiary = new ApiaryColleague(mediator, 5);
        
        mediator.setTickColleague(ticker);
        mediator.setApiaryColleague(apiary);
        
        //apiary.sendStart();

        while (apiary.getNumberOfHives() > 1) {
            ticker.sendTick(apiary.getNumberOfHives());
        }
        
    }
    
    /**
     * Runs a demonstration of the Singleton Pattern.
     */
    public static void runSingletonPattern() {
        System.out.println("SINGLETON PATTERN");
        System.out.println("-----------------");
        System.out.println("-----------------");
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
    
    /**
     * Runs a demonstration of the Builder Pattern.
     */
    public static void runBuilderPattern() {
        System.out.println("BUILDER PATTERN");
        System.out.println("---------------");
        System.out.println("---------------");
        
        //Get a director
        HiveDirector director = new HiveDirector();
        
        //Create a builder for a RestfulHive and use the director to build it
        //and get the hive
        BeeHiveBuilder restfulHiveBuilder = new RestfulHive();
        director.makeHive(restfulHiveBuilder);
        Hive sleepHive = restfulHiveBuilder.getHive();
        
        //Now we can see that the RestfulHive object has the expected number
        //of each type of room
        System.out.println("RESTFUL HIVE");
        System.out.println("------------");
        System.out.println(sleepHive);
        System.out.println();
        
        //Now we'll build a GreedyHive
        BeeHiveBuilder greedyHiveBuilder = new GreedyHive();
        director.makeHive(greedyHiveBuilder);
        Hive greedyHive = greedyHiveBuilder.getHive();
        
        //And again see that we have the right number of rooms of each type
        System.out.println("GREEDY HIVE");
        System.out.println("-----------");
        System.out.println(greedyHive);
    }
    
    /**
     * Runs a demonstration of the Decorator Pattern.
     */
    public static void runDecoratorPatten() {
        System.out.println("DECORATOR PATTERN");
        System.out.println("-----------------");
        System.out.println("-----------------");
        
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
