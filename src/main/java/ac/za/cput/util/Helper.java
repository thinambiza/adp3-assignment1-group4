/**
 * Add all necessary validation methods in here
 */

package ac.za.cput.util;

import org.apache.commons.lang3.RandomStringUtils;

public class Helper {
    public static String generateId(){
        return RandomStringUtils.random(8, "0123456789abcdef");
    }
}
