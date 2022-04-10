/**
 * Player Factory Test
 * Player.java
 * Thina Mbiza 217217095
 * 10 April 2022
 */

package ac.za.cput.factory;

import ac.za.cput.entity.Group;
import ac.za.cput.entity.Player;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class PlayerFactoryTest {

    @Test
    void createPlayer() {
        Player player = PlayerFactory.createPlayer("B", 2, "Thina", "Mosiea", "Mbiza", 25, 7,"Pirates", 10, 2);
        System.out.println(player);
    }

    @Test
    //Group Position equality test
    public void Position(){
        Player player = PlayerFactory.createPlayer("B", 2, "Thina", "Mosiea", "Mbiza", 25, 7,"Pirates", 10, 2);
        System.out.println("Position: "+player.getPosition());
        assertEquals(7,player.getPosition());
    }

    @Test
    public void testForIdentity() {
        assertSame("Pirates", "Pirates");
    }

    @Test
    @org.junit.jupiter.api.Timeout(value = 1000, unit = TimeUnit.NANOSECONDS)
    public void testTimeout() {
        System.out.println("Setting the Timeout");
    }

    @Disabled("Test Disabled")
    @Test
    public void testDisable(){
        Group group = GroupFactory.createGroup("B", 2, "P", 16, "Pirates", "T1");
        assertSame("Pirates",group.getWinner());
        //  org.junit.jupiter.api.Assertions.fail("This test should fail. Program still being developed");
    }

}