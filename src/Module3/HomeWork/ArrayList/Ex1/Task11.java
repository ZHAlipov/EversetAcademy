package Module3.HomeWork.ArrayList.Ex1;

import java.util.ArrayList;
import java.util.Collections;

public class Task11 {
    // Напишите программу на Java для перестановки элементов в списке массива.

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);

        Collections.reverse(numbers);
        System.out.println(numbers);

    }
}
