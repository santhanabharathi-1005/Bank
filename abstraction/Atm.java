package com.Bank.abstraction;
import com.Bank.implementation.*;
//concretet class
public class Atm  implements BankUser{
	double amt;
	
	@Override
	public void transaction(double amt,Account account,int choice) {
		this.amt=amt;
		Transacion t=new Transacion();
		if(choice == 1)
			t.deposite(amt, account);
		else if (choice==2)
			t.withdraw(amt, account);
		else if (choice==3)
			t.checkbal(account);
		else
			System.out.println("Invalid choice");

	}
	

	}
