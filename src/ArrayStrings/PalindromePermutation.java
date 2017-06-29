package ArrayStrings;

/**
 * Created by AarKay on 24-Jun-17.
 * www.rakeshgautam.com
 * Given a string, write a function to check if it is a permutation of a palindrome.
 */

public class PalindromePermutation {
    public static void main(String[] args) {
        if (palper("Tact Coa"))
            System.out.println("true");
        else
            System.out.println("false");
    }

    private static boolean palper(String string) {
        string = string.toLowerCase();
        char[] chars = string.toCharArray();

        int[] cc = new int[26];
        for (char aChar : chars) {
            if (aChar < 'a' || aChar > 'z')
                continue;
            cc[aChar - 'a']++;
        }

        boolean odd = false;
        for (int aCc : cc) {
            if (aCc % 2 != 0) {
                if (odd) {
                    return false;
                }
                odd = true;
            }
        }
        return true;
    }
}
