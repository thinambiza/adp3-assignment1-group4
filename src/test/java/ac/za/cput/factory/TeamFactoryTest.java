/**
 TeamFactoryTest.java
 Test case class for the Team Factory
 Author: Panashe Muinzani (218186568)
 Date: 09 April 2022
 */

package ac.za.cput.factory;

import ac.za.cput.entity.Team;
import ac.za.cput.entity.Venue;
import org.junit.jupiter.api.Test;

class TeamFactoryTest {

@Test
void createTeam(){

        Venue venue = VenueFactory.createVenue("", "", "",
                                                300, "");

        String venueId = venue.getVenueId();
        Team team = TeamFactory.createTeam(venueId, "Liverpool", 3, 1997,
                                                 "Jack", "Xolisi", "Josh, Kane, Lukaku, Messi, Ronald, MoSalah, Mbappe, Zack, Jaden");
        System.out.println(team);
        }
}