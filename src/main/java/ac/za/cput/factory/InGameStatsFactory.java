/**
 * Tournament.java
 * InGame Stats Factory
 * Author: Melisa Bhixa 217131085
 * Date: 4 April 2022
 */

package ac.za.cput.factory;

import ac.za.cput.entity.InGameStats;

public class InGameStatsFactory {

    public static InGameStats createInGameStats(String fixtureId, int numberOfCorners, int numberOfRedCards, int numberOfFreeKicks, int possession,
                                                int numberOfShotsOnTarget, int numberOfShots, int numberOfPasses, int numberOfGoalsConceded,
                                                int numberOfGoalsScored, String teamId) {
        InGameStats InGameStats = null;

        if (fixtureId.trim().isEmpty()) {
            System.out.println("Please enter Fixture Id");

        } else if (teamId.trim().isEmpty()) {
            System.out.println("Please enter Team Id");

        } else {
            InGameStats = new InGameStats.InGameStatsBuilder()
                    .setFixtureId(fixtureId)
                    .setNumberOfCorners(numberOfCorners)
                    .setNumberOfRedCards(numberOfRedCards)
                    .setNumberOfFreeKicks(numberOfFreeKicks)
                    .setPossession(possession)
                    .setNumberOfShotsOnTarget(numberOfShotsOnTarget)
                    .setNumberOfShots(numberOfShots)
                    .setNumberOfPasses(numberOfPasses)
                    .setNumberOfGoalsConceded(numberOfGoalsConceded)
                    .setNumberOfGoalsScored(numberOfGoalsScored)
                    .setTeamId(teamId)
                    .build();
        }
        return InGameStats;
    }
}

