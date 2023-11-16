package basics;

import java.util.Scanner;

public class Switch {

//    Дано целое число в диапазоне 1–7. Вывести строку — название дня
//    недели, соответствующее данному числу (1 — «понедельник», 2 — «вторник» и т. д.).

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SwitchSandBox4();
    }

    public static void task11() {

        System.out.println("Enter weekday day number (1-7) : ");
        int weekday = scanner.nextInt();
        if(weekday == 1) {
            System.out.println("Monday");
        } else if(weekday == 2) {
            System.out.println("Tuesday");
        } else if(weekday == 3) {
            System.out.println("Wednesday");
        } else if(weekday == 4) {
            System.out.println("Thursday");
        } else if(weekday == 5) {
            System.out.println("Friday");
        } else if(weekday == 6) {
            System.out.println("Saturday");
        } else if(weekday == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Please enter weekday number between 1-7.");
        }
    }

    public static void daysOfWeek1() {

    }

    public static void daysOfWeek2() {
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
        }
    }

    public static void switchSandBox1() {
        int day = scanner.nextInt();
        switch (day) {
            case 1, 2, 3:
                System.out.println("Monday or Tuesday or Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
        }
    }

    public static void SwitchSandBox4() {
        System.out.println("Enter weekday day number (1-7) : ");
        int day = scanner.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5 -> {
                System.out.println("Working days");
                String name = scanner.next();
                System.out.println(name + " very hard working");
            }
            case 6, 7 -> {
                System.out.println("Week days");
                String name = scanner.next();
                System.out.println(name + " very easily day");
            }
            default -> {
                System.out.println("Otpusk");
                int days = scanner.nextInt();
                System.out.println("Вы свободны " + days + " дней");
            }
        }
    }
}
