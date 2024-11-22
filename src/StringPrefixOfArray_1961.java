import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;

public class StringPrefixOfArray_1961 {
    public static void main(String[] args) {
        StringPrefixOfArray_1961 myObj = new StringPrefixOfArray_1961();
        System.out.println(myObj.isPrefixString("iloveleetcode", new String[]{"i","love","leetcode","apples"}));
        System.out.println(myObj.isPrefixString("iloveleetcode", new String[]{"apples","i","love","leetcode"}));
        System.out.println(myObj.isPrefixString2("iloveleetcode", new String[]{"i","love","leetcode","apples"}));
        System.out.println(myObj.isPrefixString2("iloveleetcode", new String[]{"apples","i","love","leetcode"}));
//        System.out.println(myObj.isPrefixString3("iloveleetcode", new String[]{"i","love","leetcode","apples"}));
        System.out.println(myObj.isPrefixString3("iloveleetcode", new String[]{"apples","i","love","leetcode"}));
//        System.out.println(myObj.isPrefixString4("a", new String[]{"aa","aaaa","banana"}));
    }

    public boolean isPrefixString(String s, String[] words) {
        AtomicBoolean isPrefixString = new AtomicBoolean(false);
        AtomicReference<String> temp = new AtomicReference<>("");
        Stream.of(words).forEach(word -> {
            temp.set(temp.get() + word);
            if (temp.get().equals(s)) {
                isPrefixString.set(true);
            }
        });

        return isPrefixString.get();
    }

    public boolean isPrefixString2(String s, String[] words) {
        for (int i = 0; i < words.length && !s.isEmpty(); i++) {
            if (s.startsWith(words[i])) {
                s = s.substring(words[i].length());
            } else {
                return false;
            }
        }

        return s.isEmpty();
    }

    public boolean isPrefixString3(String s, String[] words) {
        int k = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (k < s.length() && words[i].charAt(j) == s.charAt(k)) {
                    if (k == s.length() - 1 && j == words[i].length() - 1) {
                        return true;
                    }
                    k++;
                } else {
                    return false;
                }
            }
        }

        return false;
    }
}
