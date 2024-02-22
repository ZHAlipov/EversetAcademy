package Module3.HomeWork.ArrayList.Ex1;

import java.util.ArrayList;

public class Task6 {
    //6. Напишите программу на Java для удаления третьего элемента из списка массива. Список строк.

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("Lorem");
        strings.add("Ipsum");
        strings.add("Dolor");
        System.out.println(strings);
        strings.remove(2);
        System.out.println(strings);

    }
}
