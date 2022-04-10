/**
 VenueRepositoryTest.java
 Test case class for the Fixture Venue
 Author: Legiste Ndabashinze (217046207)
 Date: 07 April 2022
 */

package ac.za.cput.repository.impl;

import ac.za.cput.entity.Fixture;
import ac.za.cput.entity.Venue;
import ac.za.cput.factory.FixtureFactory;
import ac.za.cput.factory.VenueFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VenueRepositoryTest {


    private static Fixture fixture = FixtureFactory.createFixture(null, null, null, null, "Knockout", 0, 0);
    private static VenueRepository repository = VenueRepository.getRepository();
    private static Venue venue = VenueFactory.createVenue(
            fixture.getFixtureId(),
            "115-4489",
            "Etihad",
            55097,
            "Sunny"

    );

    @Test
    void a_create() {
        Venue created = repository.create(venue);
        assertNotNull(created);
        assertEquals(created.getVenueId(), venue.getVenueId());
        System.out.println("Created: \n"+ created);
    }

    @Test
    void b_read() {
        a_create();
        Venue read = repository.read(venue.getVenueId());
        assertNotNull(read);
        assertEquals(read.getVenueId(), venue.getVenueId());
        System.out.println("Read: \n"+ read);
    }

    @Test
    void update() {
        a_create();
        Venue updated = new Venue.VenueBuilder().copy(venue).setStadiumName("Etihad Stadium").setWeather("Rainy").build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: \n" +updated);
    }

    @Test
    void delete() {
        a_create();
        boolean success = repository.delete(venue.getVenueId());
        assertTrue(success);
    }

    @Test
    void getAll() {
        System.out.println("Show All");
        System.out.println(repository.getAll());
    }
}