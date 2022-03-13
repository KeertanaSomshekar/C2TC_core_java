package framework;

public abstract class ShopAcc {
	private int accNo;
	private String accNm;
	private float charges;

	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public float getCharges() {
		return charges;
	}

	public void bookProduct(float bp) {
		float PrimeAccCharges = 1299;
		if (PrimeAccCharges == bp) {
			System.out.println("Book Prime Product");
		} else {
			System.out.println("Book Normal Product");
		}
	}

	public void items(float i) {

	}

	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}
}
