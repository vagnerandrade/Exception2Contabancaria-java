package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter account data");
		System.out.print("Number:");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial Balance");
		double iniBalance = sc.nextDouble();
		System.out.print("Withdraw Limit");
		double withdrawLim = sc.nextDouble();
		
		Account account = new Account(number, holder, iniBalance, withdrawLim);
		
		System.out.println();
		System.out.print("Enter amount for withdraw");
		double amount = sc.nextDouble();
		
		account.withdraw(amount);
		System.out.println(account);
		} catch (DomainException e) {
			System.out.println("Withdraw error: "+ e.getMessage());
		}catch (RuntimeException e) {
			System.out.println("unexpected error ");
		}
		
		sc.close();
	}
}
