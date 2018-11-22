package builderpattern;

public class HiveDirector {

    /**
     * Builds a new hive by calling the relevant methods on a builder.
     * @param beeHiveBuilder The builder object containing the new hive
     *     to be completed via the appropriate method calls here.
     */
    public void makeHive(BeeHiveBuilder beeHiveBuilder) {
        
        beeHiveBuilder.addSleepRooms();
        beeHiveBuilder.addSpawningRooms();
        beeHiveBuilder.addStorageRooms();
    }
}
