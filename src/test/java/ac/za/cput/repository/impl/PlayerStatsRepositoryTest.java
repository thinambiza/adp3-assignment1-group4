/**
 PlayerStatsRepositoryTest.java
 Test case class for the PlayerStats Repository
 Author: Zuko Fukula (217299911)
 Date: 08 April 2022
 */

package ac.za.cput.repository.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ac.za.cput.entity.PlayerStats;
import ac.za.cput.factory.PlayerStatsFactory;

class PlayerStatsRepositoryTest {

    private static IPlayerStatsRepository repository = PlayerStatsRepository.getRepository();

    private static PlayerStats playerStats = PlayerStatsFactory.createPlayerStats("Ply1",11, 5, 250, 23, 15, 50, 0);


    @Test
    void create() {
        Assertions.assertNotNull(repository.create(playerStats));

        System.out.println(repository.create(playerStats));
    }

    @Test
    void read() {
        PlayerStats readPlayerStats = repository.read(playerStats.getPlayerID());

        Assertions.assertEquals("Ply1", readPlayerStats.getPlayerID());
        System.out.println("Read: " + readPlayerStats);
    }

    @Test
    void update() {
        System.out.println("Pre-update: "+ playerStats.toString());

        PlayerStats newPlayerStats = new PlayerStats.Builder().copy(playerStats).setPlayerID("Ply2").build();
        PlayerStats updatedPlayerStats = repository.update(newPlayerStats);

        Assertions.assertEquals("Ply2",updatedPlayerStats.getPlayerID());

        System.out.println("Post-update: "+ updatedPlayerStats);
        System.out.println("Get all: ");
        getAll();
    }

    @Test
    void delete() {
        repository.delete(playerStats.getPlayerID());

        System.out.println(repository.getAll());
    }

    @Test
    void getAll() {
        Assertions.assertNotNull(repository.getAll());

        System.out.println(repository.getAll());
    }
}
