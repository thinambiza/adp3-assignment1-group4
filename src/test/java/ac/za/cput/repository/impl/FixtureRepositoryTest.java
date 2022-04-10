/**
 FixtureRepositoryTest.java
 Test case class for the Fixture Repository
 Author: Legiste Ndabashinze (217046207)
 Date: 07 April 2022
 */

package ac.za.cput.repository.impl;

import ac.za.cput.entity.Fixture;
import ac.za.cput.entity.Referee;
import ac.za.cput.entity.Team;
import ac.za.cput.factory.FixtureFactory;
import ac.za.cput.factory.RefereeFactory;
import ac.za.cput.factory.TeamFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class FixtureRepositoryTest {

    private static Team homeTeam = TeamFactory.createTeam("Home Team Name", "156-456", 0, 2021, null, null, null);

    private static Team awayTeam = TeamFactory.createTeam("Away Team Name", "148-336", 1, 2021, null, null, null);

    private static Referee referee = RefereeFactory.createReferee("879-233",
            "John", "", "Lastname", 10);

    private static FixtureRepository repository = FixtureRepository.getRepository();
    private static Fixture fixture = FixtureFactory.createFixture(
            null,
            homeTeam,
            awayTeam,
            referee,
            "Knockout",
            0,
            0);

    @Test
    void a_create() {
        Fixture created = repository.create(fixture);
        assertNotNull(created);
        assertEquals(created.getFixtureId(), fixture.getFixtureId());
        System.out.println("Create: \n" +created);
    }

    @Test
    void b_read() {
        //a_create();
        Fixture read = repository.read(fixture.getFixtureId());
        assertNotNull(read);
        assertEquals(read.getFixtureId(), fixture.getFixtureId());
        System.out.println("Read:\n" + read);
    }

    @Test
    void c_update() {
        //a_create();
        Fixture updated = new Fixture.FixtureBuilder().copy(fixture).setHomeScore(2).setAwayScore(1).build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated:\n"+ updated);
    }


    @Test
    @Disabled
    void e_delete() {
        boolean success = repository.delete(fixture.getFixtureId());
        assertTrue(success);
        //System.out.println("Delete:\n"+ success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show All");
        System.out.println(repository.getAll());
    }


}