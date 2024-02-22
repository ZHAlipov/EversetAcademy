package Module3.HomeWork.ArrayList.Ex1;

import java.util.ArrayList;
import java.util.Collections;

public class Task16 {
    // Напишите программу на Java для клонирования списка массивов в другой список массивов.

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        ArrayList<Integer> numbers1 = (ArrayList<Integer>) numbers.clone();

        numbers1.remove(0);
        System.out.println(numbers);
        System.out.println(numbers1);
        System.out.println(numbers.hashCode());
        System.out.println(numbers1.hashCode());
    }
}
