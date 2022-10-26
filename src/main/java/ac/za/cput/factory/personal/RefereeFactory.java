/**
 Referee Factory.java
 Factory for Referee
 Author: Zuko Fukula (217299911)
 Date: 30 March 2022
 */

package ac.za.cput.factory.personal;

import ac.za.cput.domain.personal.Referee;
import ac.za.cput.util.Helper;

public class RefereeFactory {
    public static Referee newReferee(String firstName, String middleName, String lastName, int age, int yoe){
        String id = "mn-"+ Helper.generateId();
        return new Referee.Builder()
                .setId(id)
                .setFirstName(firstName)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .setAge(age)
                .setYearsOfExperience(yoe)
                .build();
    }
}
