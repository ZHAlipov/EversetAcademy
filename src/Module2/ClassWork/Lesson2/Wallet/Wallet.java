package Module2.ClassWork.Lesson2.Wallet;


import java.util.Scanner;

public class Wallet {
    private double balance;

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance += amount;
    }

    public void transferTo(Wallet targetWallet, double amount) {

    }

    public void getBalance(){
        System.out.println(balance);
    }
}

class InvestmentCalculator {
    private double initialAmount;
    private int annualInterestRate ;
    private Wallet wallet;

    public void calculateEarnings(int years) {
        double A;
        double P = initialAmount;
        int r = annualInterestRate;
        int n = 1;
        int t = years;

        A = P * (1 + ((double) r/n)) * n*t;
        System.out.println(A);
    }

    public double getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(double initialAmount) {
        this.initialAmount = initialAmount;
    }

    public int getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(int annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}

class WalletTest {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Wallet wallet1 = new Wallet();
        InvestmentCalculator invstCalc = new InvestmentCalculator();
        System.out.print("Начальная сумма вклада: ");
        invstCalc.setInitialAmount(scanner.nextDouble());
        System.out.print("Годовая процентная ставка: ");
        invstCalc.setAnnualInterestRate(scanner.nextInt());
        System.out.print("Количество лет: ");
        invstCalc.calculateEarnings(scanner.nextInt());

        wallet1.getBalance();
    }
}
