package mediatorpattern;

/**
 * Mediates communication between a TickColleague and ApiaryColleague.
 * Allows the tick colleague to send a message to the apiary to perform
 * another tick of the simulation and the apiary to send status (that is
 * the number of remaining hives) back to the tick colleague.
 * @author Joshua Sloan
 *
 */
public class ConcreteMediator extends MediatorBase {

    private TickColleague tickColleague;
    private ApiaryColleague apiaryColleague;
    
    @Override
    public void tick(ColleagueBase caller) {
        
        if (caller == tickColleague) {
            System.out.println("Invoking new tick");
            apiaryColleague.recieveTick();
        }
    }
    
    @Override
    public void sendHives(ColleagueBase caller, int numberOfHives) {
        if (caller == apiaryColleague) {
            System.out.println("Sending numberOfHives: " + numberOfHives);
            tickColleague.sendTick(numberOfHives);
        }
    }
    
    public void setTickColleague(TickColleague tickColleague) {
        this.tickColleague = tickColleague;
    }


    public void setApiaryColleague(ApiaryColleague apiaryColleague) {
        this.apiaryColleague = apiaryColleague;
    }
    
    
}
