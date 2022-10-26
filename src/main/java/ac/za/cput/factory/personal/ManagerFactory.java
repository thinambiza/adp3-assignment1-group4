/**
 ManagerFactory.java
 Manager Factory
 Author: Panashe Muinzani (218186568)
 Date: 2 April 2022
 */
package ac.za.cput.factory.personal;

import ac.za.cput.domain.personal.Manager;
import ac.za.cput.util.Helper;

public class ManagerFactory {
    public static Manager newManager(String firstName, String middleName, String lastName, int age, int yoe){
        String id = "mn-"+ Helper.generateId();
        return new Manager.Builder()
                .setId(id)
                .setFirstName(firstName)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .setAge(age)
                .setYearsOfExperience(yoe)
                .build();
    }
}
