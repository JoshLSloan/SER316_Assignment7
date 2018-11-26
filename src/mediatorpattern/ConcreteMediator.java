package mediatorpattern;

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
            tickColleague.runSimulation(numberOfHives);
        }
    }
    

    public TickColleague getTickColleague() {
        return tickColleague;
    }

    public void setTickColleague(TickColleague tickColleague) {
        this.tickColleague = tickColleague;
    }

    public ApiaryColleague getApiaryColleague() {
        return apiaryColleague;
    }

    public void setApiaryColleague(ApiaryColleague apiaryColleague) {
        this.apiaryColleague = apiaryColleague;
    }
    
    
}
