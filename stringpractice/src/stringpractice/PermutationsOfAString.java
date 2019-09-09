package stringpractice;
//write a program to find all permutations of a string in java
public class PermutationsOfAString {
	
	public static void main(String args[]) {
        permutation("ABC");
        permutation("123");

    }

   
 /*
  * A method exposed to client to calculate permutation of String in Java. 
  */
   public static void permutation(String input){
          permutation("", input);
   }

   /*
    * Recursive method which actually prints all permutations
    * of given String, but since we are passing an empty String
    * as current permutation to start with,
    * I have made this method private and didn't exposed it to client. 
    */
   private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.err.println(perm + word);

        } else {
            for (int i = 0; i<word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0, i) 
                                        + word.substring(i + 1, word.length()));
            }
        }

    }
}


//Read more: https://javarevisited.blogspot.com/2015/08/how-to-find-all-permutations-of-string-java-example.html#ixzz5tFbCJiI5

	
	
	
	
	
	
	/*public static void main(String[] args) 
    { 
        String str = "ABC"; 
        int n = str.length(); 
        PermutationsOfAString permutation = new PermutationsOfAString(); 
        permutation.swap(str, 0, n - 1); 
    } public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i]; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
} */

/*
 
 */

