/**
 * Tournament.java
 * Tournament Factory
 * Author: Melisa Bhixa 217131085
 * Date: 4 April 2022
 */

package ac.za.cput.factory.game;


import ac.za.cput.domain.game.Tournament;
import ac.za.cput.util.Helper;

public class TournamentFactory {
    public static Tournament newTournament(String name, int maxTeams){
        String id = "tn-"+ Helper.generateId();
        return new Tournament.Builder()
                .setId(id)
                .setTournamentName(name)
                .setMaxNumberOfTeams(maxTeams)
                .build();
    }
}


