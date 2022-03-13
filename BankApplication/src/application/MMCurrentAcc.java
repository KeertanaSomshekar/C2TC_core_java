package application;

import framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}

	@Override
	public void withdraw(float wd) {
		super.withdraw(wd);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
