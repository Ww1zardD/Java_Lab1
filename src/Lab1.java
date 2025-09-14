import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class Lab1 {
    /* Exercise 1 */

    // 1 - getting only the fractional part
    public double fraction (double x) {
        return  x - (int) x;
    }

    // 2 - sum of the last two digits
    public int sumLastNums (int x) {
        return x/10%10 + x%10;
    }

    // 3 - getting number from char
    public int charToNum (char x) {
        return x - '0';
    }

    // 4 - is the number positive
    public boolean isPositive (int x) {
        return x > 0;
    }

    // 5 - does it have only two digits
    public boolean is2Digits (int x) {
        return x / 100 == 0;
    }

    // 6 - is the char uppercase (using ascii to determine)
    public boolean isUpperCase (char x) {
        return 65 <= x && x <= 90;
    }

    // 7 - is num in the range between a and b or b and a
    public boolean isInRange (int a, int b, int num) {
        return (a <= num && num <= b) || (b <= num && num <= a);
    }

    // 8 - is the one number evenly divisible to other
    public boolean isDivisor (int a, int b) {
        return (a == (a / b) * b) || (b == (b / a) * a);
    }
    // 9 - are these 3 numbers equal to each other
    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    // 10 - consequential sum of the last digits of some numbers
    public int lastNumSum(int a, int b) {
        return Math.abs(a % 10) + Math.abs(b % 10);
    }


    /* Exercise 2 */

    // 1 - explicit ABS implementation
    public int abs (int x) {
        if (x >= 0) return x;
        else return -x;
    }

    // 2 - safe division by zero
    public double safeDiv (int x, int y) {
        if (y == 0) return 0;
        else return (double) x / y;
    }

    // 3 - returning true if divisible by exactly one of: 5 or 7
    public boolean is35 (int x) {
        return (x % 5 == 0) != (x % 7 == 0);
    }
    // 4 - comparing two numbers by returning a string with > or < or == between them
    public String makeDecision (int x, int y) {
        if (x > y) return (x + " > " + y);
        if (x == y) return (x + " == " + y);
        else return (x + " < " + y);
    }

    // 5 - getting the max number with only 2 not nested if statements
    public int max3 (int x, int y, int z) {
        if (x >= y && x >= z) return x;
        else if (y >= x && y >= z) return y;
        else return z;
    }

    // 6 - checking if any two numbers add up to the third number
    public boolean sum3 (int x, int y, int z) {
        return (x + y == z || x + z == y || y + z == x);
    }

    // 7 - if the sum is 10-19 returning 20, otherwise returning the sum
    public int sum2 (int x, int y) {
        if (x + y >= 10 && x + y <= 19) return 20;
        else return x + y;
    }

    // 8 - returning the Russian word "год" in correct grammatical form for the given number
    public String age (int x) {
        if (x % 100 >= 11 && x % 100 <= 14) return (x + " лет");
        return switch (x % 10) {
            case 1 -> x + " год";
            case 2, 3, 4 -> x + " года";
            default -> x + " лет";
        };
    }

    // 9 - returning the Russian weekday name for the given day number (1-7)
    public String day (int x) {
        return switch (x) {
            case 1 -> "понедельник";
            case 2 -> "вторник";
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            case 7 -> "воскресенье";
            default -> "это не день недели";
        };
    }

    // 10 - prints week days in russian from specified by number day onward
    public void printDays (String x) {
        int n;
        switch (x) {
            case "понедельник" -> n = 1;
            case "вторник" -> n = 2;
            case "среда" -> n = 3;
            case "четверг" -> n = 4;
            case "пятница" -> n = 5;
            case "суббота" -> n = 6;
            case "воскресенье" -> n = 7;
            default -> n = -1;
        }

        // assuming I already know how to use for loops
        String[] days = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        if (n == -1) {
            System.out.println("это не день недели");
            return;
        }
        for (int i = n - 1; i < days.length; i++) {
            System.out.println(days[i]);
        }
    }


    /* Exercise 3 */

    // 1 - returning String numbers from 0 to x (including x)
    public String listNums (int x) {
        String result = "0";
        for (int i = 1; i <= x; i++) {
            result += " " + i;
        }
        return result;
    }

    // 2 - returning String of numbers from x to 0 (including 0)
    public String reverseListNums (int x) {
        String result = String.valueOf(x);
        for (int i = x - 1; i >= 0; i--) {
            result += " " + i;
        }
        return result;
    }

    // 3 - returning String of even numbers from 0 to x (including x)
    public String chet (int x) {
        String result = "0";
        for (int i = 2; i <= x; i += 2) {
            result += " " + i;
        }
        return result;
    }

    // 4 - implementing the manual way of x^y without Math.pow
    public int pow (int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    // 5 - getting the length of a number
    public int numLen (long x) {
        int count = 1;
        while (Math.abs(x) > 9) {
            x /= 10;
            count++;
        }
        return count;
    }

    // 6 - checking if a number has the same digits
    public boolean equalNum (int x) {
        int lastDigit = x % 10;

        while (abs(x) > 0) {
            if (x % 10 != lastDigit) return false;
            x /= 10;
        }
        return true;
    }

    // 7 - printing out a square of x size of '*'
    public void square (int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }

    // 8 - printing out a left triangle of x size of '*'
    public void leftTriangle (int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }

    // 9 - printing out a right triangle from '*' of x size
    public void rightTriangle (int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = x - i; j > 0; j--) {
                System.out.print(' ');
            }
            for (int k = 0; k < i; k++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }

    // 10 - guess the number from 0 to 9 game
    public void guessGame() {
        Random random = new Random();
        int target = random.nextInt(10);  // 0 to 9 inclusive
        boolean guessedRight = false;
        int attemptsToGuess = 1;
        Scanner scanner = new Scanner(System.in);

        while (!guessedRight) {
            try {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();

                if (guess == target) {
                    guessedRight = true;
                    System.out.println("\uD83C\uDF89 Correct! The number was " + target);
                    if (attemptsToGuess == 1) {
                        System.out.println("It took you only 1 attempt!");
                    }
                    else {
                        System.out.println("It took you " + attemptsToGuess + " attempts");
                    }
                    break;
                }
                if (guess < 0 || guess > 9) {
                    System.out.println("Please, enter a single digit (0-9)");
                }
                else {
                    System.out.println("Wrong number!");
                    attemptsToGuess++;
                }
            } catch (Exception e) {
                System.out.println("Error reading input. Please try again.");
                scanner.next();
            }
        }
        scanner.close();
    }


    /* Exercise 4 */

    // 0 - NOT A TASK (my own method). Printing out an array of Integers
    public void printIntArray (int[] array) {
        while (true) {
            try {
                System.out.print("[" + array[0]);
                for (int i = 1; i < array.length; i++) {
                    System.out.print("; " + array[i]);
                }
                System.out.print("]" + '\n');
                break;
            } catch (Exception e) {
                System.out.println("The array is empty!");
                break;
            }
        }
    }

    // 1 - getting the index of the first found x in the array
    public int findFirst (int[] arr, int x) {
        int count = 0;
        for (int num : arr) {
            if (x == num) {
                return count;
            }
            else {
                count++;
            }
        }
        return -1;
    }

    // 2 - getting the index of the last found x in the array
    public int findLast (int[] arr, int x) {
        int count = arr.length - 1;
        for (int num = arr.length - 1; num >= 0; num--) {
            if (x == arr[num]) {
                return count;
            }
            else {
                count--;
            }
        }
        return -1;
    }

    // 3 - getting the number with the maximum absolute value in the array
    public int maxAbs (int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (Math.abs(num) > Math.abs(max)) max = num;
        }
        return max;
    }

    // 4 - inserting a number at the specified index in the array
    public int[] add (int[] arr, int x, int pos) {
        int[] newArr = new int[arr.length + 1];

        // copying elements before the insertion point
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = x; // inserting a new number
        // copying elements after the insertion point
        for (int i = pos; i < newArr.length - 1; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }

    // 5 - inserting a new array (ins) at the specified index in the array (arr)
    public int[] add (int[] arr, int[] ins, int pos) {
        int[] newArr = new int[arr.length + ins.length];

        // copying elements before the insertion point
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        // inserting the new array
        for (int i = 0; i < ins.length; i ++) {
            newArr[i + pos] = ins[i];
        }
        // copying elements after the insertion point
        for (int i = pos; i < arr.length; i++) {
            newArr[i + ins.length] = arr[i];
        }

        return newArr;
    }

    // 6 - reversing the array
    public void reverse (int[] arr) {
        for (int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    // 7 - return the reversed array
    public int[] reverseBack (int[] arr) {
        for (int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    // 8 - merging (concatenating) two arrays
    public int[] concat (int[] arr1,int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];

        // inserting the first array
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        // inserting the second array
        for (int i = arr1.length; i < newArr.length; i++) {
            newArr[i] = arr2[i - arr1.length];
        }
        return newArr;
    }

    // 9 - getting the array of indices of every found x in the array
    public int[] findAll (int[] arr, int x) {
        int count = 0;
        for (int num : arr) {
            if (num == x) {
                count++;
            }
        }
        int[] indices = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                indices[index] = i;
                index++;
            }
        }

        return indices;
    }

    // 10 - removing all the negative numbers from the array
    public int[] deleteNegative (int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num >= 0) {
                count++;
            }
        }
        int[] newArr = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num >= 0) {
                newArr[index] = num;
                index++;
            }
        }

        return newArr;
    }
}

