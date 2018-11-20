package builderPattern;

public class RestfulHive extends BeeHiveBuilder {
    
    private Hive myHive = new Hive();

    @Override
    public void addRoom1() {
        myHive.getRooms().add(new SleepRoom());
        
    }

    @Override
    public void addRoom2() {
        myHive.getRooms().add(new SleepRoom());
        
    }

    @Override
    public void addRoom3() {
        myHive.getRooms().add(new SleepRoom());
        
    }

    @Override
    public void addRoom4() {
        myHive.getRooms().add(new SleepRoom());
        
    }

    @Override
    public void addRoom5() {
        myHive.getRooms().add(new SpawningRoom());
        
    }

    @Override
    public void addRoom6() {
        myHive.getRooms().add(new StorageRoom());
        
    }
    
    @Override
    public Hive getHive() {
        return myHive;
    }

}
