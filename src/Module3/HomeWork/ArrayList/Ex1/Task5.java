package Module3.HomeWork.ArrayList.Ex1;

import java.util.ArrayList;

public class Task5 {
    //5. Написать Java-программу для обновления элемента массива по индексу на заданный элемент.

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);

        numbers.set(1,9);

        System.out.println(numbers);
    }
}
