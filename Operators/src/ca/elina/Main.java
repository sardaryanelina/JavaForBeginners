package ca.elina;

// Operators // Assignment Operator VS Equals To Operator / == VS =
// Operands
// If-Then Statement / Conditional Logic
// Logical And / & Operator
// Logical Or / || Operator
// Logical NOT / ! Operator
// XOR / ^ Operator
// Assignment Operator
// Ternary Operator

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result); // 1 + 2 = 3

        int previousResult = result;
        System.out.println("previousResult =  " + previousResult); // previousResult =  3

        result = result - 1;
        System.out.println("3 - 1 = " + result);  // 3 - 1 = 2
        System.out.println("previousResult =  " + previousResult); // previousResult =  3

        result = result * 10;
        System.out.println("2 * 10 = " + result); // 2 * 10 = 20

        result = result / 5;
        System.out.println("20 / 5 = " + result);  // 20 / 5 = 4

        result = result % 3;    // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result); //4 % 3 = 1

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--;  // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result +2;
        result += 2;  // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3;  // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result - 2
        result -= 2;  // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        // ************* If-Then Statement / Conditional Logic ************* //
        boolean isAlien = false;
        if (isAlien == false) {   // if (!isAlien) {    // if (isAlien != true) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        // Logical And / & Operator
        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        // Logical Or / || Operator
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false; // Ternary Operator
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        if(wasCar^isCar){ // XOR Operator
            System.out.println("This is XOR Operator");
        }

        double myFirstValue = 20d; // 20.00
        double mySecondValue = 80.00000; // 80d // 80.0
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.0d;
        System.out.println("theRemainder = " + theRemainder);
        // boolean isNoRemainder = theRemainder == 0;
        boolean isNoRemainder = (theRemainder == 0) ? true : false;// Ternary Operator
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
