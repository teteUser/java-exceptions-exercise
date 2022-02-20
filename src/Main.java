import model.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = scan.nextInt();
        scan.nextLine();
        System.out.print("Holder: ");
        String name = scan.nextLine();
        System.out.print("Initial balance: ");
        double balance = scan.nextDouble();
        System.out.print("Withdraw limit: ");
        double limit = scan.nextDouble();

        Account account = new Account(number, name, balance, limit);

        System.out.print("\nEnter amount for withdraw: ");
        double withdraw = scan.nextDouble();
        account.withdraw(withdraw);




        scan.close();
    }

}
