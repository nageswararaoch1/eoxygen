package stringpractice;

public class FindDuplicateCharacters {

		 public static void main(String argu[]) {

		  String str = "w3schools";
		  int cnt = 1;
		  int count=0;
		  char[] inp = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		    	
		     System.out.println(inp[i]  );
		     count=cnt++;
		    
		     break;
		    }
System.out.println(str.charAt(i) + + count);
		   }
		  }
		 }}
		//http://seleniumone-by-arun.blogspot.com/2013/04/64-position-xpath-function.html


