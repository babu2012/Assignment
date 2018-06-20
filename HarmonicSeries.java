package assignment;

import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
          int num=sc.nextInt();
	      double result = 0.0;

	      while(num > 0){

	            result = result + (double) 1 / num;

	            num--;

	      }

	      System.out.println("Output of Harmonic Series is "+result);
	}

}
