package framework;

public abstract class PrimeAcc extends ShopAcc {
	private boolean isPrime;
	private static final float deliveryCharges = 40;

	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}

	public boolean isPrime() {
		return isPrime;
	}

	public static float getDeliverycharges() {
		return deliveryCharges;
	}

	@Override
	public void bookProduct(float bp) {
		getDeliverycharges();
		super.bookProduct(bp);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
