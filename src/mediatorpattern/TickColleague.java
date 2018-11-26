package mediatorpattern;

public class TickColleague extends ColleagueBase {
    
    private int ticks;

    public TickColleague(MediatorBase mediator) {
        super(mediator);
        this.ticks = 0;
    }
    
    
    public void runSimulation(int numberOfHives) {
        System.out.println("Received numberOfHives: " + numberOfHives);
        if (numberOfHives > 1) {
            ticks++;
            System.out.println("Starting tick: " + ticks);
            //sendTick();
        } else {
            System.out.println("Hives are all gone, simulation done.");
        }
    }
    
    public void sendTick() {
        mediator.tick(this);
    }
}
