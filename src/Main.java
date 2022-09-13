import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    public static Map<Character, Integer> map = new HashMap<>();

    public static char maxChar;
    public static char minChar;

    public static void main(String[] args) {
        System.out.println();
        numberOfChar();
        maxAndMin();
    }

    public static void numberOfChar() {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                if (map.get(Character.toLowerCase(text.charAt(i))) != null) {
                    int num = map.get(Character.toLowerCase(text.charAt(i))) + 1;
                    map.put(Character.toLowerCase(text.charAt(i)), num);
                } else {
                    map.put(Character.toLowerCase(text.charAt(i)), 1);
                }
            }
        }
    }

    public static void maxAndMin() {
        int max = -1;
        int min = Integer.MAX_VALUE;
        for (char values :
                map.keySet()) {
            if (map.get(values) > max) {
                max = map.get(values);
                maxChar = values;
            }
            if (map.get(values) < min) {
                min = map.get(values);
                minChar = values;
            }
        }
        System.out.println("Максимальное количество символов: " + maxChar + " в количестве " + max + " штук.");
        System.out.println("Минимальное количество символов: " + minChar + " в количестве " + min + " штук.");
    }
}
