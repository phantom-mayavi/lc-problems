import java.util.Arrays;

public class ValidAnagram_242 {
    public static void main(String[] args) {
        ValidAnagram_242 myObj = new ValidAnagram_242();
        System.out.println(myObj.isAnagram("anagram", "nagaram"));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        Arrays.sort(sChars);
        String sSorted = new String(sChars);
        char[] tChars = t.toCharArray();
        Arrays.sort(tChars);
        String tSorted = new String(tChars);

        for (int i = 0; i < s.length(); i++) {
            if (sSorted.charAt(i) != tSorted.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
