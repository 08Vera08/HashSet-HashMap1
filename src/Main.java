import java.util.HashMap;

public class Main {
    private static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        HashMap<Character, Integer> words = new HashMap<>();
        int maxFreq = -1, minFreq = Integer.MAX_VALUE;
        char maxSymbol, minSymbol;
        for (int i = 0; i < text.length(); ++i) {
            if (Character.isLetter(text.charAt(i))) {
                char c = text.charAt(i);
                if (!words.containsKey(c)) {
                    words.put(c, 1);
                } else {
                    words.put(c, words.get(c) + 1);
                }
                if (words.get(c) > maxFreq) {
                    maxFreq = words.get(c);
                    maxSymbol = c;
                }
                if (words.get(c) < minFreq) {
                    minFreq = words.get(c);
                    minSymbol = c;
                }
            }
        }
        System.out.println(words.get('f'));
    }
}