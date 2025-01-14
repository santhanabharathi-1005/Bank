package com.Bank.Driver;//ctrl shift o

import com.Bank.objectCreation.*;
import com.Bank.abstraction.*;
import com.Bank.implementation.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Select Method to transaction\nATM--->1111\nPhonePay--->2222\nGpay--->3333");
		System.out.print("Enter method to transaction : ");
		int choice = sc.nextInt();

		// System.out.println();
		System.out.print("Enter your name : ");
		String name = sc.next();
		// System.out.println();
		System.out.print("Enter account number ");
		long accno = sc.nextLong();

		Account account = new Account(name, accno);// --------->1 step
		ServiceTransaction service = new ServiceTransaction();// ---------->step2
		BankUser user1 = service.Login(choice);// -------------->step 3
		System.out.print("Enter ammout to add ");
		double amt = sc.nextDouble();
		user1.transaction(amt, account, choice);
		Transacion t1 = new Transacion();

		System.out.println("Select Options \nDeposite--->1\nwithdraw--->2\nCheckbalance-->3");

		int i = sc.nextInt();

		if (user1 != null) {

			switch (i) {
				case 1:
					if (i == 1) {
						System.out.print("Enter amount to deposite :");
						double dep_amt = sc.nextDouble();
						t1.deposite(dep_amt, account);
						break;
					}
				case 2:
					if (i == 2) {
						System.out.print("Enter amount to deposite :");
						double withdraw_amt = sc.nextDouble();
						t1.withdraw(withdraw_amt, account);
						break;
					}
				case 3:

					t1.checkbal(account);
					break;
				default:
					System.out.println("null");
					break;

			}
			sc.close();
		}
	}
}
