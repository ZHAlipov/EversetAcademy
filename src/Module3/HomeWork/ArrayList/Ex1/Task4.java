package Module3.HomeWork.ArrayList.Ex1;

import java.util.ArrayList;

public class Task4 {
    //Написать Java-программу для извлечения элемента (по заданному индексу) из заданного списка массивов.

    public static void main(String[] args) {
        ArrayList<Float> numbers = new ArrayList<>();
        numbers.add(5.6f);
        numbers.add(1.3f);
        numbers.add(3.4f);

        System.out.println(numbers);

        numbers.remove(1);

        System.out.println(numbers);

    }
}
