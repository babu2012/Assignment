package assignment;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);  
		System.out.println("enter the number");
		
int num=sc.nextInt();
       

         int f1, f2=0, f3=1;

         for(int i=1;i<=num;i++){

            System.out.print(" "+f3+" ");

            f1 = f2;

            f2 = f3;

            f3 = f1 + f2;

         }

  }
	}


