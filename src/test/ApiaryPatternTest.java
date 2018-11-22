package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import singletonpattern.Apiary;
import singletonpattern.Hive;

public class ApiaryPatternTest {
    
    @Test
    public void testApiaryAddHive() {
        Apiary myApiary = Apiary.getApiary();
        
        //Now add some hives to that apiary
        myApiary.addHive(1);
        myApiary.addHive(2);
        myApiary.addHive(3);
        
        assertFalse(myApiary.addHive(1));
    }

    @Test
    public void testApiaryPattern() {
        
        Apiary myApiary1 = Apiary.getApiary();
        
        //Now add some hives to that apiary
        myApiary1.addHive(1);
        myApiary1.addHive(2);
        myApiary1.addHive(3);
        
        //Lets try and get a second apiary
        Apiary myApiary2 = Apiary.getApiary();
        
        //And add different hives to it
        myApiary2.addHive(4);
        myApiary2.addHive(5);
        myApiary2.addHive(6);

        assertTrue(myApiary1 == myApiary2);
        
        ArrayList<Hive> hiveList1 = myApiary1.getHives();
        ArrayList<Hive> hiveList2 = myApiary2.getHives();
        
        for (int i = 0; i < hiveList1.size(); i++) {
            assertTrue(hiveList1.get(i).getId() == hiveList2.get(i).getId());
        }

    }

}
