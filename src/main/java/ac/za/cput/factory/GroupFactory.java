/*
 * Group Factory
 * GroupFactory.java
 * Thina Mbiza 217217095
 * 4 April 2022
 */

package ac.za.cput.factory;
import ac.za.cput.entity.Group;
import ac.za.cput.entity.Team;

public class GroupFactory {

    public static Group createGroup (String groupId, int numOfTeams, char groupLetter, int numOfFixtures, Team winner, String teamLogs){

        return new Group.Builder()
                .setGroupId(groupId)
                .setNumOfTeams(numOfTeams)
                .setGroupLetter(groupLetter)
                .setNumOfFixtures(numOfFixtures)
                .setWinner(winner)
                .setTeamLogs(teamLogs)
                .build();
    }
}
