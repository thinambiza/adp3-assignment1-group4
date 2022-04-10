/**
 FixtureFactoryTest.java
 Test case class for the Fixture Factory
 Author: Legiste Ndabashinze (217046207)
 Date: 07 April 2022
 */

package test;

import ac.za.cput.entity.Fixture;
import ac.za.cput.entity.Group;
import ac.za.cput.entity.Referee;
import ac.za.cput.entity.Team;
import org.junit.jupiter.api.Test;

class FixtureFactoryTest {

    @Test
    void createFixture() {

        Group group = GroupFactory.createGroup("", 4, 'A', 0, null, null);
        Team homeTeam = TeamFactory.createTeam(null, null,null, 0, 2020, null, null, null);
        Team awayTeam = TeamFactory.createTeam(null, null,null, 1, 2019, null, null, null);
        Referee referee = RefereeFactory.createReferee(null, null, null, null, 0);

        String groupId = group.getGroupId();

        Fixture fixture = FixtureFactory.createFixture(groupId, homeTeam, awayTeam, referee, "Knockout Stage", 0, 0);
        System.out.println(fixture);

    }
}