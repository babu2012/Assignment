package assignment;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();		
int n = num;

        int reverse=0,remainder;

        while(num > 0){

              remainder = num % 10;
             

              reverse = reverse * 10 + remainder;

              num = num / 10;

         }

        String result=""; //contains the actual output
System.out.println(reverse);
        while(reverse > 0){

             remainder = reverse % 10;

             reverse = reverse / 10;

             switch(remainder){

                  case 0 :

                           result = result + "Zero ";

                           break;

                  case 1 :

                           result = result + "One ";

                           break;

                  case 2 :

                           result = result + "Two ";

                           break;

                  case 3 :

                           result = result + "Three ";

                           break;

                  case 4 :

                           result = result + "Four ";

                           break;

                  case 5 :

                           result = result + "Five ";

                           break;

                  case 6 :

                           result = result + "Six ";

                           break;

                  case 7 :

                           result = result + "Seven ";

                           break;

                  case 8 :

                           result = result + "Eight ";

                           break;

                  case 9 :

                           result = result + "Nine ";

                           break;

                  default:

                           result="";

               }

          }

              System.out.println(result);
	}

}
