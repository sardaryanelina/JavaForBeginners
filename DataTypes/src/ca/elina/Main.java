package ca.elina;

public class Main {

    public static void main(String[] args) {
        /* ******** 8 Primitive Types******** */
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        /*--------------INTEGER------------ 32 bits(4 bytes) -------------*/
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value = " + myMinIntValue);
        System.out.println("Integer maximum value = " + myMaxIntValue);
        System.out.println("Busted Max Value= " + (myMaxIntValue + 1)); // overflow --> too large for int
        /*because it didn't fit the computer overflowed the number from the maximum integer to a negative number*/
        System.out.println("Busted Min Value= " + (myMinIntValue - 1)); // underflow --> too small for int
        /*the computer underflow the number this time, because the number got below the minimum integer number*/

        int myMaxIntTest = 2147483647; // we cannot give 2147483648 as it is higher than the max integer can store
        int intWithUnderscore = 1_000_000_888; // we can use underscore from version JDK 7 and higher


        /*--------------BYTE----------- 8 bits (1 byte) -----------------*/
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value = " + myMinByteValue);
        System.out.println("Byte maximum value = " + myMaxByteValue);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        // as in parentheses it was treated as an integer, so we performed Casting


        /*--------------SHORT----------- 16 bits (2 bytes) -----------------*/
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value = " + myMinShortValue);
        System.out.println("Short maximum value = " + myMaxShortValue);
        short myNewShortValue = (short) (myMinShortValue / 2);

        /*--------------LONG------  64 bits (8 bytes)------------*/
        long myLongValue = 100L; // we always use letter L after a number, lower case 'l' can be confused with 1, so we use 'L'
        /* In this cae we can skip L, because 100 fits in integer which fits in long,
         * but if it was bigger than max integer, we would get en error asking letter L after the number, i.e. below*/
        long bigLongLiteralValue = 2_147_483_647_281L;
        System.out.println(bigLongLiteralValue);
        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value = " + myMinlongValue);
        System.out.println("Long maximum value = " + myMaxlongValue);

        /*--------------FLOAT----- 32 bits (4 bytes-)------------*/
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5.25f;
        double myDoubleValue = 5.25d;
        myIntValue = 5 / 3;
        myFloatValue = 5f / 3f;
        myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms= " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

        int a = 10;
        int b = 4;
        double c = a / b;
        System.out.println("C is: " + c);


        /*--------------CHAR----------- 16 bits (2 bytes) -----------------*/
        char myChar = 'D';
        //www.unicode-table.com
        char myUnicodeChar = '\u0044';  // letter 'D' in unicode
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9'; // copyright symbol
        System.out.println(myCopyrightChar);

        /*--------------BOOLEAN----------- 8 bits (1 byte )--------------------*/
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;

        /* ---------------- STRING --------------------------------------------------- */
        // String is a class
        // String is immutable
        //String can contain sequence of characters
        // It's limited by memory of the MAX_VALUE of an int, which is 2.14 billion

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString); // + is concatenation
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2021";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; // myInt is converted to String to be appended
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);

        int x = 11;
        String y = String.valueOf(x); // Cast to string

        // to append values StringBuffer is a better way to use
    }
}
