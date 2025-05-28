public class ValidPalindrome_125 {
    public static void main(String[] args) {
        ValidPalindrome_125 myObj = new ValidPalindrome_125();
        System.out.println(myObj.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(myObj.isPalindrome("race a car"));
        System.out.println(myObj.isPalindrome(""));
    }

    public boolean isPalindrome1(String s) {
        boolean isPalindrome = true;

        char[] inputChars = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").toCharArray();
        System.out.println(inputChars.length);
        for (int i =0; i < inputChars.length / 2; i++) {
            if (inputChars[i] != inputChars[inputChars.length - i - 1]) {
                System.out.println(inputChars[i]);
                System.out.println(inputChars[inputChars.length - i - 1]);
                return false;
            }
        }

        return isPalindrome;
    }

    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            } else {
                if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                    return false;
                }
                start++;
                end--;
            }
        }

        return true;
    }



    private boolean isAlphaNumeric(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}
