/**
 * InGame Stats.java
 * InGame Stats Repository Test
 * Author: Melisa Bhixa 217131085
 * Date:10 April 2022
 */

package ac.za.cput.repository.impl;

import ac.za.cput.entity.InGameStats;
import ac.za.cput.factory.InGameStatsFactory;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class InGameStatsRepositoryTest {

    private static Faker data = new Faker();
    private static InGameStatsRepository repository = InGameStatsRepository.getRepository();

    private static InGameStats inGameStatsFactory = InGameStatsFactory
            .createInGameStats(data.code().asin(),
                    data.random().nextInt(10),
                    data.random().nextInt(10),
                    data.random().nextInt(10),
                    data.random().nextInt(10),
                    data.random().nextInt(10),
                    data.random().nextInt(10),
                    data.random().nextInt(10),
                    data.random().nextInt(10),
                    data.random().nextInt(10),
                    data.code().asin());

    @Test
    void a_create() {
        InGameStats created = repository.create(inGameStatsFactory);
        assertNotNull(created);
        assertEquals(created.getFixtureIdId(), inGameStatsFactory.getFixtureIdId());
        System.out.println("Create: \n" + created);
    }

    @Test
    void b_read() {
        InGameStats read = repository.read(inGameStatsFactory.getFixtureIdId());
        assertNotNull(read);
        assertEquals(read.getFixtureIdId(), inGameStatsFactory.getFixtureIdId());
        System.out.println("Read:\n" + read);
    }

    @Test
    void c_update() {
        InGameStats updated = new InGameStats.InGameStatsBuilder().copy(inGameStatsFactory).setNumberOfGoalsScored(2).build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated:\n"+ updated);
    }


    @Test
    void d_delete() {
        boolean success = repository.delete(inGameStatsFactory.getFixtureIdId());
        assertTrue(success);
        System.out.println("Delete:\n"+ success);
    }

    @Test
    void e_getAll() {
        Set<InGameStats> inGameStatsSet = repository.getAll();
        assertEquals(0, inGameStatsSet.size());
        System.out.println("Show All");
        System.out.println(repository.getAll());
    }
}
