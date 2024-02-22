package Module3.HomeWork.ArrayList.Ex1;

import java.util.ArrayList;
import java.util.Collections;

public class Task15 {
    // Напишите программу на Java для объединения двух списков массивов.

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(3);
        numbers1.add(4);
        numbers1.addAll(numbers);

        System.out.println(numbers1);

    }
}
