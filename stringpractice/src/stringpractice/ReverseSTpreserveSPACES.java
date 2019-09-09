package stringpractice;
/*
public class ReverseSTpreserveSPACES {
	public static void reverseString(String str){
        int len = str.length();
        char arr[] = str.toCharArray();
        for(int i=0, j = len-1; i<=j; i++,j--){
            if(arr[i] == ' ') i++;
            if(arr[j] == ' ') j--;

            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;

        }
        System.out.println(arr);

}}
*/
class ReverseSTpreserveSPACES {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        for(String word : words){
            word = reverseWord(word);

        }

        return String.join(" ", words);
    }



    public String reverseWord(String s){
        char[] letters = s.toCharArray();
        s="";
        for(int i=letters.length-1;i>=0;i--){
            s=s + letters[i];
        }
            return s;
        }

    }