package assignment;

import java.util.Scanner;

public class Concatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String result="";
		for(int i=1;i<=num;i++) {
			result=result+i+" ";
		}
		System.out.println(result);
	}

}
