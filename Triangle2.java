package assignment;

import java.util.Scanner;

public class Triangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;

       Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
       loop1: for(int i=1;i<=n;i++){

       for(int j=1;j<=i;j++){

                     if(c!=n){

                          c++;

                          System.out.print(c+" ");

                     }

                     else

                         break loop1;

                  }

                  System.out.print("\n");

               }
        
	}

}
