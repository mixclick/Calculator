package calc.arabian.roman.constants;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Constants {
    public static List<Character> ACTIONS = List.of('+', '-', '*', '/');

    public static Map<String, Integer> ROMAN = new HashMap<>();
    public static Map<Integer, String> ARABIAN = new HashMap<>();
    public static Map<Integer, String> ARABIAN10 = new HashMap<>();

    static {
        ROMAN.put("I", 1);
        ROMAN.put("II", 2);
        ROMAN.put("III", 3);
        ROMAN.put("IV", 4);
        ROMAN.put("V", 5);
        ROMAN.put("VI", 6);
        ROMAN.put("VII", 7);
        ROMAN.put("VIII", 8);
        ROMAN.put("IX", 9);
        ROMAN.put("X", 10);
        ROMAN.put("L", 50);
        ROMAN.put("C", 100);

        ARABIAN.put(100, "C");
        ARABIAN.put(50, "L");
        ARABIAN.put(10, "X");
        ARABIAN.put(9, "IX");
        ARABIAN.put(8, "VIII");
        ARABIAN.put(7, "VII");
        ARABIAN.put(6, "VI");
        ARABIAN.put(5, "V");
        ARABIAN.put(4, "IV");
        ARABIAN.put(3, "III");
        ARABIAN.put(2, "II");
        ARABIAN.put(1, "I");


        ARABIAN10.put(10, "C");
        ARABIAN10.put(9, "XC");
        ARABIAN10.put(8, "LXXX");
        ARABIAN10.put(7, "LXX");
        ARABIAN10.put(6, "LX");
        ARABIAN10.put(5, "L");
        ARABIAN10.put(4, "XL");
        ARABIAN10.put(3, "XXX");
        ARABIAN10.put(2, "XX");
        ARABIAN10.put(1, "X");

    }

    public static String convertNumToRoman1(int numArabian) {

        int n, n1;
        String nStr = "";
        String n1Str = "";
        n = numArabian / 10;
        if (n > 0) {
            nStr = ARABIAN10.get(n);
        }
        n1 = numArabian % 10;
        if (n1 > 0) {
            n1Str = ARABIAN.get(n1);
        }


        return nStr + n1Str;
    }
   


}

