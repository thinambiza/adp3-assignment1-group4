/*
 * Player Factory
 * PlayerFactory.java
 * Thina Mbiza 217217095
 * 4 April 2022
 */


package ac.za.cput.factory;

import ac.za.cput.entity.Player;

public class PlayerFactory {

    public static Player createPlayer(String playerId, String teamId, String firstName, String middleName, String lastName, int age, int position, String team, int goals, int assists) {

        return new Player.Builder()
                .setPlayerId(playerId)
                .setTeamId(teamId)
                .setFirstName(firstName)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .setAge(age)
                .setPosition(position)
                .setTeam(team)
                .setGoals(goals)
                .setAssists(assists)
                .build();
    }

}
