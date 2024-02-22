package Module3.HomeWork.ArrayList.Ex1;

import java.util.ArrayList;
import java.util.Collections;

public class Task14 {
    // Напишите программу на Java, которая меняет местами два элемента в списке массива.

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);
        Collections.swap(numbers, 0, 1);
        System.out.println(numbers);
    }
}
