package assignment;

import java.util.Scanner;

public class FactorialOfNumber {

	
	public static int fact(int a) {
		
		  if (a == 0)    
			    return 1;    
			  else    
			    return(a* fact(a-1));  
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		System.out.println(fact(i));

	}

}
