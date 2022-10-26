/**
 PlayerStatsFactory.java
 Factory for PlayerStats
 Author: Zuko Fukula (217299911)
 Date: 31 March 2022
 */

package ac.za.cput.factory.info;

import ac.za.cput.domain.info.PlayerStats;
import ac.za.cput.util.Helper;

public class PlayerStatsFactory {
    public static PlayerStats newPlayerStats(int goals, int assists, int saves){
        String id = "pls-"+Helper.generateId();
        return new PlayerStats.Builder()
                .setId(id)
                .setGoalsScored(goals)
                .setAssistsMade(assists)
                .setGoalsSaved(saves)
                .build();
    }
}
