/**
 PlayerStatsRepository.java
 Repository for PlayerStats
 Author: Zuko Fukula (217299911)
 Date: 08 April 2022
 */

package ac.za.cput.repository.impl;

import ac.za.cput.entity.PlayerStats;
import java.util.HashSet;
import java.util.Set;

public class PlayerStatsRepository implements IPlayerStatsRepository
{

    private static PlayerStatsRepository repository = null;
    private Set<PlayerStats> playerStatsDB = null;

    public PlayerStatsRepository(){
        this.playerStatsDB= new HashSet<>();
    }

    public static PlayerStatsRepository getRepository(){
        if (repository == null)
        {
            repository = new PlayerStatsRepository();
        }
        return repository;
    }

    @Override
    public PlayerStats create(PlayerStats playerStats){
        boolean success = playerStatsDB.add(playerStats);
        if(!success){
            return null;
        }
        return playerStats;
    }

    @Override
    public PlayerStats read(String playerID){
        for (PlayerStats playerStats : this.playerStatsDB){
            if (playerStats.getPlayerID().equalsIgnoreCase(playerID));{
                return playerStats;
            }

        }
        return null;
    }

    @Override
    public PlayerStats update(PlayerStats playerStats) {
        delete(playerStats.getPlayerID());

        this.playerStatsDB.add(playerStats);
        return playerStats;
    }

    @Override
    public boolean delete(String ps) {
        PlayerStats deletePlayerStats = read(ps);
        this.playerStatsDB.remove(deletePlayerStats);
        return true;
    }

    @Override
    public Set<PlayerStats> getAll() {
        return playerStatsDB;
    }
}
