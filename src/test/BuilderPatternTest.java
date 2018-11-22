package test;

import static org.junit.Assert.assertTrue;

import builderpattern.BeeHiveBuilder;
import builderpattern.GreedyHive;
import builderpattern.Hive;
import builderpattern.HiveDirector;
import builderpattern.RestfulHive;
import builderpattern.Room;
import builderpattern.SleepRoom;
import builderpattern.SpawningRoom;
import builderpattern.StorageRoom;

import java.util.ArrayList;
import org.junit.Test;

public class BuilderPatternTest {
    
    private HiveDirector director = new HiveDirector();

    /**
     * Test that a RestfulHive that has been built has the correct number of rooms.
     */
    @Test
    public void testRestfulHive() {
        
        BeeHiveBuilder restfulHiveBuilder = new RestfulHive();
        director.makeHive(restfulHiveBuilder);
        Hive sleepHive = restfulHiveBuilder.getHive();
        
        int numberSleepRooms = 0;
        int numberSpawningRooms = 0;
        int numberStorageRooms = 0;
        
        ArrayList<Room> sleepHiveRooms = sleepHive.getRooms();
        
        for (int i = 0; i < sleepHiveRooms.size(); i++) {
            if (sleepHiveRooms.get(i) instanceof SleepRoom) {
                numberSleepRooms++;
            } else if (sleepHiveRooms.get(i) instanceof SpawningRoom) {
                numberSpawningRooms++;
            } else if (sleepHiveRooms.get(i) instanceof StorageRoom) {
                numberStorageRooms++;
            }
        }
        
        assertTrue(numberSleepRooms == 3);     
        assertTrue(numberSpawningRooms == 2); 
        assertTrue(numberStorageRooms == 1); 
        
    }
    
    /**
    * Test that a GreedyHive that has been built has the correct number of rooms.
    */
    @Test
    public void testGreedyHive() {
        
        BeeHiveBuilder greedyHiveBuilder = new GreedyHive();
        director.makeHive(greedyHiveBuilder);
        Hive greedyHive = greedyHiveBuilder.getHive();
        
        int numberSleepRooms = 0;
        int numberSpawningRooms = 0;
        int numberStorageRooms = 0;
        
        ArrayList<Room> greedyHiveRooms = greedyHive.getRooms();
        
        for (int i = 0; i < greedyHiveRooms.size(); i++) {
            if (greedyHiveRooms.get(i) instanceof SleepRoom) {
                numberSleepRooms++;
            } else if (greedyHiveRooms.get(i) instanceof SpawningRoom) {
                numberSpawningRooms++;
            } else if (greedyHiveRooms.get(i) instanceof StorageRoom) {
                numberStorageRooms++;
            }
        }
        
        assertTrue(numberSleepRooms == 2);     
        assertTrue(numberSpawningRooms == 1); 
        assertTrue(numberStorageRooms == 3); 
        
    }

}
