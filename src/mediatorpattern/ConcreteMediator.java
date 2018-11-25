package mediatorpattern;

public class ConcreteMediator extends MediatorBase {

    private TickColleague tickColleague;
    private ApiaryColleague apiaryColleague;
    
    @Override
    public void tick(ColleagueBase caller) {
        
        if (caller == tickColleague) {
            apiaryColleague.recieveTick();
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
