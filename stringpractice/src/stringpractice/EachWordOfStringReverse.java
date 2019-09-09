package stringpractice;
//write a java program to reverse each word of a given string

public class EachWordOfStringReverse {
	public static String reverseWord(String str){  
	    String words[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    return reverseWord.trim();  
	}  

	public static void main(String[] args) {
		    System.out.println(EachWordOfStringReverse.reverseWord("my name is khan"));  
		    System.out.println(EachWordOfStringReverse.reverseWord("I am sonoo jaiswal"));    
		    }  

	}

