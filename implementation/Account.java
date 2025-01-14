package com.Bank.implementation;

public class Account {
	private String name;
	private long accno;
	private double bal;
	public Account(String name,long accno){
		this.name=name;
		this.accno=accno;

	}
	public void account(String name,long accno) {
		{
			System.out.println(name+"account no is"+accno);
		}
	}
	public String getname() {
		return name;
	}
	public long getaccno() {
		return accno;
	}
	public double getbal() {
		return bal;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setaccno(long accno) {
		this.accno=accno;
	}
	public void setbal(double bal) {
		this.bal=bal;
	}
}
