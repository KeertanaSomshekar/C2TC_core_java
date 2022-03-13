package application;

import framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	private static final float minBal = 500;

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
	}

	public static float getMinbal() {
		return minBal;
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
