package Module3.HomeWork.ArrayList.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Task12 {
    // Написать Java-программу для извлечения части списка массива.

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);

        List<Integer> subList = numbers.subList(2, 4);
        System.out.println(subList);




    }
}
