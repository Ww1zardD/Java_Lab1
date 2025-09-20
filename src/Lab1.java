import java.util.Scanner;
import java.util.Random; // used for

public class Lab1 {
    /* Methods for checking the user input */

    // Empty input (to let user have time to read the output after their input)
    public void emptyInput(Scanner scanner) {
        // Gray text: \u001B[90m, Reset: \u001B[0m
        System.out.print("\u001B[90mPress Enter to continue...\u001B[0m");
        scanner.nextLine();
    }

    // for double
    public double doubleInputCheck(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Enter a double value: ");
                //return scanner.nextDouble();

                double number = scanner.nextDouble();
                scanner.nextLine();
                return number;
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid double number.");
                scanner.nextLine();
            }
        }
    }

    // for char (0-9) (exercise 1 task 3)
    public char charInputCheck(Scanner scanner) {
        while (true) {
            System.out.print("Enter a digit (0-9): ");
            String input = scanner.next();
            scanner.nextLine();

            if (input.length() == 1) {
                char oneChar = input.charAt(0);
                if (Character.isDigit(oneChar)) {
                    return oneChar;
                }
            }
            System.out.println("Invalid input! Please enter a single digit (0-9).");
        }
    }

    // for int
    public int intInputCheck(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Enter an integer value: ");
                int number = scanner.nextInt();
                scanner.nextLine();
                return number;
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid integer number.");
                scanner.nextLine();
            }
        }
    }

    // for int array
    public int[] createArrayFromInput(Scanner scanner) {
        int length = 0;
        while (true) {
            try {
                System.out.print("Enter the length of the array: ");
                length = scanner.nextInt();
                if (length <= 0) {
                    System.out.println("Length must be positive. Please try again.");
                    continue;
                }
                scanner.nextLine(); // Clear the buffer
                break;
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.nextLine();
            }
        }

        String[] numbers = null;
        while (true) {
            try {
                System.out.print("Enter " + length + " numbers separated by space: ");
                String input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    System.out.println("No input detected. Please try again.");
                    continue;
                }

                numbers = input.split("\\s+");

                if (numbers.length != length) {
                    System.out.println("You entered " + numbers.length + " numbers, but expected " + length);
                    System.out.println("Please enter exactly " + length + " numbers.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
            }
        }

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            try {
                array[i] = Integer.parseInt(numbers[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: '" + numbers[i] + "'. Using 0 instead.");
                array[i] = 0;
            }
        }

        return array;
    }


    /* Exercise 1 */

    // 1 - getting only the fractional part
    public double fraction(double x) {
        return x - (int) x;
    }

    // 3 - getting number from char
    public int charToNum(char x) {
        return x - '0';
    }

    // 5 - does it have only two digits
    public boolean is2Digits(int x) {
        return x / 100 == 0;
    }

    // 7 - is num in the range between of a-b or b-a
    public boolean isInRange(int a, int b, int num) {
        return (a <= num && num <= b) || (b <= num && num <= a);
    }

    // 9 - are these 3 numbers equal to each other
    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }


    /* Exercise 2 */

    // 1 - explicit ABS implementation
    public int abs(int x) {
        if (x >= 0) return x;
        else return -x;
    }

    // 3 - returning true if divisible by exactly one of: 5 or 7
    public boolean is35(int x) {
        return (x % 5 == 0) != (x % 7 == 0);
    }

    // 5 - getting the max number with only 2 not nested if statements
    public int max3(int x, int y, int z) {
        if (x >= y && x >= z) return x;
        else if (y >= x && y >= z) return y;
        else return z;
    }

    // 7 - if the sum is 10-19 returning 20, otherwise returning the sum
    public int sum2(int x, int y) {
        if (x + y >= 10 && x + y <= 19) return 20;
        else return x + y;
    }

    // 9 - returning the Russian weekday name for the given day number (1-7)
    public String day(int x) {
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


    /* Exercise 3 */

    // 1 - returning String numbers from 0 to x (including x)
    public String listNums(int x) {
        String result = "0";
        for (int i = 1; i <= x; i++) {
            result += " " + i;
        }
        return result;
    }

    // 3 - returning String of even numbers from 0 to x (including x)
    public String chet(int x) {
        String result = "0";
        for (int i = 2; i <= x; i += 2) {
            result += " " + i;
        }
        return result;
    }

    // 5 - getting the length of a number
    public int numLen(long x) {
        int count = 1;
        while (Math.abs(x) > 9) {
            x /= 10;
            count++;
        }
        return count;
    }

    // 7 - printing out a square of x size of '*'
    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }

    // 9 - printing out a right triangle from '*' of x size
    public void rightTriangle(int x) {
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


    /* Exercise 4 */

    // 0 - NOT A TASK (my own method). Printing out an array of Integers
    public void printIntArray(int[] array) {
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
    public int findFirst(int[] arr, int x) {
        int count = 0;
        for (int num : arr) {
            if (x == num) {
                return count;
            } else {
                count++;
            }
        }
        return -1;
    }

    // 3 - getting the number with the maximum absolute value in the array
    public int maxAbs(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (Math.abs(num) > Math.abs(max)) max = num;
        }
        return max;
    }

    // 5 - inserting a new array (ins) at the specified index in the array (arr)
    public int[] add(int[] arr, int[] ins, int pos) {
        int[] newArr = new int[arr.length + ins.length];

        // copying elements before the insertion point
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        // inserting the new array
        for (int i = 0; i < ins.length; i++) {
            newArr[i + pos] = ins[i];
        }
        // copying elements after the insertion point
        for (int i = pos; i < arr.length; i++) {
            newArr[i + ins.length] = arr[i];
        }

        return newArr;
    }

    // 7 - return the reversed array
    public int[] reverseBack(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    // 9 - getting the array of indices of every found x in the array
    public int[] findAll(int[] arr, int x) {
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
}