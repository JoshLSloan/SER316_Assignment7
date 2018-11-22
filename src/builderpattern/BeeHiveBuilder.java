package builderpattern;

public abstract class BeeHiveBuilder {

    public abstract void addSleepRooms();
    
    public abstract void addSpawningRooms();
   
    public abstract void addStorageRooms();
    
    public abstract Hive getHive();
}
