package Module3.HomeWork.ArrayList.Ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task8 {
    // Напишите программу на Java для сортировки заданного списка массивов. Список строк.

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("C");
        strings.add("F");
        strings.add("B");
        strings.add("D");
        strings.add("E");
        strings.add("А");

        System.out.println(strings);
        Collections.sort(strings, String.CASE_INSENSITIVE_ORDER);
        System.out.println(strings);


    }

}
