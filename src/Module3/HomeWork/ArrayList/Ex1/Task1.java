package Module3.HomeWork.ArrayList.Ex1;

import java.util.ArrayList;

public class Task1 {
    //1. Напишите Java-программу, которая создаст список, добавит в него несколько цветов (строк) и выведет коллекцию на std out.

    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("Black");
        color.add("White");

        System.out.println(color);
    }

}
