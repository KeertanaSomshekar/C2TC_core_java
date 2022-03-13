package application;

import framework.BankFactory;

public class MMBankFactory extends BankFactory {
	public MMSavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		System.out.println("Savings Account created!!");
		return null;
	}

	public MMCurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		System.out.println("Current Accout Created!!");
		return null;
	}
}
