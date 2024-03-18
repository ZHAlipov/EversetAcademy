package Module3.HomeWork.ArrayList.Ex1;

import java.util.ArrayList;
import java.util.Collections;

public class Task17 {
    // Напишите программу на Java для очистки списка массивов.

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);
        numbers.clear();
        System.out.println(numbers);
    }
}
