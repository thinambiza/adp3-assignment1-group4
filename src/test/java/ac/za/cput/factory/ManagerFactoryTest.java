/**
 ManagerFactoryTest.java
 Test case class for the Manager Factory
 Author: Panashe Muinzani (218186568)
 Date: 09 April 2022
 */

package ac.za.cput.factory;

import ac.za.cput.entity.Manager;
import ac.za.cput.entity.Team;
import org.junit.jupiter.api.Test;

class ManagerFactoryTest {

    @Test
    void createManager() {

        Team team = TeamFactory.createTeam("Liverpool", "", 7,
                2000, "James", null,  null);

        String teamId = team.getTeamId();
        Manager manager = ManagerFactory.createManager(teamId, "Darwin",
                37, 3, "Franklin", "Smith");
        System.out.println(manager);
        }
    }

