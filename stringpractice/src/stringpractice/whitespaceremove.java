package stringpractice;

public class whitespaceremove {
    /*public static void main(String[] args) {
        String sentence = "T    his is b  ett     er.";
        System.out.println("Original sentence: " + sentence);
        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
        
    }

}
*/ //2 way
	public static void main(String[] args) {  
        String str = "India     Is My    Country";  
        //1st way  
        String noSpaceStr = str.replaceAll("\\s", ""); // using built in method  
        System.out.println(noSpaceStr);  
        //2nd way  
        char[] strArray = str.toCharArray();  
        StringBuffer stringBuffer = new StringBuffer();  
        for (int i = 0; i < strArray.length; i++) {  
            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {  
                stringBuffer.append(strArray[i]);  }}}}