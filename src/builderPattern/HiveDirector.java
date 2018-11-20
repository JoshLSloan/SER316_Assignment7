package builderPattern;

public class HiveDirector {

    public void makeHive(BeeHiveBuilder beeHiveBuilder) {
        beeHiveBuilder.addRoom1();
        beeHiveBuilder.addRoom2();
        beeHiveBuilder.addRoom3();
        beeHiveBuilder.addRoom4();
        beeHiveBuilder.addRoom5();
        beeHiveBuilder.addRoom6();
    }
}
