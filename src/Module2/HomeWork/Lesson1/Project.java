package Module2.HomeWork.Lesson1;

import java.util.Scanner;

public class Project {

    private String name, type;
    private int cost;
    private boolean isGovermental;

    public Project(String name, int cost, String type, boolean isGovermental) {
        this.name = name;
        this.cost = cost;
        this.type = type;
        this.isGovermental = isGovermental;
    }

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите количество проектов:");
        int budget = scanner.nextInt();
        String specType = scanner.next();
        int num = scanner.nextInt();
        Project[] projSize = new Project[num];

//        for(int i = 0; i < num; i++) {
//            projSize[i](scanner.next(),
//                        scanner.nextInt(),
//                        scanner.next(),
//                        scanner.nextBoolean()
//            ) {
//                System.out.println(projSize[i]);
//            }
//        }
    }

}
