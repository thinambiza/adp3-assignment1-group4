/**
 * Tournament.java
 * Game Stats Factory
 * Author: Melisa Bhixa 217131085
 * Date: 4 April 2022
 */

package ac.za.cput.factory.info;

import ac.za.cput.domain.info.GameStats;
import ac.za.cput.util.Helper;

public class GameStatsFactory {
    public static GameStats newGameStats(String teamId, String fixtureId, String teamName, int goalsScored, int goalsConceded, int corners, int yellowCards, int redCards, int freeKicks){
        String id = "gst-"+ Helper.generateId();
        return new GameStats.Builder()
                .setId(id)
                .setFixtureId(fixtureId)
                .setTeamId(teamId)
                .setTeamName(teamName)
                .setGoalsScored(goalsScored)
                .setGoalsConceded(goalsConceded)
                .setCorners(corners)
                .setYellowCards(yellowCards)
                .setRedCards(redCards)
                .setFreeKicks(freeKicks)
                .build();
    }
}


