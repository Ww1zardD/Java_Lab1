import java.util.Scanner;
import java.util.Locale;  // in order to change the decimal separator from comma to dot


public class Main {
    public static void main(String[] args) {
        // Setting US locale for the entire application in order to change the decimal separator from comma to dot
        Locale.setDefault(Locale.US);

        /* initializing a Lab1 object in order to use methods from Lab1.java file*/
        Lab1 lab1 = new Lab1();

        /* initializing a Scanner object to handle input */
        Scanner scanner = new Scanner(System.in);


        /* Exercise 1 */
        System.out.println("Exercise 1: Methods");

        // Task 1
        System.out.println('\n' + "- task 1: getting only the fractional part");

        double number1 = 1.2489;
        double number2 = Math.E;
        System.out.printf("Number: %.4f  →  Fractional part: %.4f%n", number1, lab1.fraction(number1));
        System.out.printf("Math.E: %.10f  →  Fractional part: %.10f%n", number2, lab1.fraction(number2));

        double number3 = lab1.doubleInputCheck(scanner);
        System.out.printf("User input: %g  →  Fractional part: %g%n", number3, lab1.fraction(number3));
        lab1.emptyInput(scanner);

        // Task 3
        System.out.println('\n' + "- task 3: turning a char from 0-9 to number");

        char digit1 = '2';
        System.out.println("Char: " + digit1 + "  →  number from it: " + lab1.charToNum(digit1));

        char digit2 = lab1.charInputCheck(scanner);
        System.out.println("User input: " + digit2 + "  →  number from it: " + lab1.charToNum(digit2));
        lab1.emptyInput(scanner);

        // Task 5
        System.out.println('\n' + "- task 5: checking if the number has only 2 digits");
        int num1 = 52;
        int num2 = 144;
        int num3 = -44;
        int num4 = -100;
        System.out.println("Number 1: " + num1 + "  The result: " + lab1.is2Digits(num1));
        System.out.println("Number 2: " + num2 + "  The result: " + lab1.is2Digits(num2));
        System.out.println("Number 3: " + num3 + "  The result: " + lab1.is2Digits(num3));
        System.out.println("Number 4: " + num4 + "  The result: " + lab1.is2Digits(num4));

        int num5 = lab1.intInputCheck(scanner);
        System.out.println("User input: " + num5 + "  The result: " + lab1.is2Digits(num5));
        lab1.emptyInput(scanner);

        // Task 7
        System.out.println('\n' + "- task 7: checking if the num is in the range from a to b");
        int a1 = 5;
        int b1 = 1;
        num1 = 3;
        int a2 = 17;
        int b2 = 53;
        num2 = 17;
        int a3 = 10;
        int b3 = 4;
        num3 = -3;
        System.out.println("a = " + a1 + "; b = " + b1 + "; num = " + num1 + ";  The result: " + lab1.isInRange(a1,b1, num1));
        System.out.println("a = " + a2 + "; b = " + b2 + "; num = " + num2 + ";  The result: " + lab1.isInRange(a2,b2, num2));
        System.out.println("a = " + a3 + "; b = " + b3 + "; num = " + num3 + ";  The result: " + lab1.isInRange(a3,b3, num3));

        System.out.println("Entering a, b, num:");
        int a4 = lab1.intInputCheck(scanner);
        int b4 = lab1.intInputCheck(scanner);
        num4 = lab1.intInputCheck(scanner);
        System.out.println("User input: a = " + a4 + "; b = " + b4 + "; num = " + num4 + ";  The result: " + lab1.isInRange(a4,b4, num4));
        lab1.emptyInput(scanner);

        // Task 9
        System.out.println('\n' + "- task 9: checking if 3 numbers are equal to each other ");
        a1 = 5;
        a2 = 5;
        a3 = 5;
        b1 = 94;
        b2 = -94;
        b3 = 32;
        System.out.println("Are they equal: [" + a1 + "; " + a2 + "; " + a3 + "]; The result: " + lab1.isEqual(a1,a2,a3));
        System.out.println("Are they equal: [" + b1 + "; " + b2 + "; " + b3 + "]; The result: " + lab1.isEqual(b1,b2,b3));

        System.out.println("Entering 3 numbers:");
        int c1 = lab1.intInputCheck(scanner);
        int c2 = lab1.intInputCheck(scanner);
        int c3 = lab1.intInputCheck(scanner);
        System.out.println("User input: [" + c1 + "; " + c2 + "; " + c3 + "]; The result: " + lab1.isEqual(c1,c2,c3));
        lab1.emptyInput(scanner);


        /* Exercise 2 */
        System.out.println("\n\n" + "Exercise 2: Conditions");

        // Task 1
        System.out.println('\n' + "- task 1: checking the explicit abs implementation");
        num1 = -24;
        num2 = 12;
        System.out.println("Number 1: " + num1 + " The result: " + lab1.abs(num1));
        System.out.println("Number 2: " + num2 + " The result: " + lab1.abs(num2));

        num3 = lab1.intInputCheck(scanner);
        System.out.println("User input: " + num3 + " The result: " + lab1.abs(num3));
        lab1.emptyInput(scanner);

        // Task 3
        System.out.println('\n' + "- task 3: returning true if divisible by exactly one of: 5 or 7");
        a1 = 14; // divisible only by 7
        a2 = 25; // divisible only by 5
        a3 = 35; // divisible by 5 and by 7
        a4 = 16; // divisible not by 5 and not by 7
        System.out.println("Number: " + a1 + " The result: " + lab1.is35(a1));
        System.out.println("Number: " + a2 + " The result: " + lab1.is35(a2));
        System.out.println("Number: " + a3 + " The result: " + lab1.is35(a3));
        System.out.println("Number: " + a4 + " The result: " + lab1.is35(a4));

        int a5 = lab1.intInputCheck(scanner);
        System.out.println("User input: " + a5 + " The result: " + lab1.is35(a5));
        lab1.emptyInput(scanner);

        // Task 5
        System.out.println('\n' + "- task 5: getting the max number between the 3");
        a1 = 5;
        a2 = 7;
        a3 = 7;
        b1 = 8;
        b2 = -1;
        b3 = 4;
        System.out.println("[" + a1 + "; " + a2 + "; " + a3 + "]  max number is " + lab1.max3(a1, a2, a3));
        System.out.println("[" + b1 + "; " + b2 + "; " + b3 + "]  max number is " + lab1.max3(b1, b2, b3));

        System.out.println("Entering 3 numbers:");
        c1 = lab1.intInputCheck(scanner);
        c2 = lab1.intInputCheck(scanner);
        c3 = lab1.intInputCheck(scanner);
        System.out.println("User input: [" + c1 + "; " + c2 + "; " + c3 + "]  max number is " + lab1.max3(c1, c2, c3));
        lab1.emptyInput(scanner);

        // Task 7
        System.out.println('\n' + "- task 7: if the sum is 10-19 returning 20, otherwise returning the sum");
        a1 = 5;
        a2 = 7;
        b1 = 8;
        b2 = -1;
        System.out.println("[" + a1 + "; " + a2 + "]  the result: " + lab1.sum2(a1, a2));
        System.out.println("[" + b1 + "; " + b2 + "]  the result: " + lab1.sum2(b1, b2));

        System.out.println("Entering 2 numbers:");
        c1 = lab1.intInputCheck(scanner);
        c2 = lab1.intInputCheck(scanner);
        System.out.println("User input: [" + c1 + "; " + c2 + "]  the result: " + lab1.sum2(c1, c2));
        lab1.emptyInput(scanner);

        // Task 9
        System.out.println('\n' + "- task 9: returning the Russian weekday name for the given day number (1-7)");
        a1 = 5;
        a2 = 31;
        a3 = 3;
        System.out.println(a1 + "  the result: " + lab1.day(a1));
        System.out.println(a2 + "  the result: " + lab1.day(a2));
        System.out.println(a3 + "  the result: " + lab1.day(a3));

        a4 = lab1.intInputCheck(scanner);
        System.out.println("User input: " + a4 + "  the result: " + lab1.day(a4));
        lab1.emptyInput(scanner);


        /* Exercise 3 */
        System.out.println("\n\n" + "Exercise 3: Iteration (for & while)");

        // Task 1
        System.out.println('\n' + "- task 1: getting numbers from 0 to x");
        num1 = 11;
        System.out.println("x: " + num1 + "\nthe result: " + lab1.listNums(num1));

        num2 = lab1.intInputCheck(scanner);
        System.out.println("User input: " + num2 + "\nthe result: " + lab1.listNums(num2));
        lab1.emptyInput(scanner);

        // Task 3
        System.out.println('\n' + "- task 3: getting even numbers from 0 to x");
        num1 = 11;
        System.out.println("x: " + num1 + "\nthe result: " + lab1.chet(num1));

        num2 = lab1.intInputCheck(scanner);
        System.out.println("User input: " + num2 + "\nthe result: " + lab1.chet(num2));
        lab1.emptyInput(scanner);

        // Task 5
        System.out.println('\n' + "- task 5: getting the length of a number");
        num1 = 92556;
        num2 = -11;
        System.out.println(num1 + "  the result: " + lab1.numLen(num1));
        System.out.println(num2 + "  the result: " + lab1.numLen(num2));

        num3 = lab1.intInputCheck(scanner);
        System.out.println("User input: " + num3 + "\nthe result: " + lab1.numLen(num3));
        lab1.emptyInput(scanner);

        // Task 7
        System.out.println('\n' + "- task 7: printing out a square of x size of '*'");
        num1 = 2;
        num2 = 4;
        System.out.println("Number: " + num1 + "\nthe result: ");
        lab1.square(num1);
        System.out.println("Number: " + num2 + "\nthe result: ");
        lab1.square(num2);

        num3 = lab1.intInputCheck(scanner);
        System.out.println("User input: " + num3 + "\nthe result: ");
        lab1.square(num3);
        lab1.emptyInput(scanner);

        // Task 9
        System.out.println('\n' + "- task 9: printing out a right triangle from '*' of x size");
        num1 = 2;
        num2 = 4;
        System.out.println("Number: " + num1 + "\nthe result: ");
        lab1.rightTriangle(num1);
        System.out.println("Number: " + num2 + "\nthe result: ");
        lab1.rightTriangle(num2);

        num3 = lab1.intInputCheck(scanner);
        System.out.println("User input: " + num3 + "\nthe result: ");
        lab1.rightTriangle(num3);
        lab1.emptyInput(scanner);

        /* Exercise 4 */
        System.out.println("\n\n" + "Exercise 4: Arrays");

        // Task 1
        System.out.println('\n' + "- task 1: getting the index of the first found x number in an array");
        int[] arr1 = {1, 2, 3, 4, 2, 2, 5};
        a1 = 2;
        a2 = 7;

        System.out.print("Array: ");
        lab1.printIntArray(arr1);

        System.out.println("index of the first [" + a1 + "] = " + lab1.findFirst(arr1, a1));
        System.out.println("index of the first [" + a2 + "] = " + lab1.findFirst(arr1, a2));

        System.out.print("User array: ");
        int[] arr2 = lab1.createArrayFromInput(scanner);

        lab1.printIntArray(arr2);
        System.out.println("User value of x: ");
        a3 = lab1.intInputCheck(scanner);
        System.out.println("index of the first [" + a3 + "] = " + lab1.findFirst(arr2, a3));
        lab1.emptyInput(scanner);

        // Task 3
        System.out.println('\n' + "- task 3: getting the number with the maximum absolute value in the array");
        int[] arr3 = {1, -2, -7, 4, 2, 2, 5};

        System.out.print("Array: ");
        lab1.printIntArray(arr3);
        System.out.println("The result: " + lab1.maxAbs(arr3));

        System.out.print("User array: ");
        int[] arr4 = lab1.createArrayFromInput(scanner);
        System.out.println("The result: " + lab1.maxAbs(arr4));
        lab1.emptyInput(scanner);

        // Task 5
        System.out.println('\n' + "- task 5: inserting an array at the specified index in the array");
        int[] arr5 = {1, 2, 3, 4, 5};
        int[] insertedArr1 = {7, 8, 9};
        int pos1 = 3;


        System.out.print("Initial array: ");
        lab1.printIntArray(arr5);
        System.out.print("To be inserted: ");
        lab1.printIntArray(insertedArr1);

        System.out.print("Result: ");
        lab1.printIntArray(lab1.add(arr5, insertedArr1, pos1));

        System.out.print("User array: ");
        int[] arr6 = lab1.createArrayFromInput(scanner);
        lab1.printIntArray(arr6);
        System.out.print("User array to be inserted: ");
        int[] insertedArr2 = lab1.createArrayFromInput(scanner);
        lab1.printIntArray(insertedArr2);

        while (true) {
            System.out.print("Enter the index: ");
            int pos2 = lab1.intInputCheck(scanner);
            if (pos2 > arr6.length) {
                System.out.println("Invalid position! Try again.");
            }
            else {
                System.out.print("Result: ");
                lab1.printIntArray(lab1.add(arr6, insertedArr2, pos2));
                lab1.emptyInput(scanner);
                break;
            }
        }

        // Task 7
        System.out.println('\n' + "- task 7: returning the reversed array");
        int[] arr7 = {1, 2, 3, 4, 5};
        System.out.print("Initial array: ");
        lab1.printIntArray(arr7);
        System.out.print("Reversed array: ");
        lab1.printIntArray(lab1.reverseBack(arr7));

        System.out.print("User array: ");
        int[] arr8 = lab1.createArrayFromInput(scanner);
        lab1.printIntArray(arr8);
        System.out.print("Reversed user array: ");
        lab1.printIntArray(lab1.reverseBack(arr8));
        lab1.emptyInput(scanner);

        // Task 9
        System.out.println('\n' + "- task 9: getting the array of indices of every found x in the array");
        int[] arr9 = {1, 2, 3, 8, 2, 2, 9};
        int x1 = 2;
        System.out.print("Array: ");
        lab1.printIntArray(arr9);
        System.out.println("The x: " + x1);
        System.out.print("The result: ");
        lab1.printIntArray(lab1.findAll(arr9, x1));

        System.out.print("User array: ");
        int[] arr10 = lab1.createArrayFromInput(scanner);

        lab1.printIntArray(arr10);
        System.out.print("User value of x: ");
        int x2 = lab1.intInputCheck(scanner);
        System.out.print("The result: ");
        lab1.printIntArray(lab1.findAll(arr10, x2));
        lab1.emptyInput(scanner);


        System.out.println("\nEnd.");
    }
}
