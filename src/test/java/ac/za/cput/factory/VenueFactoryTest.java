/**
 VenueFactoryTest.java
 Test case class for the Venue Factory
 Author: Legiste Ndabashinze (217046207)
 Date: 07 April 2022
 */

package ac.za.cput.factory;

import ac.za.cput.entity.Fixture;
import ac.za.cput.entity.Team;
import ac.za.cput.entity.Venue;
import org.junit.jupiter.api.Test;

class VenueFactoryTest {

    @Test
    void createVenue() {
        Fixture fixture = FixtureFactory.createFixture(null, null, null, null, "", 0, 0);
        Team team = TeamFactory.createTeam("Team-id", null, null, 0, 2020, null, null, null);
        String fixtureId = fixture.getFixtureId();
        String teamId = team.getTeamId();

        Venue venue = VenueFactory.createVenue(fixtureId, teamId, "Etihad Stadium", 55097, "Sunny");
        System.out.println(venue);
    }
}