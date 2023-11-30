import java.util.*;

import static java.util.Arrays.asList;

public class ValidParentheses_20 {
    public static void main(String[] args) {
        System.out.println(new ValidParentheses_20().isValid("]"));
    }

    public boolean isValid(String s) {
        List<Character> openBrackets = asList('(', '{', '[');
        Map<Character, Character> paranteses = Map.of(')', '(','}', '{',']', '[');
        Stack<Character> characters = new Stack<>();
        for ( char c : s.toCharArray()) {
            if (openBrackets.contains(c)) {
                characters.push(c);
            } else if (characters.isEmpty() || characters.pop() != paranteses.get(c)) {
                return false;
            }
        }

        return characters.isEmpty();
    }
}
