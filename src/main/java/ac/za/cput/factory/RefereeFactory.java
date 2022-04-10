/**
 RefereeFactory.java
 Factory for the Referee
 Author: Legiste Ndabashinze (217046207)
 Date: 31 March 2022
 */

package ac.za.cput.factory;

import ac.za.cput.entity.Fixture;
import ac.za.cput.entity.Referee;
import ac.za.cput.util.Helper;

public class RefereeFactory {

    public static Referee createReferee(String fixtureId, String name, String middleName, String lastName, int yearsOfExperience){

        String refereeId = Helper.generateID();
        return new Referee.RefereeBuilder()
                .setFixtureId(fixtureId)
                .setRefereeId(refereeId)
                .setName(name)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .setYearsOfExperience(yearsOfExperience)
                .build();
    }

}
