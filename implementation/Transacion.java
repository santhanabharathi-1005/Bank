package com.Bank.implementation;
public class Transacion {

	private Account account;
	
	public void deposite(double amt,Account account) {
		if(amt>0) {
		account.setbal(account.getbal()+amt);
		System.out.println("Amount deposite succesfully :"+account.getbal());
		}
		else
			System.out.println("invalid");
	}
	public void withdraw(double amt,Account account) {
		if(amt<=account.getbal()) {
		account.setbal(account.getbal()-amt);
		System.out.println("Amount withdraw succesfully"+account.getbal());
		}
		else
			System.out.println("current balance = 00.0");
	}
	public void checkbal(Account account) {
		System.out.println("Current balance"+account.getbal());
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account=account;
	}
//	public void display() {
//		System.out.println(account);
//		System.out.println("account number of "+account.getname()+" is "+account.getaccno());
//		System.out.println("balance is "+account.getbal());
//		System.out.println(account.getname());
//	}
}
