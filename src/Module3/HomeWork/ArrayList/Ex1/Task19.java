package Module3.HomeWork.ArrayList.Ex1;

import java.util.ArrayList;

public class Task19 {
    // Написать Java-программу для обрезки емкости списка массивов.

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(24);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers.size());
        numbers.trimToSize();
        System.out.println(numbers.size());

    }
}
