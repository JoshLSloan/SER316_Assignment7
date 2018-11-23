package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import decoratorpattern.Bee;
import decoratorpattern.FastBee;
import decoratorpattern.GreedyBee;
import decoratorpattern.StrongBee;

/**
 * Tests the decorator pattern implementation.
 * @author Joshua Sloan
 *
 */
public class DecoratorPatternTest {

    @Test
    public void test() {
        
        //Create a new bee
        Bee myBee = new Bee();
        
        //Verify it has its base stats
        assertTrue(myBee.getStrength() == 5);
        assertTrue(myBee.getMoveSpeed() == 1);
        assertTrue(myBee.getHarvestSpeed() == 5);
        
        //Decorate the bee with extra strength
        StrongBee strongBee = new StrongBee(myBee);
        
        //Check that the strength attribute has increased correctly
        assertTrue(strongBee.getStrength() == 10);
        assertTrue(strongBee.getMoveSpeed() == 1);
        assertTrue(strongBee.getHarvestSpeed() == 5);
        
        //Now decorate that bee with more move speed
        FastBee strongFastBee = new FastBee(strongBee);
        
        //And verify that the extra strength is still there along with
        //increased move speed
        assertTrue(strongFastBee.getStrength() == 10);
        assertTrue(strongFastBee.getMoveSpeed() == 2);
        assertTrue(strongFastBee.getHarvestSpeed() == 5);
        
        //Now decorate that stronger faster bee with more harvest speed
        GreedyBee strongFastGreedyBee = new GreedyBee(strongFastBee);
        
        //And verify all stats are increased as expected
        assertTrue(strongFastGreedyBee.getStrength() == 10);
        assertTrue(strongFastGreedyBee.getMoveSpeed() == 2);
        assertTrue(strongFastGreedyBee.getHarvestSpeed() == 10);
    }

}
