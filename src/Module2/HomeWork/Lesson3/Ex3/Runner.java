package Module2.HomeWork.Lesson3.Ex3;

import Module2.HomeWork.Lesson3.Ex4.Gender;

public class Runner {

    public static void main(String[] args) {
        Customer customer = new Customer(1, "Carl", Gender.m);
        Customer customer1 = new Customer(2, "Sara", Gender.f);

        System.out.println(customer.getid() + " " + customer.getName() + " " + customer.getGender());
        System.out.println(customer.toString());

        Account account = new Account(1, customer, 10000);
        Account account1 = new Account(2, customer1);
        System.out.println(account.toString());
        System.out.println(account1.toString());

        System.out.println("Пополнение депозита клиентов");
        account.deposit(1000);
        account1.deposit(350);
        System.out.println(account.toString());
        System.out.println(account1.toString());

        System.out.println("Запускаем метод withdraw:");
        account.withdraw(800);
        account1.withdraw(110000);
        System.out.println(account.toString());
        System.out.println(account1.toString());



    }

}
