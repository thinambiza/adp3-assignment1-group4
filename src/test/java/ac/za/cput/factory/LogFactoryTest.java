/**
 LogFactoryTest.java
 Test case class for the Log Factory
 Author: Zuko Fukula (217299911)
 Date: 08 April 2022
 */

package ac.za.cput.factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import ac.za.cput.entity.Log;

import static org.junit.jupiter.api.Assertions.*;

class LogFactoryTest {

    @Timeout(5)
    @Test
    //Valid input test
    public void Log(){
        Log log = LogFactory.createLog("A", "L1", "T1", 65, 32, 80, 30, 50, 2);
        assertNull(log.getLogID());
    }
    @Test
    //Log points equality test
    public void Points(){
        Log log = LogFactory.createLog("A", "L1", "T1", 65, 32, 80, 30, 50, 2);
        System.out.println("Points: "+log.getPoints());
        assertEquals(65,log.getPoints());
    }


    @Disabled("Test Disabled")
    @Test
    //Disable Test
    public void LogPoints(){
        Log log = LogFactory.createLog("A", "L1", "T1", 65, 32, 80, 30, 50, 2);
        assertSame(65,log.getPoints());
    }
}
