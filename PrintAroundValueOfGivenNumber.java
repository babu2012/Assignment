package assignment;

import java.util.Scanner;

public class PrintAroundValueOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any float value");
		double d=sc.nextDouble();
		System.out.println("Small Integer not less than the number: "+Math.ceil(d));
		System.out.println("given number is: "+d);
		System.out.println("Small Integer not greater than the number"+Math.floor(d));
	}

}
