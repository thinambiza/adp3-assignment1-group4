/*
 * Player Factory
 * PlayerFactory.java
 * Thina Mbiza 217217095
 * 4 April 2022
 */


package ac.za.cput.factory;

import ac.za.cput.entity.Player;
import ac.za.cput.util.Helper;


public class PlayerFactory {
    public static Player newPlayer(String fName, String mName, String lName, int age, String position, int positionNumber, int totalGoals, int totalAssistsMade){
        String id = "mn-"+ Helper.generateId();
        return new Player.Builder()
                .setId(id)
                .setFirstName(fName)
                .setMiddleName(mName)
                .setLastName(lName)
                .setAge(age)
                .setPosition(position)
                .setPositionNumber(positionNumber)
                .setTotalGoalsScored(totalGoals)
                .setTotalAssistsMade(totalAssistsMade)
                .build();
    }
}
