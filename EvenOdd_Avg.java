package assignment;

import java.util.Scanner;

public class EvenOdd_Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

	      int countEven=0, countOdd=0,sumEven=0,sumOdd=0;

	      while(n > 0){

	           if(n%2==0){

	               countEven++;

	               sumEven = sumEven + n;

	           }

	           else{

	               countOdd++;

	               sumOdd = sumOdd + n;

	           }

	           n--;

	      }

	      int evenAvg,oddAvg;

	      evenAvg = sumEven/countEven;

	      oddAvg = sumOdd/countOdd;

	      System.out.println("Average of first N Even no is "+evenAvg);

	      System.out.println("Average of first N Odd no is "+oddAvg);

	 sc.close();
	}

}
