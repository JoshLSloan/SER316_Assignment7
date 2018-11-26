package mediatorpattern;

public class TickColleague extends ColleagueBase {
    
    private int ticks;

    public TickColleague(MediatorBase mediator) {
        super(mediator);
        this.ticks = 0;
    }
    
   
    /**
     * Sends a message to the mediator to inform the apiary to tick again
     * if the number of hives remaining is greater than 1.
     * @param numberOfHives The number of hives in the apiary.
     * @return True if the simulation should tick again, false otherwise.
     */
    public boolean sendTick(int numberOfHives) {
        if (numberOfHives > 1) {
            this.ticks++;
            System.out.println("Starting tick: " + ticks);
            mediator.tick(this);
            return true;
        }
        
        System.out.println("Less than two hives remain. Ending simulation.");
        return false;
    }
}
