/**
 ManagerFactory.java
 Manager Factory
 Author: Panashe Muinzani (218186568)
 Date: 2 April 2022
 */

package ac.za.cput.factory;
import ac.za.cput.entity.Manager;
import ac.za.cput.util.Helper;

public class ManagerFactory {

    public static Manager createManager( String teamId, String firstName,
                                        int age, int yearsOfExperience, String middleName, String lastName){

        String managerId = Helper.generateID();
        return new Manager.Builder()
                .setManagerId(managerId)
                .setTeamId(teamId)
                .setFirstName(firstName)
                .setAge(age)
                .setYearsOfExperience(yearsOfExperience)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .build();
    }
}
