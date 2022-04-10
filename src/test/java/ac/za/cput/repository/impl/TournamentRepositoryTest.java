/**
 * Tournament Stats.java
 * Tournament Stats Repository Test
 * Author: Melisa Bhixa 217131085
 * Date:10 April 2022
 */

package ac.za.cput.repository.impl;

import ac.za.cput.entity.Tournament;
import ac.za.cput.factory.TournamentFactory;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class TournamentRepositoryTest {

    private static Faker data = new Faker();
    private static TournamentRepository repository = TournamentRepository.getRepository();

    private static Tournament tournament = TournamentFactory
                                            .createTournament(data.code().asin(),
                                            data.esports().event(),
                                            data.esports().league(),
                                            data.random().nextInt(4, 32));

    @Test
    void a_create() {
        Tournament created = repository.create(tournament);
        assertNotNull(created);
        assertEquals(created.getTournamentId(), tournament.getTournamentId());
        System.out.println("Create: \n" + created);
    }

    @Test
    void b_read() {
        Tournament read = repository.read(tournament.getTournamentId());
        assertNotNull(read);
        assertEquals(read.getTournamentId(), tournament.getTournamentId());
        System.out.println("Read:\n" + read);
    }

    @Test
    void c_update() {
        Tournament updated = new Tournament.TournamentBuilder().copy(tournament).setTournamentType(data.esports().league()).build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated:\n"+ updated);
    }


    @Test
    void d_delete() {
        boolean success = repository.delete(tournament.getTournamentId());
        assertTrue(success);
        System.out.println("Delete:\n"+ success);
    }

    @Test
    void e_getAll() {
        Set<Tournament> tournamentSet = repository.getAll();
        assertEquals(0, tournamentSet.size());
        System.out.println("Show All");
        System.out.println(repository.getAll());
    }
}
