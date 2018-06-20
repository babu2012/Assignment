package assignment;

import java.util.Scanner;

public class InvertTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no  ");
		int num=sc.nextInt();
		while(num>0) {
		for(int i=1;i<=num;i++) {
			
				System.out.print(" "+num+" ");
		}
		num--;
			System.out.print("\n");
		}
		}
	}


