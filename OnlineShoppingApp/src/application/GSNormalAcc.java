package application;

import framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accNo, String accNm, float charges) {
		super(accNo, accNm, charges);
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
