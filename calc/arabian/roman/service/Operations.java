package calc.arabian.roman.service;

import java.util.List;

import static calc.arabian.roman.constants.Constants.*;

public class Operations {
    public int actions(List<String> values) throws Exception {

        String valueFirst, valueSecond, valueAction;
        valueFirst = values.get(0);
        valueAction = values.get(1);
        valueSecond = values.get(2);

        int num1 = 0, num2 = 0, result;

        if (ROMAN.containsKey(valueFirst) && ROMAN.containsKey(valueSecond)) {
            num1 = ROMAN.get(valueFirst);
            num2 = ROMAN.get(valueSecond);
        } else {
            try {
                num1 = Integer.parseInt(valueFirst);
                num2 = Integer.parseInt(valueSecond);
            } catch (Exception e) {
                throw e = new Exception("Ошибка : т.к. число больше 10");
            }
        }
        if (num1 > 10 || num2 > 10) {
            throw new Exception("Ошибка : т.к. число больше 10");
        }

        switch (valueAction) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            default:
                result = num1 / num2;
                break;
        }
        return result;
    }

    public boolean isRoman(List<String> values)  {
        String valueFirst;
        valueFirst = values.get(0);
        return (ROMAN.containsKey(valueFirst));

    }

    public String result(int number, boolean isRoman) throws Exception {
        if (number <= 0 && isRoman) {
            throw new Exception("Ошибка : т.к. в римской системе нет отрицательных чисел");
        }
        if (isRoman) {
            return convertNumToRoman1(number);
        } else {
            return String.valueOf(number);
        }
    }
}
