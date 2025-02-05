package calc.arabian.roman;

import calc.arabian.roman.service.Operations;
import calc.arabian.roman.service.Parser;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            System.out.println(calc(input));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
    public static String calc(String input) throws Exception {

        Parser parser = new Parser();

        List<String> parseInput = parser.parse(input);

        Operations operations = new Operations();

        int result = operations.actions(parseInput);
        boolean system = operations.isRoman(parseInput);

        return operations.result(result, system);
    }
}
