package com.Bank.abstraction;
import com.Bank.implementation.*;
 public interface BankUser {
	 // by default public
	public void transaction(double amt,Account account,int choice);
}
