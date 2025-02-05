package calc.arabian.roman.service;

import java.util.ArrayList;
import java.util.List;

import static calc.arabian.roman.constants.Constants.*;

public class Parser {

    public List<String> parse(String input) throws Exception {
        List<String> parseInput = new ArrayList<>();
        input = input.replaceAll(" ", "");

        if (input.length() - input.replaceAll("[+\\-*/]", "").length() > 1) {
            throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        int indexAction = -1;
        for (int i = 0; i < input.length() - 1; i++) {
            if (ACTIONS.contains(input.charAt(i))) {
                indexAction = i;
                break;
            }
        }
        if (indexAction < 1) {
            throw new Exception("throws Exception //т.к. строка не является математической операцией");
        }


        String valueFirst = input.substring(0, indexAction);
        String valueSecond = input.substring(indexAction + 1);
        String valueAction = String.valueOf(input.charAt(indexAction));
        // 0 индекс - это первое число, 1 индекс - это знак, 2 индекс - это второе число.
        parseInput.add(valueFirst);
        parseInput.add(valueAction);
        parseInput.add(valueSecond);

        if (ROMAN.containsKey(valueFirst) && Character.isDigit(valueSecond.charAt(0))) {
            throw new Exception("т.к. используются одновременно разные системы счисления");
        } else if (Character.isDigit(valueFirst.charAt(0)) && ROMAN.containsKey(valueSecond)) {
            throw new Exception("т.к. используются одновременно разные системы счисления");
        }

        return parseInput;
    }

}
















