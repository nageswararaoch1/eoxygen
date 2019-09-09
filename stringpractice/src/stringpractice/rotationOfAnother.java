package stringpractice;

public class rotationOfAnother {
		   public static void main(String args[]){
		      String str1 = "gala";
		      String str2 = "alag";
		      String s3 = str1+str1;
		      if(s3.contains(str2)) {
		         System.out.println("str1 is rotation of str2");
		      } else {
		         System.out.println("str1 is not rotation of str2");
		      }
		   }
}