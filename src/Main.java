public class Main {
    public static void main(String[] args) {
        /* initializing a lab1 object in order to use methods from Lab1.java file*/
        Lab1 lab1 = new Lab1();

        
        /* Exercise 1 */
        System.out.println("Exercise 1: Methods");

        // Task 1
        System.out.println('\n' + "- task 1: getting only the fractional part");
        double number1 = 1.2489;
        double number2 = Math.E;
        System.out.printf("Number: %.4f → Fractional part: %.4f%n", number1, lab1.fraction(number1));
        System.out.printf("Math.E: %.10f → Fractional part: %.10f%n", number2, lab1.fraction(number2));

        // Task 2
        System.out.println('\n' + "- task 2: getting the sum of the last two digits");
        int number3 = 1449;
        System.out.println("Number: " + number3 + " → resulted sum: "+ lab1.sumLastNums(number3));

        // Task 3
        System.out.println('\n' + "- task 3: turning a char from 0-9 to number");
        char digit = '2';
        System.out.println("Char: " + digit + " → number from it: " + lab1.charToNum(digit));

        // Task 4
        System.out.println('\n' + "- task 4: checking if the number is positive");
        int negativeNumber = -54;
        int positiveNumber = 17;
        System.out.println("Number 1: " + positiveNumber + " The result: " + lab1.isPositive(positiveNumber));
        System.out.println("Number 2: " + negativeNumber + " The result: " + lab1.isPositive(negativeNumber));

        // Task 5
        System.out.println('\n' + "- task 5: checking if the number has only 2 digits");
        int num1 = 52;
        int num2 = 144;
        int num3 = -44;
        int num4 = -100;
        System.out.println("Number 1: " + num1 + " The result: " + lab1.is2Digits(num1));
        System.out.println("Number 2: " + num2 + " The result: " + lab1.is2Digits(num2));
        System.out.println("Number 3: " + num3 + " The result: " + lab1.is2Digits(num3));
        System.out.println("Number 4: " + num4 + " The result: " + lab1.is2Digits(num4));

        // Task 6
        System.out.println('\n' + "- task 6: checking if the char is uppercase via ASCII");
        char char1 = '@';
        char char2 = '\\';
        char char3 = 'A';
        char char4 = 'Z';
        System.out.println("Char 1: " + char1 + " The result: " + lab1.isUpperCase(char1));
        System.out.println("Char 2: " + char2 + " The result: " + lab1.isUpperCase(char2));
        System.out.println("Char 3: " + char3 + " The result: " + lab1.isUpperCase(char3));
        System.out.println("Char 4: " + char4 + " The result: " + lab1.isUpperCase(char4));

        // Task 7
        System.out.println('\n' + "- task 7: checking if the num is in the range between a and b or b and a");
        int a1 = 5;
        int b1 = 1;
        num1 = 3;
        int a2 = 17;
        int b2 = 53;
        num2 = 17;
        int a3 = 10;
        int b3 = 4;
        num3 = -3;
        System.out.println("a = " + a1 + "; b = " + b1 + "; num = " + num1 + "; The result: " + lab1.isInRange(a1,b1, num1));
        System.out.println("a = " + a2 + "; b = " + b2 + "; num = " + num2 + "; The result: " + lab1.isInRange(a2,b2, num2));
        System.out.println("a = " + a3 + "; b = " + b3 + "; num = " + num3 + "; The result: " + lab1.isInRange(a3,b3, num3));

        // Task 8
        System.out.println('\n' + "- task 8: checking if the one number is evenly divisible to other");
        a1 = 428;
        b1 = 4;
        a2 = 21;
        b2 = 6;
        System.out.println("a = " + a1 + "; b = " + b1 + "; The result: " + lab1.isDivisor(a1,b1));
        System.out.println("a = " + a2 + "; b = " + b2 + "; The result: " + lab1.isDivisor(a2,b2));

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

        // Task 10
        System.out.println('\n' + "- task 10: consequentially getting the sum of the last digits of some numbers");
        int result = lab1.lastNumSum(12, 7);  // 12%10 + 7%10 = 2 + 7 = 9
        result = lab1.lastNumSum(result, -52);  // 9%10 + |-52%10| = 9 + |2| = 11  // calculating absolute value
        result = lab1.lastNumSum(result, 79);  // 11%10 + 79%10 = 1 + 9 = 10
        result = lab1.lastNumSum(result, 132);  // 10%10 + 132%10 = 0 + 2 = 2
        System.out.println("The result: " + result);  // The result = 2


        /* Exercise 2 */
        System.out.println('\n' + '\n' + "Exercise 2: Conditions");

        // Task 1
        System.out.println('\n' + "- task 1: checking the explicit abs implementation");
        num1 = -24;
        num2 = 12;
        System.out.println("Number 1: " + num1 + " The result: " + lab1.abs(num1));
        System.out.println("Number 1: " + num2 + " The result: " + lab1.abs(num2));

        // Task 2
        System.out.println('\n' + "- task 2: checking the method for preventing the division by zero");
        a1 = -42;
        a2 = 0;
        b1 = 21;
        b2 = 2;
        System.out.println(a1 + " / " + a2 + " = " + lab1.safeDiv(a1,a2));
        System.out.println(b1 + " / " + b2 + " = " + lab1.safeDiv(b1,b2));

        // Task 3
        System.out.println('\n' + "- task 3: returning true if divisible by exactly one of: 5 or 7");
        a1 = 14; // divisible only by 7
        a2 = 25; // divisible only by 5
        a3 = 35; // divisible by 5 and by 7
        int a4 = 16; // divisible not by 5 and not by 7
        System.out.println("Number: " + a1 + " The result: " + lab1.is35(a1));
        System.out.println("Number: " + a2 + " The result: " + lab1.is35(a2));
        System.out.println("Number: " + a3 + " The result: " + lab1.is35(a3));
        System.out.println("Number: " + a4 + " The result: " + lab1.is35(a4));

        // Task 4
        System.out.println('\n' + "- task 4: comparing two numbers and getting the string");
        a1 = 12;
        a2 = 23;
        b1 = 4;
        b2 = -90;
        int c1 = 8;
        int c2 = 8;
        System.out.println("[" + a1 + "; " + a2 + "]  →  " + lab1.makeDecision(a1, a2));
        System.out.println("[" + b1 + "; " + b2 + "]  →  " + lab1.makeDecision(b1, b2));
        System.out.println("[" + c1 + "; " + c2 + "]  →  " + lab1.makeDecision(c1, c2));

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

        // Task 6
        System.out.println('\n' + "- task 6: checking if any two numbers add up to the third number");
        a1 = 5;
        a2 = 7;
        a3 = 2;
        b1 = 8;
        b2 = -1;
        b3 = 4;
        System.out.println("[" + a1 + "; " + a2 + "; " + a3 + "]  the result: " + lab1.sum3(a1, a2, a3));
        System.out.println("[" + b1 + "; " + b2 + "; " + b3 + "]  the result: " + lab1.sum3(b1, b2, b3));

        // Task 7
        System.out.println('\n' + "- task 7: if the sum is 10-19 returning 20, otherwise returning the sum");
        a1 = 5;
        a2 = 7;
        b1 = 8;
        b2 = -1;
        System.out.println("[" + a1 + "; " + a2 + "]  the result: " + lab1.sum2(a1, a2));
        System.out.println("[" + b1 + "; " + b2 + "]  the result: " + lab1.sum2(b1, b2));

        // Task 8
        System.out.println('\n' + "- task 8: returning the Russian word \"год\" in correct grammatical form for the given number");
        a1 = 5;
        a2 = 31;
        a3 = 44;
        System.out.println(a1 + "  the result: " + lab1.age(a1));
        System.out.println(a2 + "  the result: " + lab1.age(a2));
        System.out.println(a3 + "  the result: " + lab1.age(a3));

        // Task 9
        System.out.println('\n' + "- task 9: returning the Russian weekday name for the given day number (1-7)");
        a1 = 5;
        a2 = 31;
        a3 = 3;
        System.out.println(a1 + "  the result: " + lab1.day(a1));
        System.out.println(a2 + "  the result: " + lab1.day(a2));
        System.out.println(a3 + "  the result: " + lab1.day(a3));

        // Task 10
        System.out.println('\n' + "- task 10: getting week days in russian from specified by number day onward");
        String x1 = "четверг";
        String x2 = "Пт";
        System.out.println("Input: " + x1 + ";  the result: ");
        lab1.printDays(x1);
        System.out.println('\n' + "Input: " + x2 + ";  the result: ");
        lab1.printDays(x2);


        /* Exercise 3 */
        System.out.println('\n' + '\n' + "Exercise 3: Iteration (for & while)");

        // Task 1
        System.out.println('\n' + "- task 1: getting numbers from 0 to x");
        int num = 11;
        System.out.println("x: " + num + "\nthe result: " + lab1.listNums(num));

        // Task 2
        System.out.println('\n' + "- task 2: getting numbers from x to 0");
        num = 6;
        System.out.println("x: " + num + "\nthe result: " + lab1.reverseListNums(num));

        // Task 3
        System.out.println('\n' + "- task 3: getting even numbers from 0 to x");
        num = 11;
        System.out.println("x: " + num + "\nthe result: " + lab1.chet(num));

        // Task 4
        System.out.println('\n' + "- task 4: calculating x^y manually ");
        int x = -2;
        int y = 3;
        System.out.println(x + "^" + y + "\nthe result: " + lab1.pow(x, y));

        // Task 5
        System.out.println('\n' + "- task 5: getting the length of a number");
        num1 = 92556;
        num2 = -11;
        System.out.println(num1 + "  the result: " + lab1.numLen(num1));
        System.out.println(num2 + "  the result: " + lab1.numLen(num2));

        // Task 6
        System.out.println('\n' + "- task 6: checking if a number has the same digits");
        num1 = -33;
        num2 = 5555;
        num3 = -2245;
        System.out.println(num1 + "  the result: " + lab1.equalNum(num1));
        System.out.println(num2 + "  the result: " + lab1.equalNum(num2));
        System.out.println(num3 + "  the result: " + lab1.equalNum(num3));

        // Task 7
        System.out.println('\n' + "- task 7: printing out a square of x size of '*'");
        num1 = 2;
        num2 = 4;
        System.out.println("Number: " + num1 + "\nthe result: ");
        lab1.square(num1);
        System.out.println("Number: " + num2 + "\nthe result: ");
        lab1.square(num2);

        // Task 8
        System.out.println('\n' + "- task 8: printing out a left triangle of x size of '*'");
        num1 = 2;
        num2 = 4;
        System.out.println("Number: " + num1 + "\nthe result: ");
        lab1.leftTriangle(num1);
        System.out.println("Number: " + num2 + "\nthe result: ");
        lab1.leftTriangle(num2);

        // Task 9
        System.out.println('\n' + "- task 9: printing out a right triangle from '*' of x size");
        num1 = 2;
        num2 = 4;
        System.out.println("Number: " + num1 + "\nthe result: ");
        lab1.rightTriangle(num1);
        System.out.println("Number: " + num2 + "\nthe result: ");
        lab1.rightTriangle(num2);

        // Task 10
        System.out.println('\n' + "- task 10: guessing a number from 0-9");
        //lab1.guessGame();


        /* Exercise 4 */

        // Task 1
        System.out.println('\n' + "- task 1: getting the index of the first found x number in an array");
        int[] arr1 = {1, 2, 3, 4, 2, 2, 5};
        a1 = 2;
        a2 = 7;

        System.out.print("Array: ");
        lab1.printIntArray(arr1);

        System.out.println("index of the first [" + a1 + "] = " + lab1.findFirst(arr1, a1));
        System.out.println("index of the first [" + a2 + "] = " + lab1.findFirst(arr1, a2));

        // Task 2
        System.out.println('\n' + "- task 2: getting the index of the last found x number in an array");
        int[] arr2 = {1, 2, 3, 4, 5, 2, 5, 2};
        a1 = 5;
        a2 = 1;
        a3 = 8;

        System.out.print("Array: ");
        lab1.printIntArray(arr2);

        System.out.println("index of the last [" + a1 + "] = " + lab1.findLast(arr2, a1));
        System.out.println("index of the last [" + a2 + "] = " + lab1.findLast(arr2, a2));
        System.out.println("index of the last [" + a3 + "] = " + lab1.findLast(arr2, a3));

        // Task 3
        System.out.println('\n' + "- task 3: getting the number with the maximum absolute value in the array");
        int[] arr3 = {1, -2, -7, 4, 2, 2, 5};

        System.out.print("Array: ");
        lab1.printIntArray(arr3);
        System.out.println("The result: " + lab1.maxAbs(arr3));

        // Task 4
        System.out.println('\n' + "- task 4: inserting a number at the specified index in the array");
        int[] arr4 = {1, 2, 3, 4, 5};
        x = 9;
        int pos = 3;


        System.out.print("Initial array: ");
        lab1.printIntArray(arr4);
        System.out.println("x = " + x + "; pos = " + pos);

        System.out.print("Result: ");
        lab1.printIntArray(lab1.add(arr4, x, pos));

        // Task 5
        System.out.println('\n' + "- task 4: inserting an array at the specified index in the array");
        int[] arr5 = {1, 2, 3, 4, 5};
        int[] insertedArr = {7, 8, 9};
        pos = 3;


        System.out.print("Initial array: ");
        lab1.printIntArray(arr5);
        System.out.print("To be inserted: ");
        lab1.printIntArray(insertedArr);

        System.out.print("Result: ");
        lab1.printIntArray(lab1.add(arr5, insertedArr, pos));

        // Task 6
        System.out.println('\n' + "- task 6: reversing the array");
        int[] arr6 = {1, 2, 3, 4, 5};
        System.out.print("Initial array: ");
        lab1.printIntArray(arr6);
        System.out.print("Reversed array: ");
        lab1.reverse(arr6);
        lab1.printIntArray(arr6);

        // Task 7
        System.out.println('\n' + "- task 7: returning the reversed array");
        int[] arr7 = {1, 2, 3, 4, 5};
        System.out.print("Initial array: ");
        lab1.printIntArray(arr7);
        System.out.print("Reversed array: ");
        lab1.printIntArray(lab1.reverseBack(arr7));

        // Task 8
        System.out.println('\n' + "- task 8: merging two arrays");
        int[] arr8First = {1, 2, 3};
        int[] arr8Second = {7, 8, 9};
        System.out.print("First array: ");
        lab1.printIntArray(arr8First);
        System.out.print("Second array: ");
        lab1.printIntArray(arr8Second);
        System.out.print("The result: ");
        lab1.printIntArray(lab1.concat(arr8First, arr8Second));

        // Task 9
        System.out.println('\n' + "- task 9: getting the array of indices of every found x in the array");
        int[] arr9 = {1, 2, 3, 8, 2, 2, 9};
        x = 2;
        System.out.print("Array: ");
        lab1.printIntArray(arr9);
        System.out.print("The result: ");
        lab1.printIntArray(lab1.findAll(arr9, x));

        // Task 10
        System.out.println('\n' + "- task 10: removing all negative numbers from an array");
        int[] arr10 = {1, 2, -3, 4, -2, 2, -5};

        System.out.println("Array: ");
        lab1.printIntArray(arr10);
        System.out.println("The result: ");
        lab1.printIntArray(lab1.deleteNegative(arr10));
    }
}
