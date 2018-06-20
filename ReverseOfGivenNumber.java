package assignment;

import java.util.Scanner;

public class ReverseOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

          int remainder, result=0;

          while(num>0){

              remainder = num%10;

              result = result * 10 + remainder;

              num = num/10;

         }

         System.out.println("Reverse number is : "+result);
	}

}
