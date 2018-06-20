package assignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		 int n = num; //used at last time check

         int reverse=0,remainder;

         while(num > 0){

               remainder = num % 10;
               System.out.println(remainder);

               reverse = reverse * 10 + remainder;
               
               System.out.println(reverse);

               num = num / 10;
               
               System.out.println(num);

          }

         if(reverse == n)

             System.out.println(n+" is a Palindrome Number");

         else

             System.out.println(n+" is not a Palindrome Number");

    }

	}


