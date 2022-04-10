/**
 FixtureFactory.java
 Factory for the Fixture
 Author: Legiste Ndabashinze (217046207)
 Date: 31 March 2022
 */

package ac.za.cput.factory;

import ac.za.cput.entity.Fixture;
import ac.za.cput.entity.Referee;
import ac.za.cput.entity.Team;
import ac.za.cput.util.Helper;

public class FixtureFactory {

    public static Fixture createFixture(String groupId, Team homeTeam, Team awayTeam, Referee referee, String stageType, int homeScore, int awayScore){

        String fixtureId = Helper.generateID();
        return new Fixture.FixtureBuilder()
                .setFixtureId(fixtureId)
                .setGroupId(groupId)
                .setHomeTeam(homeTeam)
                .setAwayTeam(awayTeam)
                .setReferee(referee)
                .setStageType(stageType)
                .setHomeScore(homeScore)
                .setAwayScore(awayScore)
                .build();

    }

}
