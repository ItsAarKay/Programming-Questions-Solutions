package ArrayStrings;

import java.util.Arrays;

/**
 * Created by AarKay on 04-Jun-17.
 * www.rakeshgautam.com
 * Given two strings, decide if one is a permutation of the other.
 */

public class Permutation {

    private static boolean isPermu(String one, String two) {
        if(one.length() == two.length()) {
            boolean[] ones = new boolean[128];
            boolean[] twos = new boolean[128];

            for (int i=0; i<one.length(); i++) {
                ones[one.charAt(i)] = true;
                twos[two.charAt(i)] = true;
            }

            if (Arrays.equals(ones, twos))
                return true;
            else
                return false;
        }
        else {
            return false;
        }
    }

    public static void main(String args[]) {
        System.out.print(isPermu("ABZa ", ""));
    }

}
