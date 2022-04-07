/**
 * Add all necessary validation methods in here
 */

package ac.za.cput.util;

import java.util.UUID;

public class Helper {

    public static String generateID(){
        return UUID.randomUUID().toString();
    }

}
