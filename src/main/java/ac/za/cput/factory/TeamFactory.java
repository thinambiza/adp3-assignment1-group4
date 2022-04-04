/**
 TeamFactory.java
 Team Factory
 Author: Panashe Muinzani (218186568)
 Date: 2 April 2022
 */

package ac.za.cput.factory;
import ac.za.cput.entity.Team;
import ac.za.cput.entity.Manager;
import ac.za.cput.entity.Player;

public class TeamFactory {

    public static Team createTeam(String teamId, String teamName, String venueId, int numberOfTrophies,
                                  int yearEstablished, Manager manager, Player captain, Player players){

        return new Team.Builder()
                .setTeamId(teamId)
                .setTeamName(teamName)
                .setVenueId(venueId)
                .setNumberOfTrophies(numberOfTrophies)
                .setYearEstablished(yearEstablished)
                .setManager(manager)
                .setCaptain(captain)
                .setPlayers(players)
                .build();
    }
}

