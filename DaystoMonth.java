package assignment;

import java.util.Scanner;

public class DaystoMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of days:  ");
		int num=sc.nextInt();
		
		int days=num%30;
		
		int months=num/30;
		
		
		System.out.println(months+" months "+days+" days ");
		
		
		

	}

}
