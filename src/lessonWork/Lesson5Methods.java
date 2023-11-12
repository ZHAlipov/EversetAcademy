package lessonWork;

import java.util.Scanner;

public class Lesson5Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        greetingsInKazakh(name);
    }

    static void greetingsInKazakh(String name) {
        System.out.println("Salem, " + name);
        whereAreYouFrom(name);
    }

    static void whereAreYouFrom(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where are you from " + name + "?");
        String from = scanner.nextLine();
        System.out.println("Oh cool. Never been there in " + from);
        int age = enterYourAge(name);
        System.out.println("I'm almost " + age + " years old too...");
    }

    static int enterYourAge(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age " + name);
        int age = scanner.nextInt();
        return age;
    }





}
