package application;

import framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	private static final float Charges = 40;

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	}

	public float getCharges() {
		return Charges;
	}

	@Override
	public void bookProduct(float bp) {
		super.bookProduct(bp);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
