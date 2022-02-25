package assignment;

import java.util.Scanner;

class WeightLimitExceeds extends Exception{
	WeightLimitExceeds(int x){
		System.out.println(Math.abs(15-x)+"kg: ");
	}
}

public class Program17 {
	void validWeight(int weight) throws WeightLimitExceeds{
		if(weight>15) {
			throw new WeightLimitExceeds(weight);
		}else {
			System.out.println("you are ready to fly!!");
		}
	}

	public static void main(String[] args) {
		Program17 p17=new Program17();
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<2;i++) {
			try {
				p17.validWeight(scan.nextInt());
			} catch (WeightLimitExceeds e) {
				System.out.println(e);
			}
		}
	}
}
