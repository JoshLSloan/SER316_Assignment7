package main;

import decoratorPattern.Bee;
import decoratorPattern.FastBee;
import decoratorPattern.GreedyBee;
import decoratorPattern.StrongBee;

public class Main {

    public static void main(String[] args) {
        Bee myBee = new Bee();
        
        System.out.println("Bee strength: " + myBee.getStrength()); 
        System.out.println("Bee move speed: " + myBee.getMoveSpeed());
        System.out.println("Bee harvest speed: " + myBee.getHarvestSpeed());
        System.out.println();
        
        StrongBee strongBee = new StrongBee(myBee);
        strongBee.setExtraStrength(5);
               
        System.out.println("Bee strength: " + strongBee.getStrength()); 
        System.out.println("Bee move speed: " + strongBee.getMoveSpeed());
        System.out.println("Bee harvest speed: " + strongBee.getHarvestSpeed());
        System.out.println();
        
        FastBee strongFastBee = new FastBee(strongBee);
        strongFastBee.setExtraSpeed(1);
        
        System.out.println("Bee strength: " + strongFastBee.getStrength()); 
        System.out.println("Bee move speed: " + strongFastBee.getMoveSpeed());
        System.out.println("Bee harvest speed: " + strongFastBee.getHarvestSpeed());
        System.out.println();
        
        GreedyBee strongFastGreedyBee = new GreedyBee(strongFastBee);
        strongFastGreedyBee.setExtraHarvest(5);
        
        System.out.println("Bee strength: " + strongFastGreedyBee.getStrength()); 
        System.out.println("Bee move speed: " + strongFastGreedyBee.getMoveSpeed());
        System.out.println("Bee harvest speed: " + strongFastGreedyBee.getHarvestSpeed());
        System.out.println();
    }

}
