package mediatorpattern;

import java.util.ArrayList;

public class ApiaryColleague extends ColleagueBase {
    
    private ArrayList<Hive> hives = new ArrayList<>();
    
    /**
     * Constructs a new ApiaryColleague with a reference to a mediator
     * and how many hives should initially exist.
     * @param mediator A mediator used to send messages to TickColleague.
     * @param numberHives The number of hives to initially construct.
     */
    public ApiaryColleague(MediatorBase mediator, int numberHives) {
        super(mediator);

        for (int i = 0; i < numberHives; i++) {
            hives.add(new Hive(i));
        }
        
    }
    
    /**
     * Used to start the simulation.
     */
    public void sendStart() {
        mediator.sendHives(this, hives.size());
    }
    
    /**
     * Does all actions needed for a tick.
     */
    public void recieveTick() {
        //Do hive stuff
        System.out.println("Current Hives");
        for (Hive hive : hives) {
            System.out.println(hive);
        }
        
        hives.remove(0);
        System.out.println();
        //mediator.sendHives(this, hives.size());

    }
    
    public int getNumberOfHives() {
        return hives.size();
    }
}
