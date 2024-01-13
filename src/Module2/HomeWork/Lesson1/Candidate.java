package Module2.HomeWork.Lesson1;

import java.util.Objects;
import java.util.Scanner;

public class Candidate {
    //У нас есть частный элитный клуб
    //Создайте список кандидатов для участия в нашей суперзакрытой вечеринке.
    //Есть некоторые правила
    //Мы не любим банкиров
    //Мы не берём людей, которые берут меньше 1000$.
    //Нам не нравятся люди с фамилией «Джонсон» или «Эдиссон».
    //(Обратите внимание, что имя и фамилия — это одна строка. В программе ее нужно разделить)
    //Распечатайте список кандидатов, который мы можем передать клубу.
    private String name, work;
    private int income;

    public Candidate(String name, String work, int income) {
        this.name = name;
        this.work = work;
        this.income = income;
    }

    public String getName() {
        return this.name;
    }

    public int getIncome() {
        return this.income;
    }

    public String getWork() {
        return this.work;
    }

    @Override
    public String toString() {
        return "%s".formatted(this.name);
    }
}

class CandidateDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество заявок на приглашение:");
        int num = scanner.nextInt();
        Candidate[] candidates = new Candidate[num];
        System.out.println("Введите клиента по заявке:");

            for (int i = 0; i < num; i++) {
                scanner.nextLine();
                String name = scanner.nextLine();
                String work = scanner.next();
                int  income = scanner.nextInt();
                candidates[i] = new Candidate(
                        name,
                        work,
                        income
                );
                if ((candidates[i].getIncome() >= 1000)
                    & (!(candidates[i].getWork().equals("banker")) == true)
                    & (!candidates[i].getName().split(" ")[1].equals("Johnson"))
                    & (!candidates[i].getName().split(" ")[1].equals("Edisson"))
                ) {
                    System.out.println(candidates[i]);
                }
            }
    }
}

/*
James Clark
banker 5000
Edvin Johnson
architect 3000
Katty Wesley
designer 5500
Bread Pitt
cooker 3000
Jane Edisson
scientist 2500
William Johnson
banker 1100
Askar Balgabek
dianolicisonist 10
Liam Turvey
designer 6500
*/