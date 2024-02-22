package Module3.HomeWork.ArrayList.Ex1;

import java.util.ArrayList;
import java.util.Collections;

public class Task9 {
    // Напишите программу на Java для копирования одного списка массивов в другой.

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();


        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);

        ArrayList<Integer> numbers1 = numbers;
        System.out.println(numbers1);

    }
}
