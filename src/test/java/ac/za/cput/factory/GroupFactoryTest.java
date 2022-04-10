/**
 GroupFactoryTest.java
 Test case class for the Group Factory
 Author: Thina Mbiza 217217095
 Date: 10 April 2022
 */


package ac.za.cput.factory;

import ac.za.cput.entity.Group;
import ac.za.cput.entity.Log;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;


class GroupFactoryTest {

    @Test
    void createGroup() {
        Group group = GroupFactory.createGroup("B", 2, "P", 16, "Pirates", "T1");
        System.out.println(group);
    }

    @Test
    //Group Winner equality test
    public void Winner(){
        Group group = GroupFactory.createGroup("B", 2, "P", 16, "Pirates", "T1");
        System.out.println("Winner: "+group.getWinner());
        assertEquals("Pirates",group.getWinner());
    }

    @Test
    public void testForIdentity() {
        assertSame("16", "16");
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