/**
 LogFactory.java
 Entity for the LogFactory
 Author: Zuko Fukula (217299911)
 Date: 31 March 2022
 */


package ac.za.cput.factory.info;

import ac.za.cput.domain.info.TeamStats;
import ac.za.cput.util.Helper;

public class TeamStatsFactory {
    public static TeamStats newTeamStats(String teamId, String teamName, String tournamentId,int points, int gamesPlayed, int goalsFor, int goalsAgainst, int goalDifference){
        String id = "ts-"+ Helper.generateId();
        return new TeamStats.Builder()
                .setId(id)
                .setTeamId(teamId)
                .setTeamName(teamName)
                .setTournamentId(tournamentId)
                .setPoints(points)
                .setGamesPlayed(gamesPlayed)
                .setGoalsFor(goalsFor)
                .setGoalsAgainst(goalsAgainst)
                .setGoalDifference(goalDifference)
                .build();
    }
}
