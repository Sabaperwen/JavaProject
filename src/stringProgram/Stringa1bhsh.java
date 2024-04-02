package stringProgram;

public class Stringa1bhsh {

	public static void main(String[] args) {
     String s1="a1b&3$c";//abc13&$
     String alpha="";
     String number="";
     String spclChar="";
     
     for(int i=0;i<s1.length();i++)
     {
    	 char c=s1.charAt(i);
    	 if(c>='A' && c<= 'Z' || c>='a' && c<='z')
    	 {
    		 alpha=alpha+c;
    	 }
    	 else if(c>='0' && c<='9')
    	 {
    		 number=number+c;
    	 }
    	 else {
    		 spclChar=spclChar+c;
    	 }
     }
     System.out.println(alpha+number+spclChar);
	}

}
