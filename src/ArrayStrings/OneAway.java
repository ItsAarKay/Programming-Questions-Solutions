package ArrayStrings;

/**
 * Created by AarKay on 24-Jun-17.
 * www.rakeshgautam.com
 * Given two strings, write a function to check if they are one edit (or zero) away.
 */
public class OneAway {
    public static void main(String[] args) {
        String one = "pale";
        String two = "pake";

        if (oneAway(one, two))
            System.out.println("true");
        else
            System.out.println("false");
    }

    /**
     * @param one First string to match
     * @param two Second string to match
     * @return true if these strings are one edit away or false if not
     */
    private static boolean oneAway(String one, String two) {
        int i1 = 0, i2 = 0;
        boolean bool = false;

        // store the lengthy string in s1 and short in s2
        String s1 = (one.length() > two.length()) ? one : two;
        String s2 = (one.length() > two.length()) ? two : one;

        // loop through until one of the string is completely traversed
        while (i1 < s1.length() && i2 < s2.length()) {
            // if first string character is != second string character
            if (s1.charAt(i1) != s2.charAt(i2)) {
                // increment index of lengthy string by 1
                i1++;
                /* if both string are of equal length increment short index too
                 because may be they are different by this character only (oneAway) */
                if (s1.length() == s2.length())
                    i2++;
                // check if bool is already true and return false
                if (bool) {
                    return false;
                }
                // set bool to true if not already
                bool = true;
            } else {
                // increment index for s1 and s2 both if character matches and continue the cycle
                i1++;
                i2++;
            }
        }
        return true;
    }
}
