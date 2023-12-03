package moduleProject;

import java.util.Scanner;

public class CinemaSystem {
    
    private static char[][] cinemaHall;
    private static int rows = 0;
    private static int seats = 0;
    private static int nMenuNumber = 1;
    private static int soldTickets = 0;
    
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        initializeCinemaHall();
        printSeats();
        menu();
    }

    public static void initializeCinemaHall() {
        System.out.println("Enter rows number: ");
        rows = scanner.nextInt();
        System.out.println("Enter seats number: ");
        seats = scanner.nextInt();

        cinemaHall = new char[rows][seats];

        System.out.println("Инициализация кинозала");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                cinemaHall[i][j] = 'S';
            }
        }
    }

    public static void printSeats() {


        //Печатаем номера мест
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int m = 1; m <= seats; m++) {
            System.out.print(m + " ");
        }
        System.out.println();

        //Печатаем ряды
        for (int i = 0; i < rows; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < seats; j++) {
                System.out.print(cinemaHall[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void menu() {
        nMenuNumber = 1;

        while (nMenuNumber != 0) {
            System.out.println("\n1. Print seats\n2. Buy a ticket\n3. Show statistics\n0. Exit");
            nMenuNumber = scanner.nextInt();
            if (nMenuNumber == 1) {
                printSeats();
            } else if (nMenuNumber == 2) {
                buyTicket();
            } else if (nMenuNumber == 3) {
                statistics();
            } else {
                System.out.println("Введено неверное значение!");
            }
        }
    }

    static void buyTicket() {
        System.out.println("Покупка билета.\n Введите ряд: ");
        int nBuyRow = scanner.nextInt();
        System.out.println("Введите место: ");
        int nBuySeat = scanner.nextInt();
        int nFreePlace = 0;


        //"Если же мест для покупки не осталось, то выводите сообщение All seats are booked!"
        //Посчитать циклом количество свободных мест (S)
        //Если cntS = 0 то

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                if (cinemaHall[i][j] == 'S') {
                    nFreePlace ++;
                }
            }
        }

        if (nFreePlace == 0) {
            System.out.println("All seats are booked!");
        } else {
            if (nBuyRow-1 > rows || nBuySeat-1 > seats) {
                System.out.println("Such seat doesn’t exist");
            } else if (cinemaHall[nBuyRow - 1][nBuySeat - 1] == 'S') {
                cinemaHall[nBuyRow - 1][nBuySeat - 1] = 'B';
                System.out.println("Price: 10$");
                soldTickets += 10;
            } else if (cinemaHall[nBuyRow - 1][nBuySeat - 1] == 'B') {
                System.out.println("This seat is already booked!");
            }
        }
    }

    static void statistics() {
        int numFreeSeats = 0;
        int numTotalSeats = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                if (cinemaHall[i][j] == 'S') {
                    numFreeSeats ++;
                }
                numTotalSeats ++;
            }
        }

        System.out.printf("Current income: %d $%n", soldTickets);
        System.out.printf("Total income: %d $%n", (rows*seats)*10);
        System.out.printf("Number of free seats: %d $%n", numFreeSeats);
        System.out.printf("Total number of seats: %d $%n", numTotalSeats);
    }
}