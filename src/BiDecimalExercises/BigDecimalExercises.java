package BiDecimalExercises;

import java.math.BigDecimal;

public class BigDecimalExercises {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("78.983");
        BigDecimal number2 = new BigDecimal("876.23");

        System.out.println(number1.add(number2));
        System.out.println(number1.max(number2));
        int i = 3;
        System.out.println(number1.add(new BigDecimal(i)));
        System.out.println(number1.multiply(new BigDecimal(i)));
    }
}
