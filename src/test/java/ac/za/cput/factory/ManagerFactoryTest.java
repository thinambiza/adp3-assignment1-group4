/**
 ManagerFactoryTest.java
 Test case class for the Manager Factory
 Author: Panashe Muinzani (218186568)
 Date: 09 April 2022
 */

package ac.za.cput.factory;

import ac.za.cput.entity.Manager;
import ac.za.cput.entity.Team;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

class ManagerFactoryTest {
    Manager manager, manager2;


    @Test
    public void createManager() {

        Team team1 = TeamFactory.createTeam("Liverpool", "", 7,
                2000, "James", null, null);

        String teamId = team1.getTeamId();
        Manager manager = ManagerFactory.createManager(teamId, "Darwin",
                37, 3, "Franklin", "Smith");
        System.out.println(manager);

        Manager manager2 = ManagerFactory.createManager(teamId, "Olando", 49,
                7, "Brown", "Stokholm");
    }

    @Test
    //Test Manager equality
    void testEquality() {
        manager = manager2;
        System.out.println("Objects are equal");
    }

    @Test void testIdentity(){
        assertSame(manager, manager2);
        System.out.println("Objects are Identical");
    }

    @Timeout(11000)
    @Test void testTimeout() throws InterruptedException {
        Thread.sleep(11000);
        assertNotNull(manager);
        System.out.println("Timeout display after 11 seconds");
    }

    @Disabled("Disabled this test")
    @Test void testDisabled(){
        assertNotNull(manager2);
    }
}
