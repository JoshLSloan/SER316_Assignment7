package builderPattern;

public class HiveDirector {

    public void makeHive(BeeHiveBuilder beeHiveBuilder) {
        
        beeHiveBuilder.addSleepRooms();
        beeHiveBuilder.addSpawningRooms();
        beeHiveBuilder.addStorageRooms();
    }
}
