package mediatorpattern;

public abstract class MediatorBase {

    public abstract void tick(ColleagueBase caller);
    
    public abstract void sendHives(ColleagueBase caller, int numberOfHives);
}
