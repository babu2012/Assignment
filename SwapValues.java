package assignment;

import java.util.Scanner;

public class SwapValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("The numbers before swapping is:  "+num1+" "+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		
		System.out.println("The numbers after swapping is:  "+num1+" "+num2);
		

	}

}
