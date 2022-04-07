/**
 RefereeRepositoryTest.java
 Test case class for the Fixture Referee
 Author: Legiste Ndabashinze (217046207)
 Date: 07 April 2022
 */

package ac.za.cput.repository.impl;

import ac.za.cput.entity.Fixture;
import ac.za.cput.entity.Referee;
import ac.za.cput.factory.FixtureFactory;
import ac.za.cput.factory.RefereeFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RefereeRepositoryTest {

    private static Fixture fixture = FixtureFactory.createFixture(null, null, null, null, "Knockout", 0, 0);

    private static RefereeRepository repository = RefereeRepository.getRepository();
    private static Referee referee = RefereeFactory.createReferee(
            fixture.getFixtureId(),
            "John",
            "William",
            "Herschel",
            12

    );

    @Test
    void a_create() {
        Referee created = repository.create(referee);
        assertNotNull(created);
        assertEquals(created.getRefereeId(), referee.getRefereeId());
        System.out.println("Create: \n" +created);
    }

    @Test
    void b_read() {
        a_create(); // Uncomment if executing the test by itself
        Referee read = repository.read(referee.getRefereeId());
        assertNotNull(read);
        assertEquals(read.getRefereeId(), referee.getRefereeId());
        System.out.println("Read:\n" + read);
    }

    @Test
    void c_update() {
        a_create();
        Referee updated = new Referee.RefereeBuilder().copy(referee).setMiddleName("Fredrick William").build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: \n"+updated);
    }

    @Test
    @Disabled
    void e_delete() {
        a_create();
        boolean success = repository.delete(referee.getRefereeId());
        assertTrue(success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}