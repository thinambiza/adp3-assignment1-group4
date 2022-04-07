/**
 RefereeFactoryTest.java
 Test case class for the Referee Factory
 Author: Legiste Ndabashinze (217046207)
 Date: 07 April 2022
 */

package ac.za.cput.factory;

import ac.za.cput.entity.Fixture;
import ac.za.cput.entity.Referee;
import org.junit.jupiter.api.Test;

class RefereeFactoryTest {

    @Test
    void createReferee() {

        Fixture fixture = FixtureFactory.createFixture("", null, null, null, "", 0, 0);
        String fixtureId = fixture.getFixtureId();

        Referee referee = RefereeFactory.createReferee(fixtureId, "Michael", null ,"Olivier", 10);
        System.out.println(referee);
    }
}