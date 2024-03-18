package Module3.HomeWork.ArrayList.Ex1;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Task22 {
    // Напишите программу на Java для печати всех элементов ArrayList, используя положение элементов.

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}