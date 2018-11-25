package mediatorpattern;

public class ApiaryColleague extends ColleagueBase {

    public ApiaryColleague(MediatorBase mediator) {
        super(mediator);
    }
    
    public void recieveTick() {
        System.out.println("TICK DO STUFF");
    }
}
