package ArrayStrings;

/**
 * Created by AarKay on 24-Jun-17.
 * www.rakeshgautam.com
 * Implement a method to tell if a string is the rotation substring of another string.
 */
public class StringRotation {
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        if (isRotation(s1, s2))
            System.out.println("true");
        else
            System.out.println("false");
    }

    /**
     * Take two strings and return true if one is rotation of other string
     * @param s1 first string
     * @param s2 second string
     * @return true if rotation of other else false
     */
    private static boolean isRotation(String s1, String s2) {
        if (s1.length() == s2.length()) {
            s1 = s1 + s1;
            if (s1.contains(s2))
                return true;
        }
        return false;
    }
}
