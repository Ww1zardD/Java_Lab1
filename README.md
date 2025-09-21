# Lab 1: 

---

## Exercise 1: Methods

### Task 1: Getting only the fractional part

*   **Method:** `fraction(double number)`
*   **Description:** This method takes a `double` as input and returns only its fractional part. It achieves this by subtracting the integer part of the number (obtained by casting the `double` to an `int`) from the original number.
*   **Code:**
    ```java
    public double fraction(double number) {
        return number - (int) number;
    }
    ```
*   **Examples:**
    *   Input: `1.2489` → Output: `0.2489`
    *   Input: `2.7182818285` (Math.E) → Output: `0.7182818285`

### Task 3: Turning a char from 0-9 to number

*   **Method:** `charToNum(char digit)`
*   **Description:** This method converts a character representing a digit ('0' through '9') into its corresponding integer value. It does this by leveraging the ASCII values of characters, subtracting the ASCII value of '0' from the ASCII value of the input digit character.
*   **Code:**
    ```java
    public int charToNum(char digit) {
        return digit - '0';
    }
    ```
*   **Example:**
    *   Input: `'2'` → Output: `2`

### Task 5: Checking if the number has only 2 digits

*   **Method:** `is2Digits(int num)`
*   **Description:** This method determines if an integer is a two-digit number. It checks if the number falls within the ranges of -99 to -10 or 10 to 99, inclusive.
*   **Code:**
    ```java
    public boolean is2Digits(int num) {
        return (num >= 10 && num <= 99) || (num <= -10 && num >= -99);
    }
    ```
*   **Examples:**
    *   Input: `52` → Output: `true`
    *   Input: `144` → Output: `false`
    *   Input: `-44` → Output: `true`
    *   Input: `-100` → Output: `false`

### Task 7: Checking if the num is in the range from a to b

*   **Method:** `isInRange(int a, int b, int num)`
*   **Description:** This method checks if a given integer `num` is within the inclusive range defined by `a` and `b`. It handles cases where `a` is greater than `b` by checking the range from `b` to `a`.
*   **Code:**
    ```java
    public boolean isInRange(int a, int b, int num) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        return num >= a && num <= b;
    }
    ```
*   **Examples:**
    *   Input: `a = 5, b = 1, num = 3` → Output: `true`
    *   Input: `a = 17, b = 53, num = 17` → Output: `true`
    *   Input: `a = 10, b = 4, num = -3` → Output: `false`

### Task 9: Checking if 3 numbers are equal to each other

*   **Method:** `isEqual(int a, int b, int c)`
*   **Description:** This method evaluates if three given integers are equal to one another. It returns `true` if `a` is equal to `b` and `b` is equal to `c`.
*   **Code:**
    ```java
    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }
    ```
*   **Examples:**
    *   Input: `[5; 5; 5]` → Output: `true`
    *   Input: `[94; -94; 32]` → Output: `false`

---

## Exercise 2: Conditions

### Task 1: Checking the explicit abs implementation

*   **Method:** `abs(int num)`
*   **Description:** This method returns the absolute value of an integer. If the input number is less than zero, it multiplies it by -1; otherwise, it returns the number as is.
*   **Code:**
    ```java
    public int abs(int num) {
        if (num < 0) {
            return -num;
        }
        return num;
    }
    ```*   **Examples:**
    *   Input: `-24` → Output: `24`
    *   Input: `12` → Output: `12`

### Task 3: Returning true if divisible by exactly one of: 5 or 7

*   **Method:** `is35(int num)`
*   **Description:** This method checks if an integer is divisible by 5 or 7, but not both. It uses the logical XOR operator (`^`) to ensure the number is divisible by one of the numbers exclusively.
*   **Code:**
    ```java
    public boolean is35(int num) {
        return (num % 5 == 0) ^ (num % 7 == 0);
    }
    ```
*   **Examples:**
    *   Input: `14` → Output: `true`
    *   Input: `25` → Output: `true`
    *   Input: `35` → Output: `false`
    *   Input: `16` → Output: `false`

### Task 5: Getting the max number between the 3

*   **Method:** `max3(int a, int b, int c)`
*   **Description:** This method finds the largest among three integers. It iteratively compares the numbers to determine the maximum value.
*   **Code:**
    ```java
    public int max3(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
    ```
*   **Examples:**
    *   Input: `[5; 7; 7]` → Output: `7`
    *   Input: `[8; -1; 4]` → Output: `8`

### Task 7: If the sum is 10-19 returning 20, otherwise returning the sum

*   **Method:** `sum2(int a, int b)`
*   **Description:** This method calculates the sum of two integers. If the sum is between 10 and 19 (inclusive), it returns 20. Otherwise, it returns the actual sum.
*   **Code:**
    ```java
    public int sum2(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }
    ```
*   **Examples:**
    *   Input: `[5; 7]` → Output: `20`
    *   Input: `[8; -1]` → Output: `7`

### Task 9: Returning the Russian weekday name for the given day number (1-7)

*   **Method:** `day(int dayNum)`
*   **Description:** This method returns the name of the day of the week in Russian based on a given number from 1 to 7. It uses a `switch` statement to map the number to the corresponding day. If the number is outside the 1-7 range, it returns "Error".
*   **Code:**
    ```java
    public String day(int dayNum) {
        switch (dayNum) {
            case 1: return "Понедельник";
            case 2: return "Вторник";
            case 3: return "Среда";
            case 4: return "Четверг";
            case 5: return "Пятница";
            case 6: return "Суббота";
            case 7: return "Воскресенье";
            default: return "Error";
        }
    }
    ```
*   **Examples:**
    *   Input: `5` → Output: `Пятница`
    *   Input: `31` → Output: `Error`
    *   Input: `3` → Output: `Среда`

---

## Exercise 3: Iteration (for & while)

### Task 1: Getting numbers from 0 to x

*   **Method:** `listNums(int x)`
*   **Description:** This method generates a string containing all integers from 0 up to and including `x`. It uses a `for` loop to build the string of numbers.
*   **Code:**
    ```java
    public String listNums(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }
    ```
*   **Example:**
    *   Input: `11` → Output: `0 1 2 3 4 5 6 7 8 9 10 11`

### Task 3: Getting even numbers from 0 to x

*   **Method:** `chet(int x)`
*   **Description:** This method generates a string containing all even integers from 0 up to and including `x`. A `for` loop iterates through the numbers, and an `if` condition checks for evenness.
*   **Code:**
    ```java
    public String chet(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            if (i % 2 == 0) {
                result.append(i).append(" ");
            }
        }
        return result.toString().trim();
    }
    ```
*   **Example:**
    *   Input: `11` → Output: `0 2 4 6 8 10`

### Task 5: Getting the length of a number

*   **Method:** `numLen(int num)`
*   **Description:** This method calculates the number of digits in an integer. It uses a `while` loop to repeatedly divide the number by 10 and count the iterations until the number becomes 0. It handles negative numbers by first taking the absolute value and handles the input `0` as a special case.
*   **Code:**
    ```java
    public int numLen(int num) {
        if (num == 0) {
            return 1;
        }
        int count = 0;
        num = abs(num); // using abs method from Exercise 2
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
    ```
*   **Examples:**
    *   Input: `92556` → Output: `5`
    *   Input: `-11` → Output: `2`

### Task 7: Printing out a square of x size of '*'

*   **Method:** `square(int x)`
*   **Description:** This method prints a square of asterisks (`*`) with a side length of `x`. It uses nested `for` loops to print the rows and columns of the square.
*   **Code:**
    ```java
    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    ```
*   **Examples:**
    *   Input: `2` → Output:
        ```
        **
        **
        ```
    *   Input: `4` → Output:
        ```
        ****
        ****
        ****
        ****
        ```

### Task 9: Printing out a right triangle from '*' of x size

*   **Method:** `rightTriangle(int x)`
*   **Description:** This method prints a right-angled triangle of asterisks (`*`) with a height and base of `x`. It utilizes nested `for` loops where the inner loop's iterations depend on the outer loop's current iteration to form the triangular shape.
*   **Code:**
    ```java
    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    ```
*   **Examples:**
    *   Input: `2` → Output:
        ```
        *
        **
        ```
    *   Input: `4` → Output:
        ```
        *
        **
        ***
        ****
        ```

---

## Exercise 4: Arrays

### Task 1: Getting the index of the first found x number in an array

*   **Method:** `findFirst(int[] arr, int x)`
*   **Description:** This method searches for the first occurrence of an integer `x` in an array `arr`. It returns the index of the first match found. If `x` is not in the array, it returns -1.
*   **Code:**
    ```java
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    ```
*   **Examples:**
    *   Input: `arr = {1, 2, 3, 4, 2, 2, 5}`, `x = 2` → Output: `1`
    *   Input: `arr = {1, 2, 3, 4, 2, 2, 5}`, `x = 7` → Output: `-1`

### Task 3: Getting the number with the maximum absolute value in the array

*   **Method:** `maxAbs(int[] arr)`
*   **Description:** This method finds the number with the largest absolute value in an integer array. It iterates through the array, keeping track of the element with the maximum absolute value seen so far.
*   **Code:**
    ```java
    public int maxAbs(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0; // Or throw an exception
        }
        int maxAbsVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (abs(arr[i]) > abs(maxAbsVal)) {
                maxAbsVal = arr[i];
            }
        }
        return maxAbsVal;
    }
    ```
*   **Example:**
    *   Input: `arr = {1, -2, -7, 4, 2, 2, 5}` → Output: `-7`

### Task 5: Inserting an array at the specified index in the array

*   **Method:** `add(int[] arr, int[] insertedArr, int pos)`
*   **Description:** This method inserts one array (`insertedArr`) into another array (`arr`) at a specified position (`pos`). It creates a new array with the combined length and copies the elements from both arrays into the new one at the correct positions.
*   **Code:**
    ```java
    public int[] add(int[] arr, int[] insertedArr, int pos) {
        int[] result = new int[arr.length + insertedArr.length];
        System.arraycopy(arr, 0, result, 0, pos);
        System.arraycopy(insertedArr, 0, result, pos, insertedArr.length);
        System.arraycopy(arr, pos, result, pos + insertedArr.length, arr.length - pos);
        return result;
    }
    ```
*   **Example:**
    *   Input: `arr = {1, 2, 3, 4, 5}`, `insertedArr = {7, 8, 9}`, `pos = 3` → Output: `{1, 2, 3, 7, 8, 9, 4, 5}`

### Task 7: Returning the reversed array

*   **Method:** `reverseBack(int[] arr)`
*   **Description:** This method reverses the order of elements in an array. It creates a new array of the same size and populates it with the elements of the original array in reverse order.
*   **Code:**
    ```java
    public int[] reverseBack(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }
    ```
*   **Example:**
    *   Input: `arr = {1, 2, 3, 4, 5}` → Output: `{5, 4, 3, 2, 1}`

### Task 9: Getting the array of indices of every found x in the array

*   **Method:** `findAll(int[] arr, int x)`
*   **Description:** This method finds all occurrences of an integer `x` in an array `arr` and returns a new array containing the indices of all matches.
*   **Code:**
    ```java
    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int val : arr) {
            if (val == x) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }
    ```
*   **Example:**
    *   Input: `arr = {1, 2, 3, 8, 2, 2, 9}`, `x = 2` → Output: `{1, 4, 5}`
