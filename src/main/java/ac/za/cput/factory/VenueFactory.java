/**
 VenueFactory.java
 Factory for the Venue
 Author: Legiste Ndabashinze (217046207)
 Date: 31 March 2022
 */

package ac.za.cput.factory;

import ac.za.cput.entity.Venue;

public class VenueFactory {

    public static Venue createVenue(String venueId, String fixtureId, String teamId, String staduimName, int capacity, String weather){

        return new Venue.VenueBuilder()
                .setVenueId(venueId)
                .setFixtureId(fixtureId)
                .setTeamId(teamId)
                .setStadiumName(staduimName)
                .setCapacity(capacity)
                .setWeather(weather)
                .build();

    }

}
