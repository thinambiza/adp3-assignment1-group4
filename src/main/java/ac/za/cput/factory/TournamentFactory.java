/**
 * Tournament.java
 * Tournament Factory
 * Author: Melisa Bhixa 217131085
 * Date: 4 April 2022
 */

package ac.za.cput.factory;


import ac.za.cput.entity.Tournament;

public class TournamentFactory {
    public static Tournament createTournament(String tournamentId, String tournamentName, String tournamentType, int numberOfTeams) {

        Tournament tournament = null;

        if (tournamentId.trim().isEmpty()) {
            System.out.println("Please enter Tournament Id");

        } else if (tournamentName.trim().isEmpty()) {
            System.out.println("Please enter Team Id");

        } else if (tournamentType.trim().isEmpty()) {
            System.out.println("Please enter tournament Type");

        } else {
            tournament = new Tournament.TournamentBuilder()
                    .setTournamentId(tournamentId)
                    .setTournamentName(tournamentName)
                    .setTournamentType(tournamentType)
                    .setNumberOfTeams(numberOfTeams)
                    .build();
        }
        return tournament;
    }
}

