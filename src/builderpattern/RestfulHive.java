package builderpattern;

public class RestfulHive extends BeeHiveBuilder {

    private Hive myHive = new Hive();
    
    private static final int INITIAL_SLEEP_ROOMS = 3;
    private static final int INITIAL_SPAWNING_ROOMS = 2;
    private static final int INITIAL_STORAGE_ROOMS = 1;

    @Override
    public Hive getHive() {
        return myHive;
    }

    @Override
    public void addSleepRooms() {
        for (int i = 0; i < INITIAL_SLEEP_ROOMS; i++) {
            myHive.getRooms().add(new SleepRoom());
        }

    }

    @Override
    public void addSpawningRooms() {
        for (int i = 0; i < INITIAL_SPAWNING_ROOMS; i++) {
            myHive.getRooms().add(new SpawningRoom());
        }

    }

    @Override
    public void addStorageRooms() {
        for (int i = 0; i < INITIAL_STORAGE_ROOMS; i++) {
            myHive.getRooms().add(new StorageRoom());
        }

    }

}
