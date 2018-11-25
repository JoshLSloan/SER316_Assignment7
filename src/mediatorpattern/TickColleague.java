package mediatorpattern;

public class TickColleague extends ColleagueBase {

    public TickColleague(MediatorBase mediator) {
        super(mediator);
    }
    
    public void sendTick() {
        mediator.tick(this);
    }
}
