package stringpractice;
//how do you swap two strings variables without using third or temp varaable in java
public class SwapTwoStringsno3Varible {

	    
		    public static void main(String args[]) 
		    { 
		        // Declare two strings 
		        String a = "Hello"; 
		        String b = "World"; 
		          
		        // Print String before swapping 
		        System.out.println("Strings before swap: a = " +  
		                                       a + " and b = "+b); 
		          
		        // append 2nd string to 1st 
		        a = a + b; 
		          
		        // store intial string a in string b 
		        b = a.substring(0,a.length()-b.length()); 
		          
		        // store initial string b in string a 
		        a = a.substring(b.length()); 
		          
		        // print String after swapping 
		        System.out.println("Strings after swap: a = " +  
		                                     a + " and b = " + b);         
		    }     
	}
/*
 * 
 * way 2
     public class SwapStrings   
    {  
        public static void main(String[] args) {  
            String str1 = "Good", str2 = "morning";  
              
            System.out.println("Strings before swapping: " + str1 + " " + str2);  
              
            //Concatenate both the string str1 and str2 and store it in str1  
            str1 = str1 + str2;  
            //Extract str2 from updated str1  
            str2 = str1.substring(0, (str1.length() - str2.length()));  
            //Extract str1 from updated str1  
            str1 = str1.substring(str2.length());  
              
            System.out.println("Strings after swapping: " + str1 + " " + str2);  
        }  
    }  
 */

