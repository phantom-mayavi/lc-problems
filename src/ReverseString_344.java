public class ReverseString_344 {
    public static void main(String[] args) {
        char[] s = new char[]{'h','e','l','l','o'};
        new ReverseString_344().reverseString(s);
        System.out.println(s);
    }

    public void reverseString(char[] s) {
        for (int i=0; i<s.length / 2; i++) {
            char swapChar = s[s.length - i - 1];
            s[s.length - i - 1] = s[i];
            s[i] = swapChar;
        }
    }
}
