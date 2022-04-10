package ac.za.cput.repository.impl;

import ac.za.cput.entity.Log;
import ac.za.cput.entity.Player;
import ac.za.cput.factory.PlayerFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerRepositoryTest {

    private static IPlayerRepository repository = (PlayerRepository) PlayerRepository.getRepository();
    private static Player player = PlayerFactory.createPlayer("B", 2, "Thina", "Mosiea", "Mbiza", 25, 7,"Pirates", 10, 2);

    @Test
    void create() {
        Assertions.assertNotNull(repository.create(player));
        System.out.println(repository.create(player));
    }


    @Test
    void read() {
        Player read = repository.read(player.getPlayerId());
        System.out.println("Read " + read);
    }

    @Test
    void update() {
        Player updatedPlayer = new Player.Builder().copy(player).setPlayerId("A").build();
        System.out.println("Updated " + updatedPlayer);

        Assertions.assertEquals(2,updatedPlayer.getPlayerId());

        System.out.println("Post-update: "+ updatedPlayer);
        System.out.println("Get all: ");
        getAll();
    }

    @Test
    void delete() {
        repository.delete(player.getPlayerId());
        System.out.println(repository.getAll());
    }

    @Test
    void getAll() {
        Assertions.assertNotNull(repository.getAll());
        System.out.println(repository.getAll());
    }

}