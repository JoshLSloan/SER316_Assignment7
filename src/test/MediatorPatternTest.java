package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import mediatorpattern.ApiaryColleague;
import mediatorpattern.ConcreteMediator;
import mediatorpattern.TickColleague;

import org.junit.Test;


public class MediatorPatternTest {

    @Test
    public void mediatorTest() {
        
        //Create a new mediator
        ConcreteMediator mediator = new ConcreteMediator();
        
        //Create a new ticker and apiary
        TickColleague ticker = new TickColleague(mediator);
        ApiaryColleague apiary = new ApiaryColleague(mediator, 5);
        
        //And assign them to the mediator
        mediator.setTickColleague(ticker);
        mediator.setApiaryColleague(apiary);
        
        //Keep checking the number of hives and ticking and checking
        //that number of hives is ticking down by one each tick.
        assertTrue(apiary.getNumberOfHives() == 5);
        ticker.sendTick(apiary.getNumberOfHives());
        
        System.out.println("TEST: " + apiary.getNumberOfHives());
        assertTrue(apiary.getNumberOfHives() == 4);
        ticker.sendTick(apiary.getNumberOfHives());
        
        assertTrue(apiary.getNumberOfHives() == 3);
        ticker.sendTick(apiary.getNumberOfHives());
        
        assertTrue(apiary.getNumberOfHives() == 2);
        ticker.sendTick(apiary.getNumberOfHives());
   
        assertTrue(apiary.getNumberOfHives() == 1);
        
        //Check that we get a false return indicating no more ticks
        //if we have less than two hives remaining.
        assertFalse(ticker.sendTick(apiary.getNumberOfHives()));
        assertTrue(apiary.getNumberOfHives() == 1);
    }

}
