package assignment;

public class DectToBOH {
	
	
	
	static void decToBinary(int n)
    {
        
        int[] binaryNum = new int[1000];
  
       
        int i = 0;
        while (n > 0) 
        {
            
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
  
       
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
	
	
	static void decToOctal(int n)
    {
        
        int[] octalNum = new int[100];
 
       
        int i = 0;
        while (n != 0) 
        {
           
            octalNum[i] = n % 8;
            n = n / 8;
            i++;
        }
 
       
        for (int j = i - 1; j >= 0; j--)
            System.out.print(octalNum[j]);
    }
	static void decToHexa(int n)
	    {   
	       
	        char[] hexaDeciNum = new char[100];
	      
	      
	        int i = 0;
	        while(n!=0)
	        {   
	           
	            int temp  = 0;
	          
	           
	            temp = n % 16;
	          
	           
	            if(temp < 10)
	            {
	                hexaDeciNum[i] = (char)(temp + 48);
	                i++;
	            }
	            else
	            {
	                hexaDeciNum[i] = (char)(temp + 55);
	                i++;
	            }
	          
	            n = n/16;
	        }
	      
	 
	        for(int j=i-1; j>=0; j--)
	            System.out.print(hexaDeciNum[j]);
	    }
	     
	    
	 


	public static void main(String[] args) {
		
		int n = 2545;
        decToHexa(n);
        System.out.print("\n");
        decToBinary(n);
        System.out.print("\n");
        decToOctal(n);
	}

}
