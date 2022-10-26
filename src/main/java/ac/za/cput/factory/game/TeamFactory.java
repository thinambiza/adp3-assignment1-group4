/**
 TeamFactory.java
 Team Factory
 Author: Panashe Muinzani (218186568)
 Date: 2 April 2022
 */

package ac.za.cput.factory.game;


import ac.za.cput.domain.game.Team;
import ac.za.cput.util.Helper;

public class TeamFactory {

    public Team newTeam(String name, int titlesWon){

        String id = "tm-"+ Helper.generateId();

        return new Team.Builder()
                .setId(id)
                .setTeamName(name)
                .setTitlesWon(titlesWon)
                .build();
    }
}