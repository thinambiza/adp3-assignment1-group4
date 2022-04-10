/**
 PlayerStatsFactoryTest.java
 Test case class for the PlayerStats Factory
 Author: Zuko Fukula (217299911)
 Date: 08 April 2022
 */

package ac.za.cput.factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import ac.za.cput.entity.PlayerStats;

import static org.junit.jupiter.api.Assertions.*;

class PlayerStatsFactoryTest {

    @Timeout(5)
    @Test
    //Valid input test
    public void PlayerStats(){
        PlayerStats playerStats = PlayerStatsFactory.createPlayerStats("Ply1",11, 5, 250, 23, 15, 50, 0);
        assertNull(playerStats.getPlayerID());
    }
    @Test
    //PlayerStats equality test
    public void PlayerStatsNumberOfGoals(){
        PlayerStats playerStats = PlayerStatsFactory.createPlayerStats("Ply1",11, 5, 250, 23, 15, 50, 0);
        System.out.println("Number of Goals: "+playerStats.getNumberOfGoals());
        assertEquals(11,playerStats.getNumberOfGoals());
    }


    @Disabled("Test Disabled")
    @Test
    //Disable Test
    public void PlayerStatsD(){
        PlayerStats playerStats = PlayerStatsFactory.createPlayerStats("Ply1",11, 5, 250, 23, 15, 50, 0);
        assertSame(11,playerStats.getNumberOfGoals());
    }
}
