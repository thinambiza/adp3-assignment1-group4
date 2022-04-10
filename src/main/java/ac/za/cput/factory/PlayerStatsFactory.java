/**
 PlayerStatsFactory.java
 Entity for the PlayerStatsFactory
 Author: Zuko Fukula (217299911)
 Date: 31 March 2022
 */

package ac.za.cput.factory;

import ac.za.cput.entity.PlayerStats;
import ac.za.cput.util.Helper;

public class PlayerStatsFactory {

    public static PlayerStats createPlayerStats(String playerID, int numberOfGoals, int numberOfAssists, int numberOfPassesCompleted, int numberOfAppearances, int numberOfHeadersWon, int numberOfTacklesWon, int numberOfSavesMade){

        String fixtureID = Helper.generateID();
        return new PlayerStats.Builder().setFixtureID(fixtureID).setPlayerID(playerID).setNumberOfGoals(numberOfGoals).setNumberOfAssists(numberOfAssists).setNumberOfPassesCompleted(numberOfPassesCompleted).setNumberOfAppearances(numberOfAppearances).setNumberOfHeadersWon(numberOfHeadersWon).setNumberOfTacklesWon(numberOfTacklesWon).setNumberOfSavesMade(numberOfSavesMade).build();

    }
}
