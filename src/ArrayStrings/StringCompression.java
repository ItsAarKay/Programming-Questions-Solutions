package ArrayStrings;

/**
 * Created by AarKay on 24-Jun-17.
 * www.rakeshgautam.com
 * Implement a method to perform basic compression on string using the counts of repeated characters.
 */
public class StringCompression {
    public static void main(String[] args) {
        String string = "aabcccccaaa";
        System.out.println(compress(string));
    }

    /**
     * Method to compress a string input
     * @param string to be compressed by the method
     * @return the compressed string if possible
     */
    private static String compress(String string) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        int c = 0;
        while (i < string.length()) {
            c++;
            if (i + 1 >= string.length() || string.charAt(i) != string.charAt(i + 1)) {
                str.append(string.charAt(i));
                str.append(c);
                c = 0;
            }
            i++;
        }
        return (string.length() < str.length()) ? string : str.toString();
    }
}
