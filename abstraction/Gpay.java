
package com.Bank.abstraction;
import com.Bank.implementation.*;
//import com.Bank.objectCreation.ServiceTransaction;
public class Gpay implements BankUser{

	@Override
	public void transaction(double amt,Account account,int choice) {
		Transacion t=new Transacion();
		if(choice ==1)
			t.deposite(amt, account);
		else if (choice==2)
			t.withdraw(amt, account);
		else if (choice==3)
			t.checkbal(account);
		else
			System.out.println("Invalid choice");

	}
	public void send (double amt) {
		System.out.println("ammount sent"+amt);
	}
	public void receive () {
		System.out.println("ammount received");
	}

}

