package goShoppingApp;

import java.util.Scanner;

import application.*;
import framework.*;

public class GoShopping {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Account Number");
		int accNo = scan.nextInt();
		System.out.println("Enter the Account Name");
		String accNm = scan.next();
		System.out.println("Enter the charge");
		float charges = scan.nextFloat();
		
		ShopFactory sf = new GSShopFactory();
		while(true) {
			System.out.println("Press 1 ---> Prime Account");
			System.out.println("Press 2 ---> Normal Account");
			System.out.println("Any Other Number ---> Stop");
			System.out.println("Enter your Choice: ");
			int ch = scan.nextInt();
			switch(ch) {
			case 1:
			sf.getNewPrimeAcc(accNo, accNm, charges, true);
			PrimeAcc pa = new GSPrimeAcc(accNo , accNm, charges, true);
			pa.bookProduct(charges);
			String s = pa.toString();
			System.out.println(s);
			System.exit(0);
			case 2: 
				sf.getNewNormalAcc(accNo, accNm, charges);
				NormalAcc na = new GSNormalAcc(ch, accNm, charges);
				na.bookProduct(charges);
				String n = na.toString();
				System.out.println(n);
				System.exit(0);
			default:
				System.out.println("INVALID ACCOUNT!!");
				System.exit(0);
			}
		}
	}
}
