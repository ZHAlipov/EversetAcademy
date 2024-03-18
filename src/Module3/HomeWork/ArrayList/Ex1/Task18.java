package Module3.HomeWork.ArrayList.Ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task18 {
    // Напишите программу на Java, проверяющую, пуст ли список массивов или нет.

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);
        System.out.println(numbers.isEmpty());
        numbers.removeAll(numbers);
        System.out.println(numbers);
        System.out.println(numbers.isEmpty());

    }
}
