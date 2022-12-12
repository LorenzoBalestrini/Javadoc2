package it.develhope.javadoc2;

/**
 * This class has the main method
 * @author Lorenzo Balestrini
 */

public class Tester {
    public static void main(String[] args) {

        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();

        System.out.println(arithmeticOperators.sum(5,6));
        System.out.println(arithmeticOperators.sub(8,3));
        System.out.println(arithmeticOperators.mul(10,8));
        System.out.println(arithmeticOperators.div(18,3));

    }
}
