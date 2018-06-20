package assignment;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no  ");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+i+" ");
			}
			System.out.print("\n");
		}
		

	}

}
