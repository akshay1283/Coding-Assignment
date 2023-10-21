import java.util.Map;
import java.util.HashMap;

public class Roman {
    
    private static int romanToInt(String s) {
        if (s == null || s.length() == 0) return 0;

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        result = map.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        
        String romanNumeral = "XIV";
        int intValue = romanToInt(romanNumeral);
        System.out.println(romanNumeral + " in Roman numerals is " + intValue);
    }
}