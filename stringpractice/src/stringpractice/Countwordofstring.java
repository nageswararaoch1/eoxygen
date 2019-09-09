package stringpractice;

public class Countwordofstring {

/*	public static void main(String[] args) {
		int count=0;
String st="    India Is My Country";
char ch[]= new char[st.length()];  
for(int i=0;i<st.length();i++)  
{  
    ch[i]= st.charAt(i);  
    if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
        count++;  

}  
System.out.println(st+" words.");   */
	static int wordcount(String string)  
    {  
      int count=0;  
  
        char ch[]= new char[string.length()];     
        for(int i=0;i<string.length();i++)  
        {  
            ch[i]= string.charAt(i);  
            System.out.println(ch[i]);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count++;  
        }  
        return count;  
    }                                   
  public static void main(String[] args) {  
      String string ="India Is My Country";  
     System.out.println(wordcount(string) + " words."); 

}  


	}
