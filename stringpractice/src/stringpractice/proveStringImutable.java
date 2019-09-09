package stringpractice;
//write a java program to prove that strings are immutable in java
public class proveStringImutable {

	        public static void referenceCheck(Object x, Object y) {  
	            if (x == y) {  
	                System.out.println("Both pointing to the same reference");  
	       
	            } else {  
	                System.out.println("Both are pointing to different reference");  
	            }  
	        }  
	        public static void main(String[] args) {  
	            String st1 = "Java";  
	            String st2 = "Java";  
	            System.out.println("Before Modification in st1");  
	            referenceCheck(st1, st2);  
	            st1 += "ava";  
	            System.out.println("After Modification");  
	            referenceCheck(st1, st2);  
	        }  
	    }  
	/*
	 public class StringExamples
{
    public static void main(String[] args)
    {
        String s1 = "JAVA";
 
        String s2 = "JAVA";
 
        System.out.println(s1 == s2);         //Output : true
 
        s1 = s1 + "J2EE";
 
        System.out.println(s1 == s2);         //Output : false
    }
}

way to public class StringExamples
{
    public static void main(String[] args)
    {
        String s1 = new String("JAVA");
 
        System.out.println(s1);         //Output : JAVA
 
        s1.concat("J2EE");
 
        System.out.println(s1);         //Output : JAVA
    }
}

	 */

