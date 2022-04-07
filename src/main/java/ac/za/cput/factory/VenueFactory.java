/**
 VenueFactory.java
 Factory for the Venue
 Author: Legiste Ndabashinze (217046207)
 Date: 31 March 2022
 */

package ac.za.cput.factory;

import ac.za.cput.entity.Venue;
import ac.za.cput.util.Helper;

public class VenueFactory {

    public static Venue createVenue(String fixtureId, String teamId, String stadiumName, int capacity, String weather){

        String venueId = Helper.generateID();
        return new Venue.VenueBuilder()
                .setVenueId(venueId)
                .setFixtureId(fixtureId)
                .setTeamId(teamId)
                .setStadiumName(stadiumName)
                .setCapacity(capacity)
                .setWeather(weather)
                .build();

    }

}
