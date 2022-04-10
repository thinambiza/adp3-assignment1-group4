/**
 TeamFactoryTest.java
 Test case class for the Team Factory
 Author: Panashe Muinzani (218186568)
 Date: 09 April 2022
 */

package ac.za.cput.factory;

import ac.za.cput.entity.Manager;
import ac.za.cput.entity.Team;
import ac.za.cput.entity.Venue;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class TeamFactoryTest {
        Team team, team2;


        @Test
void createTeam(){

        Venue venue = VenueFactory.createVenue("", "", "",
                                                300, "");

        String venueId = venue.getVenueId();
        Team team = TeamFactory.createTeam(venueId, "Liverpool", 3, 1997,
                                                 "Jack", "Xolisi", "Josh, Kane, Lukaku, Messi, Ronald, MoSalah, Mbappe, Zack, Jaden");
        System.out.println(team);

        Team team2 = TeamFactory.createTeam(venueId, "Mancity", 5, 1987,
                                        "Lukaku", "Brian", "");
        }
        @Timeout(11000)
        @Test void testTimeout() throws InterruptedException {
                Thread.sleep(11000);
                assertNotNull(team);
                System.out.println("Timeout display after 11 seconds");
        }

        @Disabled("Disabled this test")
        @Test void testDisabled(){
                assertNotNull(team2);
        }
}