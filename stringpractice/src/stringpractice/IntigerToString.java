package stringpractice;

public class IntigerToString {

	public static void main(String[] args) {
		{
	        int i = 2015;
	         
	        String s = Integer.toString(i);
	         
	        System.out.println(s);     //Output : 2015
	    }
		
		{
	        int i = 2015;
	         
	        String s = String.valueOf(i);
	         
	        System.out.println(s);     //Output : 2015
	    }
	}

}
