package calc.arabian.roman;

import calc.arabian.roman.service.Operations;
import calc.arabian.roman.service.Parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Parser parser = new Parser();

        List<String> parseInput = new ArrayList<String>();
        try {
            parseInput = parser.parse(input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Operations operations = new Operations();

        int result = operations.actions(parseInput);
        boolean system = operations.isRoman(parseInput);
        String answer = operations.result(result, system);
        System.out.println(answer);
    }
}
///