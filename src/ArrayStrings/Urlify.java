package ArrayStrings;

/**
 * Created by AarKay on 24-Jun-17.
 * www.rakeshgautam.com
 * Write a method to replace all spaces in a string with '%20'. If true length of the string is given.
 */
public class Urlify {
    public static void main(String[] args) {
        String str = "Byte Me    ";
        char[] chars = str.toCharArray();
        int len = 7;

        urlify(chars, len);
    }

    private static void urlify(char[] chars, int len) {
        int c = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] == ' ')
                c++;
        }

        int index = len + (c * 2);
        char[] newChars = new char[index + 1];
        newChars[index] = '\0';

        for (int i = len - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                newChars[--index] = '0';
                newChars[--index] = '2';
                newChars[--index] = '%';
            } else {
                newChars[--index] = chars[i];
            }
        }

        for (char cc : newChars) {
            System.out.print(cc);
        }
    }
}
