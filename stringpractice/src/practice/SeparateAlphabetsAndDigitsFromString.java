package practice;

	public class SeparateAlphabetsAndDigitsFromString {
	       public static void main(String[] args) {
	              String input = "1a2b(3c@4defgh#567jk*l)";
	              separateDigitsAndAlphabets(input);
	       }

	       public static void separateDigitsAndAlphabets(String str) {
	              String number = "";
	              String letter = "";
	              String specialCharacter="";
	              for (int i = 0; i < str.length(); i++) {
	                     char a = str.charAt(i);
	                     if (Character.isDigit(a)) {
	                           number = number + a;

	                     } 
	                     else if(Character.isAlphabetic(a)){
	                    	 
	                    	 letter+=a;
	                     }
	                     else {
	                    	 specialCharacter = specialCharacter + a;

	                     }
	              }
	              System.out.println("Alphates in string:"+letter);
	              System.out.println("Numbers in String:"+number);
	              System.out.println("Numbers in sp:"+specialCharacter);

	       }
	}

