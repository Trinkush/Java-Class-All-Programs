//Includes General Withdraw And Balance code of Java for AtmMachine 


import java.util.Scanner;

class Bank {

    public String name[] = {"Sonanshu", "Trinkush"};
    public int acc[] = {111111, 22222};
    public int pin[] = {1234, 5678};
    public int balance[] = {50000, 60000};
}

class Branch extends Bank {

    void mainMenu(int currentuser) {
        Bank obj = new Bank();
        System.out.println("Welcome to xyz ATM");
        System.out.println("Hi!" + obj.name[currentuser] + "Please select from menu or press -1 to exit");
        System.out.println("Choose 1 for Withdraw");
        System.out.println("Choose 2 for Balance");
        System.out.println("Choose -1 to exit");

        Scanner input = new Scanner(System.in);
        int option = input.nextInt();

    }

    void atmRun(int acc) {

        Bank obj = new Bank();

        for (int i = 0; i < 2; i++) {

            if (obj.acc[i] == acc) {

                mainMenu(i);

            } else {

                System.out.println("please try again .. ");
            }

        }

    }

}

public class AtmMachine {

    public static void main(String[] args) {

        Branch obj = new Branch();

        obj.atmRun(111111);

    }

}
