/**
 LogFactory.java
 Entity for the LogFactory
 Author: Zuko Fukula (217299911)
 Date: 31 March 2022
 */


package ac.za.cput.factory;

import ac.za.cput.entity.Log;

public class LogFactory {

    public static Log createLog(String groupID, String logID, String teamID, int points, int gamesPlayed, int goalsFor, int goalsAgainst, int goalDifference, int position){

        return new Log.Builder().setGroupID(groupID).setLogID(logID).setTeamID(teamID).setPoints(points).setGamesPlayed(gamesPlayed).setGoalsFor(goalsFor).setGoalsAgainst(goalsAgainst).setGoalDifference(goalDifference).setPosition(position).build();
    }


}
