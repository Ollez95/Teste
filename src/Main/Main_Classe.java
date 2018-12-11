package Main;

import Entities.Banco;

import java.util.Locale;
import java.util.Scanner;

public class Main_Classe {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Banco bank;

        System.out.print("Enter account number: ");
        double numero_conta = sc.nextDouble();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String titular_conta = sc.nextLine();
        System.out.println("Is there an initial deposit (y/n)?");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.println("Enter initial deposit value: ");
            double deposito_inicial = sc.nextDouble();
            bank = new Banco(numero_conta,titular_conta,deposito_inicial);
        }
        else {
            bank = new Banco(numero_conta,titular_conta);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(bank);

        //System.out.println(bank.deposit_money());
        System.out.println();

        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        bank.deposit_money(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(bank);

        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        bank.withdraw_money(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(bank);

        //LOL dwqdweqweqwe







        System.out.println();
        sc.close();

    }
}
