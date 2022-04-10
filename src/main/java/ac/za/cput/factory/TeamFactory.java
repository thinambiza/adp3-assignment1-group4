/**
 TeamFactory.java
 Team Factory
 Author: Panashe Muinzani (218186568)
 Date: 2 April 2022
 */

package ac.za.cput.factory;
import ac.za.cput.entity.Team;
import ac.za.cput.util.Helper;


public class TeamFactory {

    public static Team createTeam(String venueId, String teamName,  int numberOfTrophies,
                                  int yearEstablished, String manager, String captain, String players){

        String teamId = Helper.generateID();
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

