package assignment;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number:   ");
		 int num=sc.nextInt();

	      int n = num;

	      int check=0,remainder;

	      while(num > 0){

	           remainder = num % 10;

	           check = check + (int)Math.pow(remainder,3);

	           num = num / 10;

	      }

	      if(check == n)

	            System.out.println(n+" is an Armstrong Number");

	      else

	            System.out.println(n+" is not a Armstrong Number");

	   }

	}


