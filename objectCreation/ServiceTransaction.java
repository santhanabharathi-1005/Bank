package com.Bank.objectCreation;
import com.Bank.abstraction.*;
public class ServiceTransaction {
public BankUser Login(int pin) {
	if(pin==1111)
		return new Atm();
	else if(pin==2222)
		return new PhonePay();
	else if(pin==3333)
		return new Gpay();
	else
		System.out.println("Invalid pin");
		return null;
}
}
