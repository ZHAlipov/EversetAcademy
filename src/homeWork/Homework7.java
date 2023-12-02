package homeWork;

import java.util.Scanner;

public class Homework7 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printArray(selectionSort(initializeArray()));
        task1();
    }

    static int[] initializeArray() {
        System.out.print("Введите размер массива: \n");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Введите значение массива индекса %d%n", i);
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] array) {
        // Вывод отсортированного массива
        System.out.print("Массив = {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }



//    Exercise 1: Write a program to store elements in an array and print it
//    Sample Output
//    Array Size = 5
//    Element of a[0] = 5
//    Element of a[1] = 11
//    Element of a[2] = 22
//    Element of a[3] = 33
//    Element of a[4] = 44
//    Display Array Elements
//        5
//        11
//        22
//        33
//        44

    static void task1() {
        int[] array = {5, 11, 22, 33, 44};
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }

//    Exercise 2: Write a program to calculate the average value of array elements
//    Sample Output
//    Array = {1, 2, 3, 4, 5}
//    Sum of Array Value : 15
//    Average of Array Value : 3.0
    static void task2() {
        int sum = 0;
        double avg = 0;
        int[] array = {1, 2, 3, 4, 5};

        for (int i = 0; i < 5; i++) {
            sum += array[i];

        }
        System.out.println("Сумма чисел массива: " + sum);
        avg = sum / array.length;
        System.out.println("Среднее число значений массива: " + avg);
    }
//    Exercise 3: Write a program to print sum values of an array
//    Sample Output
//    Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
//    Sum Values of Array = 55

    static void task3() {
        int sum = 0;
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < 10; i++) {
            sum += array[i];
        }
        System.out.println("Sum values of Array = " + sum);
    }
//    Exercise 4: Write a program to Sort Numeric Array In Ascending Order
//    Sample Output
//    Array = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2}
//    Ascending Order = {2, 3, 3, 5, 20, 23, 30, 67, 70, 79}
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j]<min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp =array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
        return array;
}

//    Exercise 5: Write a program to Sort Numeric Array In Descending Order
//    Sample Output
//    Array = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2}
//    Descending Order = {79, 70, 67, 30, 23, 20, 5, 3, 3, 2}
    public static void descendingSort(int[] array) {

        // Разворот порядка элементов массива для получения убывающего порядка
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

}

//    static void sortArray(int[] arr) {
//        int n = arr.length
//    }

//    Exercise 6: Write a program to array elements to print cubic values
//    Sample Output
//    Array = {1, 2, 3, 4, 5}
//    Cubic Array Elements =1 8 27 64 125
//    Exercise 7: Write a program to find the maximum and minimum element in an array
//    Sample Output
//    Array = {23, 4, 32, 5, 75}
//    Maximum Element of Array = 75
//    Minimum Element of Array = 4
//    Exercise 8: Write a program to array elements print all Odd number
//    Sample Output
//    Array = {23, 45, 67, 34, 78}
//    Odd Array Elements = 23 45 67
//    Exercise 9: Write a program to array elements print all Even number
//    Sample Output
//    Array = {23, 45, 89, 34, 12}
//    Even Array Elements = 34 12
//    Exercise 10: Write a program to array elements to print sum of Odd Numbers
//    Sample Output
//    Array = {12, 34, 59, 45, 22}
//    Sum of Odd Array Elements = 104
//    Exercise 11: Write a program to array elements to print sum of Even Numbers
//    Sample Output
//    Array = {56, 78, 45, 79, 34}
//    Sum of Even Array Elements = 168
//    Exercise 12: Write a program to array elements to print sum of Cubic Values
//    Sample Output
//    Array = {1, 2, 3, 4, 5}
//    Sum of Cubic Array Elements = 225
//    Exercise 13: Write a program in to copy the elements of one array into another array
//    Sample Output
//    Array = {1, 2, 3, 4, 5}
//    Copy Array Elements one to Another Array = {1, 2, 3, 4, 5}
//    Exercise 14: Write a program to merge two arrays elements to store third array
//    Sample Output
//    First Array = {1, 2, 3, 4, 5}
//    First Array = {6, 7, 8, 9, 10}
//    Merge two Array Elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
//    Exercise 15: Write a program to array elements print all Positive number
//    Sample Output
//    Array = {67, -4, 3, -5, 44}
//    Positive Array Elements = {67, 3, 44}
//    Exercise 16: Write a program to array elements print all Negative number
//    Sample Output
//    Array = {-45, 32, -7, 3, -6}
//    Negative Array Elements = {-45, -7, -6}
//    Exercise 17: Write a program to array elements to print sum of Positive Numbers
//    Sample Output
//    Array = {1, -2, 3, 3, 4}
//    Sum of Positive Array Elements = 7
//    Exercise 18: Write a program to array elements to print sum of Negative Numbers
//    Sample Output
//    Array = {10, -23, 45, -10, 30}
//    Sum of Negative Array Elements = -33
//    Exercise 19: Write a program to search an element in an array
//    Sample Output
//    Array = {10, 20, 30, 40, 50}
//    Search Array Elements = 30
//    Element is Found in the Position = 3
//    Element is Found in the Index = 2
//    Exercise 20: Write a program to Delete Duplicate Elements from an Array
//    Sample Output
//    Array = {10, 10, 20, 20, 30}
//    After Remove Duplicate Array Elements = {10, 20, 30 }
//    Exercise 21: Write a program to Print Unique Elements in Array
//    Sample Output
//    Array = {10, 20, 40, 20, 10}
//    Display Array Unique Elements = {10, 20, 40 }
//    Exercise 22: Write a program to find the second smallest element in an array
//    Sample Output
//    Array = {10, 20, 5, 2, 30}
//    Second Smallest Element = 5
//    Exercise 23: Write a program that identifies the Even elements in two arrays and creates a third array with those elements
//    Sample Output
//    First Array = {1, 2, 3, 4, 5}
//    Second Array = {6, 7, 8, 9, 10}
//    Even Element Store in Third Array = {2, 4, 6, 8, 10}
//    Exercise 24: Write a program that identifies the Odd elements in two arrays and creates a third array with those elements
//    Sample Output
//    First Array = {1, 2, 3, 4, 5}
//    Second Array = {6, 7, 8, 9, 10}
//    Odd Element Store in Third Array = {1, 3, 5, 7, 9}
//    Exercise 25: Write a program to find the common elements between two arrays of integers
//    Sample Output
//    First Array = {10, 20, 30, 40, 50}
//    Second Array = {10, 30, 60, 50, 70}
//    Common Array Elements = {10, 30, 50}
//    Exercise 26: Write a program to find the second Largest element in an array
//    Sample Output
//    Array = {10, 20, 30, 40, 50}
//    Second Largest Element = 40
//    Exercise 27: Write a program to find a missing number in an array
//    Sample Output
//    Array = {1, 2, 4, 5, 6, 7}
//    Missing Array Number = 3



