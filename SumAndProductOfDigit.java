package assignment;

import java.util.Scanner;

public class SumAndProductOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the digit");
int digit=sc.nextInt();
int temp=digit;
int result=0;

while(temp>0) {
	result=result+temp;
	temp--;
}
System.out.println("the sum of digit is: "+result);
temp=digit;
result=1;
while(temp>0) {

	result=result*temp;
	temp--;
}
System.out.println("the product of digit is: "+result);

	}

}
