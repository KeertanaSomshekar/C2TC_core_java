package bankApp;

import java.util.Scanner;

import application.*;
import framework.*;

public class MoneyMoneyBank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter account number");
		int accNo = scan.nextInt();
		System.out.println("Enter account holder name");
		String accNm = scan.next();
		System.out.println("Enter account Balance");
		float accBal = scan.nextFloat();
		System.out.println("Is Salaried? ");
		boolean isSalaried = scan.nextBoolean();

		BankFactory bf = new MMBankFactory();
		while (true) {
			System.out.println("Press 1 ----> Savings Account");
			System.out.println("Press 2 ---> Current Account");
			System.out.println("Any other number ---> stop");
			System.out.println("Enter your choice: ");
			int ch = scan.nextInt();

			switch (ch) {

			case 1:
				bf.getNewSavingAcc(accNo, accNm, accBal, isSalaried);
				SavingAcc sa = new MMSavingAcc(accNo, accNm, accBal, isSalaried);
				System.out.println("Enter amount to withdraw from saving account");
				sa.withdraw(scan.nextFloat());
				String s = sa.toString();
				System.out.println(s);

				System.exit(0);

			case 2:
				System.out.println("Enter the amount credit");
				float credit = scan.nextFloat();
				bf.getNewCurrentAcc(accNo, accNm, accBal, credit);
				CurrentAcc ca = new MMCurrentAcc(accNo, accNm, accBal, credit);
				System.out.println("Enter amount to withdraw from current account");
				ca.withdraw(scan.nextFloat());
				String c = ca.toString();
				System.out.println(c);
				System.exit(0);

			default:
				System.out.println("INVALID ACCOUNT TYPE");
				System.exit(0);
			}
		}
	}
}
