/**
 PlayerRepository.java
 Repository class for the Player
 Author: Thina Mbiza 217217095
 Date: 10 April 2022
 */

package ac.za.cput.repository.impl;

import ac.za.cput.entity.Player;
import java.util.HashSet;
import java.util.Set;

public class PlayerRepository implements IPlayerRepository {

    private static ac.za.cput.repository.impl.PlayerRepository repository = null;
    private Set<Player> playerDatabase = null;

    private PlayerRepository(){
        playerDatabase = new HashSet<Player>();
    }

    public static ac.za.cput.repository.impl.PlayerRepository getRepository(){
        if (repository == null){
            repository = new ac.za.cput.repository.impl.PlayerRepository();
        }
        return repository;
    }


    public Player create(Player player) {
        boolean success = playerDatabase.add(player);
        if (!success){
            return null;
        }
        return player;
    }


    public Player read(String playerId) {
        for (Player player : playerDatabase)
            if (player.getPlayerId().equalsIgnoreCase(playerId)){
                return player;
            }
        return null;
    }


    public Player update(Player player) {
        Player oldPlayer = read(player.getPlayerId());
        if (oldPlayer != null){
            playerDatabase.remove(oldPlayer);
            playerDatabase.add(player);
            return player;
        }
        return null;
    }


    public boolean delete(String playerId) {
        Player playerToDelete = read(playerId);
        if (playerToDelete == null)
            return false;
        playerDatabase.remove(playerToDelete);
        return false;
    }

    public Set<Player> getAll() {
        return playerDatabase;
    }
}


