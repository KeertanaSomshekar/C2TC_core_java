package application;

import framework.ShopFactory;

public class GSShopFactory extends ShopFactory {
	public GSPrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		System.out.println("Account Details");
		System.out.print(accNo+" "+accNm);
		System.out.println(" ");
		System.out.println("PRIME ACCOUNT CREATED!!");
		return null;
	}

	public GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges) {
		System.out.println("Account Details");
		System.out.print(accNo+" "+accNm);
		System.out.println(" ");
		System.out.println("NORMAL ACCOUNT CREATED!!");
		return null;
	}
}
