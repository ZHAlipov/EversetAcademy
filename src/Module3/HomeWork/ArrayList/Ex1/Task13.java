package Module3.HomeWork.ArrayList.Ex1;

import java.util.ArrayList;

public class Task13 {
    // Напишите программу на Java для сравнения двух списков массивов.

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);

        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);
        System.out.println(numbers1);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(3);
        numbers2.add(6);
        numbers2.add(9);
        System.out.println(numbers2);

        System.out.println(numbers.equals(numbers1));
        System.out.println(numbers.equals(numbers2));
    }
}
